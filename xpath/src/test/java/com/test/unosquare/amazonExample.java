package com.test.unosquare;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import com.test.unosquare.amazonAccountCreatePom;
import com.test.unosquare.amazonPomFactory;
import com.test.unosquare.configuration;




public class amazonExample {
	configuration configReader;

    String driverPath = configReader.getDriverPath();
    
    WebDriver driver;

    amazonAccountCreatePom createacc;
    amazonPomFactory prodSearch;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        configReader.getImplicitlyWait();

        driver.get(configReader.getApplicationUrl());

    }

 
    @Test (priority = 2)

    public void account_Creation(){

        //Create Login Page object

    createacc = new amazonAccountCreatePom(driver);
   // driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
    
    createacc.createAccount();
    createacc.account_Create("Shivakumar", "shivakumar.chandramouli.desai@gmail.com", "Shivakumar", "Shivakumar");
   

    }
    @Test (priority = 1)

    public void search_Product(){

        //Create Login Page object

    prodSearch = new amazonPomFactory(driver);
    prodSearch.driver_wait();
    prodSearch.setSearch("Samsung S9 ");
    prodSearch.driver_wait();
    prodSearch.clickSearch();
    prodSearch.driver_wait();
    prodSearch.clickProduct();
    prodSearch.driver_wait();
    prodSearch.clickaddtoCart();
    prodSearch.driver_wait();
    prodSearch.clickHome();
    prodSearch.driver_wait();
    prodSearch.clicksignIn();
    prodSearch.driver_wait();
   

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
   

    
}




























