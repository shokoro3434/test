package jp.ac.nct.hr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.opencsv.CSVWriter;

public class TargetCleaner {
	public static void main(String[] args) {
		new TargetCleaner().perform(args);
	}
	private List<String> toList(CSVRecord rec){
		System.err.println (rec);
		System.err.println (rec.size());
		List<String> list = new ArrayList<String>();
		//list.add(rec.get(2)+":"+rec.get(7));
		list.add(rec.get(2));
		final int INDEX_ORIGIN = 24;
		final int TOKEN_DISTANCE = 4;
		for (int i = INDEX_ORIGIN ; i < rec.size() ; i += TOKEN_DISTANCE){
			String token = rec.get(i);
			if (token.isEmpty()){
				break;
			}
			list.add(token.trim());
		}
		System.err.println(list);
		return list;
	}
	private void perform(String [] args){
		try{
			File csvData = new File(args[0]);
			CSVParser parser = CSVParser.parse(csvData, Charset.forName("MS932"),CSVFormat.RFC4180);
			CSVWriter writer = new CSVWriter(new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream(args[1]), "UTF-8")),
					',', '"', "\r\n");
			//header
			writer.writeNext(new String[] { "num", "ln" });
			for (CSVRecord record : parser) {
				if (record.getRecordNumber() == 1) {
					// CSV Header
					continue;
				}
				List<String> list = toList(record);
				String[] stringArray = (String []) list.toArray(new String[0]);
				writer.writeNext(stringArray);
			}
			parser.close();
			writer.close();
		}
		catch(Exception e){
		}
		finally{
		}
	}
}
