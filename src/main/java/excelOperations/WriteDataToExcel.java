package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFWorkbook workbook1 = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("StudentData");
		XSSFSheet sheet1 = workbook1.createSheet("StudentData");

		Object[][] stddata = { { "StudentId", "StudentName" }, { 101, "John" }, { 102, "Smith" } };
		int rows = stddata.length;
		int columns = stddata[0].length;
		System.out.println("Rows : " + rows);
		System.out.println("Columns : " + columns);

		// Using For loop
		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.createRow(r);
			for (int c = 0; c < columns; c++) {
				XSSFCell cell = row.createCell(c);

				Object value = stddata[r][c];
				if (value instanceof String)
					cell.setCellValue((String) value);
				else if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				else if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}
		FileOutputStream fileOutputStream = new FileOutputStream(".\\dataFiles\\writeData1.xlsx");
		workbook.write(fileOutputStream);
		fileOutputStream.close();
		System.out.println("Write data into excel using for loop is complete");

		System.out.println("************************************************************");

		// Using For each loop
		int rowCount = 0;
		for (Object[] student : stddata) {
			XSSFRow row = sheet.createRow(rowCount++);
			int columnCount = 0;
			for (Object value : student) {
				XSSFCell cell = row.createCell(columnCount++);
				if (value instanceof String)
					cell.setCellValue((String) value);
				else if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				else if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}
		FileOutputStream fileOutputStream1 = new FileOutputStream(".\\dataFiles\\writeData2.xlsx");
		workbook.write(fileOutputStream1);
		fileOutputStream1.close();
		System.out.println("Write data into excel using for each loop is complete");

		System.out.println("************************************************************");

		// Using ArrayList
		ArrayList<Object[]> arlist = new ArrayList<Object[]>();
		arlist.add(new Object[] { "StudentId", "StudentName" });
		arlist.add(new Object[] { 101, "John" });
		arlist.add(new Object[] { 102, "Alex" });

		int rowCount1 = 0;
		for (Object[] data : arlist) {
			XSSFRow row = sheet1.createRow(rowCount1++);
			int columnCount1 = 0;
			for (Object value : data) {
				XSSFCell cell = row.createCell(columnCount1++);
				if (value instanceof String)
					cell.setCellValue((String) value);
				else if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				else if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}
		FileOutputStream fileOutputStream2 = new FileOutputStream(".\\dataFiles\\writeData3.xlsx");
		workbook1.write(fileOutputStream2);
		fileOutputStream2.close();
		workbook.close();
		workbook1.close();
		System.out.println("Write data into excel using array list and for each loop is complete");
	}
}
