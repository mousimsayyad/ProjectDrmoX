package day32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ExcelFile===>workbook===>sheet==>rows==>cells
public class ReadingExcel {

	private static final String User = null;

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\BooksData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");   //workbook.getSheetAt(0);
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("no of rows: "+totalrows);
		System.out.println("no of cells: "+totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow CurrentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				//XSSFCell cell=CurrentRow.getCell(c);
				//String value=cell.toString();
				System.out.print(CurrentRow.getCell(c).toString()+"      ");
			}
			System.out.println();
		}
			
		workbook.close();
		file.close();
	}

}
