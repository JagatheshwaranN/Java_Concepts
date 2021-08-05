package excelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HasMapToExcelAndExcelToHashMap {

	public static void hashMapToExcel() throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("StudentData");
		Map<String, String> data = new LinkedHashMap<String, String>();
		data.put("StudentId", "StudentName");
		data.put("101", "John");
		data.put("102", "Smith");

		int rowno = 0;
		for (Map.Entry<String, String> entry : data.entrySet()) {
			XSSFRow row = sheet.createRow(rowno++);
			row.createCell(0).setCellValue((String) entry.getKey());
			row.createCell(1).setCellValue((String) entry.getValue());
		}
		FileOutputStream fileOutputStream = new FileOutputStream(".\\dataFiles\\WriteDataFromMap.xlsx");
		workbook.write(fileOutputStream);
		fileOutputStream.close();
		workbook.close();
		System.out.println("Write data into excel from hash map is complete");
	}

	public static void excelToHashMap() throws IOException {
		FileInputStream fileInputStream = new FileInputStream(".\\dataFiles\\readDataToMap.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		Map<String, String> data = new LinkedHashMap<String, String>();

		for (int r = 0; r <= rows; r++) {
			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();
			data.put(key, value);
		}

		for (Map.Entry<String, String> entry : data.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		fileInputStream.close();
		workbook.close();
	}
	public static void main(String[] args) throws IOException {
		HasMapToExcelAndExcelToHashMap.hashMapToExcel();
		HasMapToExcelAndExcelToHashMap.excelToHashMap();
	}
}
