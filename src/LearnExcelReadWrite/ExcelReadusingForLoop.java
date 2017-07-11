package LearnExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadusingForLoop {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\dramachandra\\workspace\\LearnAutomation\\src\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		String data=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		for(int i=0;i<rowcount;i++)
		{
			String data1=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data1);
		}

	}

}
