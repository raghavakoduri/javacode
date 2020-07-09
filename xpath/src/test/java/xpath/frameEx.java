package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameEx {
	public static String getElementXPath(WebDriver driver, WebElement element) {
	    return (String)((JavascriptExecutor)driver).executeScript("gPt=function(c){if(c.id!==''){return'id(\"'+c.id+'\")'}if(c===document.body){return c.tagName}var a=0;var e=c.parentNode.childNodes;for(var b=0;b<e.length;b++){var d=e[b];if(d===c){return gPt(c.parentNode)+'/'+c.tagName+'['+(a+1)+']'}if(d.nodeType===1&&d.tagName===c.tagName){a++}}};return gPt(arguments[0]).toLowerCase();", element);
	}
@SuppressWarnings("null")
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/test/guru99home/"); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    List<WebElement> xpath = driver.findElements(By.tagName("iframe"));
	    int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
        for (int i =0; i < size; i++) 
        {
        	
        	//String a = getElementXPath(driver, xpath.get(i));
        	//System.out.println(a);
        	driver.switchTo().frame(i);
        	int x = driver.findElements(By.tagName("iframe")).size();
        	System.out.println(x);
        		if(x > 0) 
        			System.out.println("More than zero iframes");
        		else
        			System.out.println("Zero Iframes");
        	
        	
        	driver.switchTo().defaultContent();
        }
		// prints the total number of frames 
		driver.switchTo().frame(0); // Switching the Outer Frame    		
	    //System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

		//Printing the text in outer frame
		//size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
                                                                                                          
	    //System.out.println("Total Frames --" + size);
	  //  driver.switchTo().frame(0); // Switching to innerframe
	   // System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		
		//Printing the text in inner frame
		//driver.switchTo().defaultContent();
	}
}
