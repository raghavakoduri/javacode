package xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonList {

	public static void main(String [] args) {
		
		/*try {
			System.out.println("inside try");
			System.out.println(10/0);
		}
		catch (Exception e) {
	    System.out.println("inside catch");
		System.out.println(10/2);
	    }
		catch (ArithmeticException e) {
	        System.out.println("inside catch");
			System.out.println(10/2);
		}
		catch (Exception e) {
	    System.out.println("inside catch");
		System.out.println(10/2);
	    }*/
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u26494\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("http://www.amazon.com.mx");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy S9 ");	
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		//*[@id="search"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span
		//List<WebElement> phonearray = driver.findElements(By.xpath("//*[@class = 'sg-row']/div/div/div[1]/h2/a/span[contains(text(), 'Apple iPhone')]"));
		List<WebElement> phonearray = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> pricearray = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
		//Map<WebElement, WebElement> map1 = new LinkedHashMap<WebElement,WebElement>();
		//List<WebElement> h2array = driver.findElements(By.xpath("//*[@class='a-link-normal a-text-normal']"));
		//Map<Integer, String> fullinfo = new LinkedHashMap<Integer,String>();
		
		ArrayList<Integer> array_list_phone_prices = null;
		String phone_name = null;
		String phone_price;
		String phone_href = null;
		int int_phone_price = 0;
		//HashMap <Integer, String> final_phone = null;
		Map<Integer, String> map = new LinkedHashMap<Integer,String>();
		//TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		System.out.println(phonearray.size() + "\t" + pricearray.size());
		
		for(int j =0; j<phonearray.size(); j++)
		{
			if(phonearray.get(j).getText().contains("Samsung Galaxy S9 ")) {
			
				System.out.print(phonearray.get(j).getText() + "\t" + pricearray.get(j).getText() + "\n");
				//final_phone = new HashMap<Integer, String>();
			
				phone_name=phonearray.get(j).getText();
				//phone_href=h2array.get(j).getText();
				phone_price=pricearray.get(j).getText();
				phone_price = phone_price.replaceAll("[^0-9]", "");
				int_phone_price = Integer.parseInt(phone_price);
				System.out.println(phone_name + "\t" + int_phone_price);
				//final_phone.put(int_phone_price, phone_name);
				map.put(int_phone_price, phone_name);
				Set<Integer> keys = map.keySet();
				array_list_phone_prices = new ArrayList<Integer>(keys);
							
			}
			}
		//System.out.println(final_phone.toString());
		System.out.println(map);
		
		Collections.sort(array_list_phone_prices);
		int lowcost = array_list_phone_prices.get(0);
		System.out.println("Low cost iPhone 8 plus is: " + lowcost + "phone name:" + map.get(lowcost));
		phone_name = map.get(lowcost);
		List<WebElement> final_phone = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i=0; i<final_phone.size();i++) {
		    if(final_phone.get(i).getText().equals(phone_name)) {
		    final_phone.get(i).click();
		}}
	   
		/*for(int x =0; x<array_list_phone_prices.size(); x++) {
			System.out.println(array_list_phone_prices.get(x).getInteger(phone_name, int_phone_price));
		}*/
		        /*final_phone.put(int_phone_price, phone_name);
				Set<Integer> keys = final_phone.keySet();
				ArrayList<Integer> array_list_phone_prices = new ArrayList<Integer>(keys);
				Collections.sort(array_list_phone_prices);
				int lowcost = array_list_phone_prices.get(0);
				
				System.out.println("Low cost iPhone 8 plus is: " + lowcost + "phone name:" + final_phone.get(lowcost));
				*/
		
				
				
				}
}
