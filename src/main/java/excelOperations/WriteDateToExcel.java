package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDateToExcel {

	public static void main(String ar[]) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DateFormat");

		// To format the date value to enter into excel
		CreationHelper creationHelper = workbook.getCreationHelper();
		CellStyle style = workbook.createCellStyle();
		style.setDataFormat(creationHelper.createDataFormat().getFormat("dd-mm-YYYY"));

		XSSFCell cell = sheet.createRow(0).createCell(0);
		cell.setCellValue(new Date());
		cell.setCellStyle(style);
		FileOutputStream fileOutputStream = new FileOutputStream(".\\dataFiles\\dateWrite.xlsx");
		workbook.write(fileOutputStream);
		workbook.close();
		fileOutputStream.close();
		System.out.println("Done!");
	}
}
