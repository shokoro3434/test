package jp.ac.nct.hr;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Method;


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
					return new File(dir.getPath() + "/" + name).isDirectory();
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
			TargetCleaner.main(new String[] { csv.getPath(), csv.getPath() + ".in", tokenOrigin });
		}
		File[] inFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".in");
			}
		});
		for (File in : inFiles) {
			HorseRaceAnalyzer.main(new String[] { in.getPath(), in.getPath() + ".out", "-1" });
		}
		File[] outFiles = rootPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".out");
			}
		});
		for (File out : outFiles) {
			HorseRaceAnalyzer2.main(new String[] { out.getPath() });
			SVGBuilder.main(new String[] { out.getPath() });
		}

	}
}
