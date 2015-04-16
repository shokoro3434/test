package jp.ac.nct.hr;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.ac.nct.math.MathUtils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.math3.stat.StatUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class SVGBuilder {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new SVGBuilder().perform(args[0]);
	}

	private void perform(String src) throws Exception {
		List<RecordProperties> recList = retrieveY(src);
		if (recList == null) {
			return;
		}
		List<Double> yList = RaceUtils.toDoubleList(recList);
		Double[] doubleArray = (Double[]) yList.toArray(new Double[0]);
		double[] primitiveDoubleArray = ArrayUtils.toPrimitive(doubleArray);
		Arrays.sort(primitiveDoubleArray);
		ArrayUtils.reverse(primitiveDoubleArray);

		double mean = StatUtils.mean(primitiveDoubleArray);
		System.out.println("mean:" + mean);
		double stddev = Math.sqrt(StatUtils.populationVariance(primitiveDoubleArray));
		String category1 = "";
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (double token : primitiveDoubleArray) {
			System.out.print(token + ": ");
			double deviation = MathUtils.toDeviation(token, mean, stddev);
			System.out.print("[" + RaceUtils.toNum(token, recList) + "]: ");
			System.out.println(deviation);
			dataset.addValue(deviation, String.valueOf(RaceUtils.toNum(token, recList)), category1);
		}
		JFreeChart chart = ChartFactory.createBarChart(src, "stddev: "+String.valueOf(stddev), "deviation", dataset,
				PlotOrientation.VERTICAL, true, true, false);
		File outputFile = new File(src+".png");
		try {
			ChartUtilities.saveChartAsPNG(outputFile, chart, 500, 500);
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
	}

	private List<RecordProperties> retrieveY(String src) throws Exception {
		File csvData = new File(src);
		CSVParser parser = null;
		try {
			parser = CSVParser.parse(csvData, Charset.defaultCharset(), CSVFormat.RFC4180);
			List<RecordProperties> dst = new ArrayList<RecordProperties>();
			for (CSVRecord record : parser) {
				if (record.getRecordNumber() == 1) {
					// CSV Header
					continue;
				}
				// System.out.println (record);
				dst.add(RaceUtils.createRecordProperties(Double.valueOf(record.get(1)), Integer.parseInt(record.get(0))));
			}
			return dst;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (parser != null) {
				parser.close();
			}
		}
		return null;
	}

}
