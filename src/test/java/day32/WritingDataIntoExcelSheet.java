package day32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ExcelFile==>workbook=>sheet=>row==>cell
public class WritingDataIntoExcelSheet {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		
		//create a new workbook, sheet, row, cell, write data and finally attach to the file
		//create a workbook
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		//creating rows, cells and update data without loop
		
		//XSSFCell cell=sheet.createRow(0).createCell(1);
		//cell.setCellValue("Welcome");
		/*
		XSSFRow row1=sheet.createRow(0);
		XSSFRow row2=sheet.createRow(1);
		
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("12345");
		row1.createCell(2).setCellValue("xyz");
		
		row2.createCell(0).setCellValue("neima");
		row2.createCell(1).setCellValue("ifrah");
		row2.createCell(2).setCellValue("rufaidah");
		
		
		*/
		
		//creating row, cell and update data using loop
		
		for(int r=0;r<=3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			
			for(int c=0;c<2;c++)
			{
				//currentrow.createCell(c).setCellValue("Welcome");
				System.out.println("Enter a value: ");
				Scanner sc=new Scanner(System.in);
				String value=sc.next();
				currentrow.createCell(c).setCellValue(value);
			}
		}
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is done");
	}

}
