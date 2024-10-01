package SeleniumAutomation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Redbusexcel {

public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		String path = "C:\\Users\\c.JERVIN\\Documents\\Redbus.xlsx";
		
		File file = new File(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
	for (int i = 0; i<=sheet.getLastRowNum(); i++){
		XSSFRow row = sheet.getRow(i);
		
		for(int j=0; j<=row.getLastCellNum(); j++) {
			XSSFCell cell = row.getCell(j);
			System.out.print(cell);
			System.out.print(" | ");
		}
	}
}
	

}
