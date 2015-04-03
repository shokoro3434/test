package jp.ac.nct.hr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
	public static void main(String[] args) throws Exception{
		new TargetCleaner().perform(args);
	}
	private List<String> toList(CSVRecord rec,int origin){
		System.err.println (rec);
		System.err.println (rec.size());
		List<String> list = new ArrayList<String>();
		//list.add(rec.get(2)+":"+rec.get(7));
		list.add(rec.get(2));//num
		final int INDEX_ORIGIN = origin;
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
	private void perform(String [] args) throws IOException{
		CSVParser parser = null;
		CSVWriter writer = null;
		try{
			File csvData = new File(args[0]);
			writer = new CSVWriter(new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream(args[1]), "UTF-8")),
					',', '"', "\r\n");
			parser = CSVParser.parse(csvData, Charset.forName("MS932"),CSVFormat.RFC4180);
			//header
			writer.writeNext(new String[] { "num", "ln" });
			for (CSVRecord record : parser) {
				if (record.getRecordNumber() == 1) {
					// CSV Header
					continue;
				}
				List<String> list = toList(record,Integer.valueOf(args[2]));
				String[] stringArray = (String []) list.toArray(new String[0]);
				writer.writeNext(stringArray);
			}
		}
		catch(Exception e){
		}
		finally{
			if (parser != null){
				parser.close();
			}
			if (writer != null){
				writer.close();
			}
		}
	}
}
