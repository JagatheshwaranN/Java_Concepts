package excelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteDataFromFormulaCell {

	public static void readFormulaCell() throws IOException {

		FileInputStream fileInputStream = new FileInputStream(".\\dataFiles\\readFormulaData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(1).getLastCellNum();

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < columns; c++) {
				XSSFCell cell = row.getCell(c);

				switch (cell.getCellType()) {
				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				default:
					break;
				}
				System.out.print("|");
			}
			System.out.println();
		}
		workbook.close();
		fileInputStream.close();
	}

	public static void writeFormulaCell() throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Numbers");

		XSSFRow row1 = sheet.createRow(0);
		XSSFRow row2 = sheet.createRow(1);
		XSSFRow row3 = sheet.createRow(2);
		row1.createCell(0).setCellValue(10);
		row1.createCell(1).setCellValue(20);
		row1.createCell(2).setCellFormula("A1*B1");
		row2.createCell(0).setCellValue(20);
		row2.createCell(1).setCellValue(30);
		row2.createCell(2).setCellFormula("A2*B2");
		row3.createCell(2).setCellFormula("SUM(C1:C2)");

		FileOutputStream fileOutputStream = new FileOutputStream(".\\dataFiles\\writeFormulaData.xlsx");
		workbook.write(fileOutputStream);
		fileOutputStream.close();
		workbook.close();
		System.out.println("Write formula data into excel is complete");
	}

	public static void main(String ar[]) throws IOException {
		ReadAndWriteDataFromFormulaCell.readFormulaCell();
		ReadAndWriteDataFromFormulaCell.writeFormulaCell();
	}
}
