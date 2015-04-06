package jp.ac.nct.hr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.math3.stat.StatUtils;

import com.opencsv.CSVWriter;

public class HorseRaceAnalyzer {

	public static void main(String[] args) throws Exception {
		new HorseRaceAnalyzer().perform(args);
	}

	private void perform(String[] args) throws Exception {
		File csvData = new File(args[0]);
		CSVParser parser = CSVParser.parse(csvData, Charset.defaultCharset(),
				CSVFormat.RFC4180);
		CSVWriter writer = new CSVWriter(new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(args[1]), "UTF-8")),
				',', '"', "\r\n");
		writer.writeNext(new String[] { "num", "y", "available","regressionEquation","last_y","last2_y","last3_y",//"populationVariance_y",
				"standard_deviation", "mean_y", "max_y", "min_y","y_plus_standard_deviation","y_minus_standard_deviation" });
		for (CSVRecord record : parser) {
			if (record.getRecordNumber() == 1) {
				// CSV Header
				continue;
			}
			HorseProperties hp = RaceUtils.createHorseProperties(record,
					Integer.valueOf(args[2]));
			System.out.println("num: " + hp.getNumberAsString()
					+ ",available race count: " + hp.getAvailableRaceCount()
					+ ",y: " + hp.getY());
			System.out.println("num:" + hp.getNumberAsString() + " の母分散: "
					+ StatUtils.populationVariance(hp.getTimeIndexArray()));
			System.out.println("num:"
					+ hp.getNumberAsString()
					+ " の標準偏差: "
					+ Math.sqrt(StatUtils.populationVariance(hp
							.getTimeIndexArray())));
			System.out.println("num:" + hp.getNumberAsString() + " の平均: "
					+ StatUtils.mean(hp.getTimeIndexArray()));
			System.out.println("num:" + hp.getNumberAsString() + " の最大: "
					+ StatUtils.max(hp.getTimeIndexArray()));
			System.out.println("num:" + hp.getNumberAsString() + " の最小: "
					+ StatUtils.min(hp.getTimeIndexArray()));

			
			double standard_deviation = Math.sqrt(StatUtils.populationVariance(hp
					.getTimeIndexArray()));
			
			writer.writeNext(new String[] {
					hp.getNumberAsString(),
					StringUtils.toAvailableFormat(hp.getY()),
					String.valueOf(hp.getAvailableRaceCount()),
					hp.getRegressionEquation(),
					StringUtils.toAvailableFormat(hp.getLastY()),
					StringUtils.toAvailableFormat(hp.getLast2y()),
					StringUtils.toAvailableFormat(hp.getLast3y()),
//					String.valueOf(StatUtils.populationVariance(hp
//							.getTimeIndexArray())),
					StringUtils.toAvailableFormat(standard_deviation),
					StringUtils.toAvailableFormat(StatUtils.mean(hp.getTimeIndexArray())),
					StringUtils.toAvailableFormat(StatUtils.max(hp.getTimeIndexArray())),
					StringUtils.toAvailableFormat(StatUtils.min(hp.getTimeIndexArray())),
					StringUtils.toAvailableFormat(hp.getY() + standard_deviation),
					StringUtils.toAvailableFormat(hp.getY() - standard_deviation)
					});

		}
		writer.close();
		parser.close();
	}
}
