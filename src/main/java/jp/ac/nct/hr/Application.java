package jp.ac.nct.hr;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Method;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Application {
	public static void main(String[] args) throws Exception {
		new Application().method();
	}

	@TargetDirectories(targetDirectories = { "./src/main/resources/2015/f/1/1", "./src/main/resources/2015/f/1/2",
			"./src/main/resources/2015/n/3/5", "./src/main/resources/2015/n/3/6", "./src/main/resources/2015/h/2/5",
			"./src/main/resources/2015/h/2/6", }, tokenOrigin = "21")
	private void method() throws Exception {
		Method m = Application.class.getDeclaredMethod("method", new Class[] {});
		TargetDirectories td = m.getAnnotation(TargetDirectories.class);

		for (String r : td.targetDirectories()) {
			File rootPath = new File(r);
			File[] directories = rootPath.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return new File(dir.getAbsolutePath() + "/" + name).isDirectory();
				}

			});
			if (directories.length != 0) {
				for (File directory : directories) {
					invoke(directory, td.tokenOrigin());
				}
			} else {
				invoke(rootPath, td.tokenOrigin());
			}

		}
		String series1 = "First";
		String series2 = "Second";
		String series3 = "Third";
		// カテゴリーの設定
		String category1 = "Category 1";
		String category2 = "Category 2";
		String category3 = "Category 3";
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(1.0, series1, category1);
		dataset.addValue(4.0, series1, category2);
		dataset.addValue(5.0, series1, category3);

		dataset.addValue(5.0, series2, category1);
		dataset.addValue(7.0, series2, category2);
		dataset.addValue(7.0, series2, category3);

		dataset.addValue(6.0, series3, category1);
		dataset.addValue(8.0, series3, category2);
		dataset.addValue(8.0, series3, category3);

		JFreeChart chart = ChartFactory.createBarChart("Sample Bar Chart",
				"Category", "Value", dataset, PlotOrientation.VERTICAL, true,
				true, false);
		File outputFile = new File("./target/SampleBarChart.png");
		try {
				ChartUtilities.saveChartAsPNG(outputFile, chart, 500, 500);
			} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
	}

	private void invoke(File rootPath, String tokenOrigin) throws Exception {
		File[] csvFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".csv") && !name.endsWith("r.csv");
			}
		});
		for (File csv : csvFiles) {
			TargetCleaner.main(new String[] { csv.getAbsolutePath(), csv.getAbsolutePath() + ".in", tokenOrigin });
		}
		File[] inFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".in");
			}
		});
		for (File in : inFiles) {
			HorseRaceAnalyzer.main(new String[] { in.getAbsolutePath(), in.getAbsolutePath() + ".out", "-1" });
		}
		File[] outFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".out");
			}
		});
		for (File out : outFiles) {
			HorseRaceAnalyzer2.main(new String[] { out.getAbsolutePath() });
		}

	}
}
