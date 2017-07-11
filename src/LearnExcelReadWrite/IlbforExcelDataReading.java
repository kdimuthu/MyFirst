package LearnExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IlbforExcelDataReading {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public IlbforExcelDataReading(String excelPath) {
		
		try {
			File f1=new File(excelPath);
			FileInputStream fis=new FileInputStream(f1);
			wb=new XSSFWorkbook(fis);
				
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNumber, int row, int col){	
		sheet1=wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;	
		
	}
	
	public int getRowCount(int sheetIndex)
	{
		
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
	
	public Sheet getSheetNum(int sheetID)
	{
		Sheet data=wb.getSheetAt(sheetID);
		return data;
	}

}
