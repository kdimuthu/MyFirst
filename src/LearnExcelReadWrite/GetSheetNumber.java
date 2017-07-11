package LearnExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetSheetNumber {

	   public static void main(String[] args) {
	       GetSheetNumber xread2 = new GetSheetNumber();
	   }

	   public GetSheetNumber() {
	       getvalue_1();
	   }

	   public static void getvalue_1() {
	       XSSFRow row;
	       XSSFCell cell;
	       String[][] value = null;
	       double[][] nums = null;

	       try {
	           FileInputStream inputStream = new FileInputStream("C:\\Users\\dramachandra\\workspace\\LearnAutomation\\TestData.xlsx");
	           XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

	           // get sheet number
	           int sheetCn = workbook.getNumberOfSheets();
	           
	           System.out.println("sheet num is"+""+sheetCn);

	           for (int cn = 0; cn < sheetCn; cn++) {

	               // get 0th sheet data
	               XSSFSheet sheet = workbook.getSheetAt(cn);

	               // get number of rows from sheet
	               int rows = sheet.getPhysicalNumberOfRows();

	               // get number of cell from row
	               int cells = sheet.getRow(cn).getPhysicalNumberOfCells();

	               value = new String[rows][cells];

	               for (int r = 0; r < rows; r++) {
	                   row = sheet.getRow(r); // bring row
	                   if (row != null) {
	                       for (int c = 0; c < cells; c++) {
	                           cell = row.getCell(c);
	                           nums = new double[rows][cells];

	                           if (cell != null) {

	                               switch (cell.getCellType()) {

	                               case XSSFCell.CELL_TYPE_FORMULA:
	                                   value[r][c] = cell.getCellFormula();
	                                   break;

	                               case XSSFCell.CELL_TYPE_NUMERIC:
	                                   value[r][c] = ""
	                                        + cell.getNumericCellValue();
	                                   break;

	                               case XSSFCell.CELL_TYPE_STRING:
	                                   value[r][c] = ""
	                                        + cell.getStringCellValue();
	                                   break;

	                               case XSSFCell.CELL_TYPE_BLANK:
	                                  value[r][c] = "[BLANK]";
	                                  break;

	                               case XSSFCell.CELL_TYPE_ERROR:
	                                  value[r][c] = ""+cell.getErrorCellValue();
	                                break;
	                            default:
	                            }
	                          //  System.out.print(value[r][c]);

	                        } else {
	                          //  System.out.print("[null]\t");
	                        }
	                    } // for(c)
	                    System.out.print("\n");
	                }
	            } // for(r)
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	  }
	}
