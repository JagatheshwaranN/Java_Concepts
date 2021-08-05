package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcelWithBackGroundColors {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("BG_Color");
		XSSFRow row = sheet.createRow(1);
		XSSFCell cell;

		// Background color fill
		XSSFCellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		cell = row.createCell(1);
		cell.setCellValue("Welcome");
		cell.setCellStyle(style);

		// Foreground color fill
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell = row.createCell(2);
		cell.setCellValue("Excel");
		cell.setCellStyle(style);

		FileOutputStream fileOutputStream = new FileOutputStream(".\\dataFiles\\bgColorFill.xlsx");
		workbook.write(fileOutputStream);
		workbook.close();
		fileOutputStream.close();		
		System.out.println("Write into excel with bg and fg color fill is complete");
	}
}
