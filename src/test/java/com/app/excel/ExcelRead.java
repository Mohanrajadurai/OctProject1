package com.app.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static void excelRead() {

		try {
			// locate
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\newone\\Sep_Project\\src"
					+ "\\test\\resources\\TestData\\Sep_Project.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(2);
			System.out.println(cell);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void excelReadAllData() {

		try {
			// locate
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\newone\\Sep_Project\\src"
					+ "\\test\\resources\\TestData\\Sep_Project.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int phyrows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < phyrows; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void excelreuseable() {
		try {
			// locate
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\newone\\Sep_Project\\src"
					+ "\\test\\resources\\TestData\\Sep_Project.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(2);
			System.out.println(cell);
			int cellType = cell.getCellType();
			if(cellType==1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");	
					String dateValue = sm.format(dateCellValue);
					System.out.println(dateValue);
				}else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					String numericvalue = String.valueOf(l);
					System.out.println(numericvalue);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String excelreuse(int a , int b) {
		String value = null;
		try {
			// locate
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\newone\\Sep_Project\\src"
					+ "\\test\\resources\\TestData\\Sep_Project.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			System.out.println(cell);
			int cellType = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");	
				value = sm.format(dateCellValue);
					System.out.println(value);
				}else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(excelreuse(1,0));
		
		
		
		
		
		
		
		
	}

}
