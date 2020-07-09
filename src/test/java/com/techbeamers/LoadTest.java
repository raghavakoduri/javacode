package com.techbeamers;

/*import java.util.List;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
//import java.io.*;
//import java.lang.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LoadTest{
	//private WebDriver driver;
	WebDriver driver;

  @Test
  public void test_Amazon() throws IOException {
	  System.out.println("inside @test");
	  
	  if (driver != null) {
          try {
	  
		driver.get("http://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone");	
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		List<WebElement> phonearray = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> h2array = driver.findElements(By.xpath("//*[@class='a-link-normal a-text-normal']"));
		
		String phone_name = null;
		String phone_href = null;
		//String myArray = null;
		int k = phonearray.size();
		String[] myArray = new String[k];
		System.out.println("phonearray:" + k);
		for(int j =0; j<k; j++)
		{
			if(phonearray.get(j).getText().contains("Apple iPhone")) {
			phone_name=phonearray.get(j).getText();
			phone_href=h2array.get(j).getText();
			System.out.println("phonearray:" + phonearray.size() + "phone_name: " + phone_name);
			myArray[j] = phone_name;
			//List<String> myArray = new ArrayList();
			
			System.out.println("myArray[" + j + "]" + myArray[j]);
			//LoadTest objExcelFile = new LoadTest();
			
			//objExcelFile.writeToExcel(System.getProperty("C:\\Users\\u26494\\Desktop\\Automation"),"ExportExcel.xlsx","ExcelDemo",myArray);
			/*String filePath = "C:\\Users\\u26494\\Desktop\\Automation";
			String fileName = "ExportExcel.xlsx";
			String sheetName = "ExcelDemo";
			objExcelFile.writeToExcel(filePath, fileName, sheetName, myArray);*/	
	/*		LoadTest objExcelFile = new LoadTest();
			
			objExcelFile.writeToExcel(System.getProperty("C:\\Users\\u26494\\Desktop\\Automation") + "\\" ,"ExportExcel.xlsx","ExcelDemo",myArray);
			//objExcelFile.writeToExcel("C:\\Users\\u26494\\Desktop\\Automation","ExportExcel.xlsx","ExcelDemo",myArray);
			
          }

			
		}
		
		}
		finally {
              System.out.println("Test");          }
          }
  }
  
  public void writeToExcel(String filePath, String fileName, String sheetName, String[] arrayDemo) throws IOException {
	 
	  
	  File file = new File(filePath+"\\"+fileName);
	  //File file = new File("C:\Users\u26494\Desktop\Automation"+"\\"+"ExportExcel.xlsx");
      FileInputStream  inputStream = new FileInputStream(file);
      Workbook book = null;
      
      String fileExtensionName = fileName.substring(fileName.indexOf("."));
      
      if (fileExtensionName.equals(".xlsx")) {
    	  book = new XSSFWorkbook(inputStream);
      }
      else if(fileExtensionName.equals(".xls")) {
    	  book = new HSSFWorkbook(inputStream);
      }
      
      Sheet sheet = book.getSheet(sheetName);
      int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
      Row row = sheet.getRow(0);
      Row newRow = sheet.createRow(rowCount+1);
      
      for(int j=0;j<row.getLastCellNum();j++) {
    	  Cell cell = newRow.createCell(j);
    	  //cell.setCellValue(myArray[j]);
    	  cell.setCellValue(arrayDemo[j]);
      }
    	  
      inputStream.close();
      
      FileOutputStream outputStream = new FileOutputStream(file);
      book.write(outputStream);
      outputStream.close();
      
  }
  @BeforeClass
  public void before_Test() {
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
  }

  @AfterClass
  public void after_Test() {
	  if (driver != null) {
          try {
             System.out.println("Closing Window"); 
          } finally {
              driver.quit(); 
          }
        }    
  }

}*/



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
/**
 * A very simple program that writes some data to an Excel file
 * using the Apache POI library.
 * @author www.codejava.net
 *
 */
public class LoadTest {
 
    public static void main(String[] args) throws IOException  {
    	System.out.println("Test");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

    	driver.get("http://www.amazon.com");
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone");	
    	driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
    	List<WebElement> phonearray = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
    	//List<WebElement> pricearray = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
    	List<WebElement> h2 = driver.findElements(By.xpath("//*[@class='a-link-normal a-text-normal']"));
    	//String h2array = h2.getAttribute(h2); 
    	
    	String phone_name = null;
    	//String phone_price;
    	String phone_href = null;
    	//int int_phone_price = 0;
    	int k = phonearray.size();
		String array_list_phone[][]= new String[k][2];
		//Integer array_list_price[] = new Integer[k];
    	//System.out.println(phonearray.size() + "\t");// + pricearray.size() + "\t" + h2array.size());
    	for(int j =0; j<k; j++)
    	{
    		if(phonearray.get(j).getText().contains("Apple iPhone")) {
    		
    			//System.out.print(phonearray.get(j).getText() + "\t");// + pricearray.get(j).getText() + "\n");
    			phone_name=phonearray.get(j).getText();
    			//phone_href = h2.get(j).getText();
    			
    			phone_href=h2.get(j).getAttribute("href");
    			System.out.println(phone_name + "\t" + phone_href);
    			/*phone_price=pricearray.get(j).getText();
    			phone_price = phone_price.replaceAll("[^0-9]", "");
    			int_phone_price = Integer.parseInt(phone_price);*/

    			array_list_phone[j][0] = phone_name;
    			array_list_phone[j][1] = phone_href;
    			//array_list_price[j] = int_phone_price;
    			//System.out.println("array_list_phone: "+ array_list_phone[j][0] + "array_list_href: " + array_list_phone[j][1]);
    		}
    	}
        @SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books_new");
         
        /*Object[][] bookData = {
                {"Head First Java", "Kathy Serria", 79},
                {"Effective Java", "Joshua Bloch", 36},
                {"Clean Code", "Robert martin", 42},
                {"Thinking in Java", "Bruce Eckel", 35},
        };*/
 
        int rowCount = 0;
         
        //for (Object[] aBook : bookData) {
        for (Object[] aBook : array_list_phone) {
        
            Row row = sheet.createRow(++rowCount);
             
            int columnCount = 0;
             
            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
             
        }
         
         
       FileOutputStream outputStream = new FileOutputStream("C:\\Users\\u26494\\Desktop\\JavaBooks.xlsx");
            workbook.write(outputStream);
        
    }
 
}
