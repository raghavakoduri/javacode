package com.techbeamers;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class ParamTest {
    /**
     * Following method takes one parameter as input. Value of the 
     * said parameter is defined at suite level.
     */
    @Parameters({ "suite-param" })
    @Test
    public void prameterTestOne(String param) {
        System.out.println("Test one suite param is: " + param);
    }
 
    /**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at test level.
     */
    @Parameters({ "test-two-param" })
    @Test
    public void prameterTestTwo(String param) {
        System.out.println("Test two param is: " + param);
    }
 
    /**
     * Following method takes two parameters as input. Value of the 
     * test parameter is defined at test level. The suite level 
     * parameter is overridden at the test level.
     */
    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void prameterTestThree(String param, String paramTwo) {
        System.out.println("Test three suite param is: " + param);
        System.out.println("Test three param is: " + paramTwo);
    }
}

/*import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	String driverPath = "C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
   // @Test
    @Parameters("author1")
    @Test
    public void testParameterWithXML(String author1) {

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");

        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(author1);

        System.out.println("Welcome ->"+author1);
        		//+" Your search key is->"+searchKey);
       // System.out.println("Thread will sleep now");
        //Thread.sleep(3000);
       // System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
        //verifying the value in google search box
       // Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

}
}*/
