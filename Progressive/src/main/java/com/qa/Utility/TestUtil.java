package com.qa.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {

	
	static Workbook book;
	static Sheet sheet;
	
	public static String sheetpath= "C:/Users/lappy/Desktop/TestData.xlsx";
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream Fis= null;
		try {
			 Fis= new FileInputStream(sheetpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
		try {
			book=WorkbookFactory.create(Fis);
		} catch (InvalidFormatException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetName);
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
			}
		}
		return data;
	}
	
	
	
	
}
