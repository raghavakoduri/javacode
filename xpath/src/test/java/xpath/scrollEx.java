package xpath;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class scrollEx {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    //@Test
   // public void ByVisibleElement() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Linux"));
        WebElement Element1 = driver.findElement(By.xpath("//a[text()='Twitter']"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[1].scrollIntoView();", Element,Element1);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        js.executeScript("arguments[0].scrollIntoView();", Element,Element1);
        //js.executeScript("window.scrollBy(0,1000)");
        
        // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

        WebElement Element2 = driver.findElement(By.linkText("VBScript"));

        //This will scroll the page Horizontally till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element2);
    }
}
