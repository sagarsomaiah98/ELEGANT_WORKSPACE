package com.data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		
		
	
		try (OutputStream fileOut = new FileOutputStream("S:\\ELEGANT_WORKSPACE\\QA_CLASS_13_DATA_PARAMETERIZATION\\src\\TESTDATA\\Test.xlsx")) {
		   
			Workbook wb = new XSSFWorkbook();
			Sheet s1 = wb.createSheet("SHEET_P");
			Sheet s2 = wb.createSheet("SHEET_Q");
			Row r1 = s1.createRow(0);
			Row r2=s1.createRow(1);
			Row r3= s1.createRow(2);
			Row r4=s1.createRow(3);
			Row r5=s1.createRow(4);
			/*
			 * Cell cell = r1.createCell(2);
			 * 
			 * cell.setCellValue("Testing");
			 */
			
			for(int i=0;i<=4;i++) 
			{
				r1.createCell(i).setCellValue("TEST "+i);
				r2.createCell(i).setCellValue("TEST "+i);
				r3.createCell(i).setCellValue("TEST "+i);
				r4.createCell(i).setCellValue("TEST "+i);
				
			}
			
	//create a array with 10 places and then write these values into excel
			
			
			
			/*
			 * r1.createCell(1).setCellValue(1.2); r1.createCell(2).setCellValue(
			 * ("This is a string")); r1.createCell(3).setCellValue(true);
			 */
			
			
			wb.write(fileOut);
		}
		
		System.out.println("end");
	}

}
