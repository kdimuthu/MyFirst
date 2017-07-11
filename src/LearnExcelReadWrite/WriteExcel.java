package LearnExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{
	public static void main(String[] args) throws Exception 
	{
		File src=new File("C:\\Users\\dramachandra\\workspace\\LearnAutomation\\src\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		sheet.getRow(0).createCell(2).setCellValue("Pass");
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);
		wb.close();			
		int rowcount=sheet.getLastRowNum();
		rowcount=rowcount+1;
		System.out.println("Row count is"+" "+rowcount);
		

		
	}}

