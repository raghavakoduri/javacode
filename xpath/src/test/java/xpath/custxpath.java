package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class custxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing custome xpath options");
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		//System.setProperty("webdriver.chorme.driver", "C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("http://www.rediff.com");
		//driver.findElement(By.xpath("//*[@class='news']")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@href='https://www.rediff.com/news']")).click();
		//driver.navigate().refresh();
		WebElement link_Home = driver.findElement(By.xpath("//*[@href='https://www.rediff.com/']"));
		WebElement td_Home = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[1]/a"));
		Actions builder = new Actions(driver);
		Action mouseOverhome = builder.moveToElement(link_Home).build();
		String bgcolor = td_Home.getCssValue("background-color");
		System.out.println("Before: " + bgcolor);
		mouseOverhome.perform();
		bgcolor = td_Home.getCssValue("background-color");
		System.out.println("After: "+ bgcolor);
		driver.close();*/
		
		
                /*driver.get(baseUrl);           
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));    
                 
                Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                 
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                mouseOverHome.perform();        
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);
                driver.close();*/
		
	}

}


