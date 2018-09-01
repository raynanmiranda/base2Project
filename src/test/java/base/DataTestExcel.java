package base;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTestExcel {

	public String cellValue = null;
	
	public void readDataExcel(int getRow, int getCell) throws IOException {
		
				
		FileInputStream file = new FileInputStream("E:\\JavaProjects\\base2Project\\TestData.xlsx");
	
		XSSFWorkbook wbData = new XSSFWorkbook(file);
		XSSFSheet sheet = wbData.getSheet("Planilha1");
		
		Row row = sheet.getRow(getRow);
		Cell cell = row.getCell(getCell);
	
		wbData.close();
		
		cellValue = cell.getStringCellValue();
		
		
	}
	
}
