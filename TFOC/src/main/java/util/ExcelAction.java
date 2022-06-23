package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAction {

	private static XSSFWorkbook wb;
	private static XSSFSheet sh;
	private static XSSFRow row;
	private static XSSFCell cell;

	public void setExcelFile(String excelFilePath, String sheetName) throws IOException {

		File file = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetName);

	}

	public String getCellData(int rowNumber, int cellNumber) {

		cell = sh.getRow(rowNumber).getCell(cellNumber);
		return cell.getStringCellValue();
	}

	public int getRowCountInSheet() {
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		return rowcount;
	}

	public void setCellValue(int rowNum, int cellNum, String cellValue, String excelFilePath) throws IOException {

		sh.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);

		FileOutputStream outputStream = new FileOutputStream(excelFilePath);
		wb.write(outputStream);
	}
}
