package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook wbook =new XSSFWorkbook("./Data/Book1.xlsx");
		XSSFSheet sheet = wbook.getSheet("Create");
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(5).getLastCellNum();
		
		
		String [][] newString = new String [lastRowNum][lastCellNum];
		
		
		for (int j = 5; j <= lastRowNum; j++) {
		XSSFRow row = sheet.getRow(j);
			//for (int i = 3; i < lastCellNum; i++) {
		XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				System.out.println(value);
				newString [i][j]= value;
			} 
			
		}
	}

}
