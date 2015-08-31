package jp.ac.nct.hr;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class POI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new POI ().perform();
	}

	private void perform() {
		try {
			// Excelのワークブックを読み込みます。
			POIFSFileSystem filein = new POIFSFileSystem(new FileInputStream(
					"C:\\Users\\takahiro\\git\\test6767\\2015_HANSHIN.ods"));
			HSSFWorkbook wb = new HSSFWorkbook(filein);
			// シートを読み込みます。
			HSSFSheet sheet = wb.getSheet("サンプルSheet");
			// 3行目の値を読み込みます。
			HSSFRow row = sheet.getRow(2);
			// getStringCellValueにて文字列を読み込みます。
			HSSFCell cell = row.getCell((short) 1);
			String shopName = cell.getStringCellValue();
			// getDateCellValueにて日付を読み込みます。
			cell = row.getCell((short) 2);
			Date inputDate = cell.getDateCellValue();
			// 6行目から17行目の値を読み込みます。
			int sum = 0; // 合計金額を保存する変数
			for (int i = 5; i <= 16; i++) {
				// getNumericCellValueにて数字を読み込みます。
				row = sheet.getRow(i);
				cell = row.getCell((short) 2);
				sum = sum + (int) cell.getNumericCellValue();
			}
			// Excelから読み込んだ結果を出力します。
			System.out.println(shopName + "の年間売上は" + sum + "円です。");
			System.out.println(new SimpleDateFormat("yyyy/MM/dd")
					.format(inputDate) + "入力");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("処理が失敗しました");
		}
	}
}
