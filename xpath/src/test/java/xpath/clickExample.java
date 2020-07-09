package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

public class clickExample {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();

//Launch the Application Under Test (AUT)
driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();
//Double click the button to launch an alertbox
Actions action = new Actions(driver);
//WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//action.doubleClick(link).perform();

//Switch to the alert box and click on OK button
WebElement link1 = driver.findElement(By.xpath("//span[text()='right click me']"));
action.contextClick(link1).perform();
WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
element.click();
Alert alert = driver.switchTo().alert();
System.out.println("Alert Text\n" +alert.getText());
alert.accept();
WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
action.doubleClick(link).perform();
Alert alert1 = driver.switchTo().alert();
System.out.println("Alert Text\n" +alert.getText());
alert1.accept();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.quit();



}
}