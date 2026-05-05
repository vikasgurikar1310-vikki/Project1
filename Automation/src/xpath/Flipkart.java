package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//div[text()='Bank Offer'])[1]")).click();
	Thread.sleep(5000);
	Set<String> allwinIds = driver.getWindowHandles();
	for(String id : allwinIds)
	{
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		
		if(url.contains("https://www.flipkart.com/vivo-t5x-5g-star-silver-128-gb/p/itm7da8aa253e72b?pid=MOBHH69NRE6PHFBH&lid=LSTMOBHH69NRE6PHFBHJHMXME&marketplace=FLIPKART&q=mobiles&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&fm=organic&iid=en_xvRzXJAoIBJhS0y8aoXpFavhSp_wMQIR5D2n2tue9XaJJ8g6IWONOPt-nkWzd4Zw2IUnfcKeo6rreHbsgaNVi_UFjCTyOHoHZs-Z5_PS_w0%3D&ppt=None&ppn=None&ssid=af15qq5qzk0000001775311880552&qH=eb4af0bf07c16429&ov_redirect=true"));
		WebElement price = driver.findElement(By.xpath("(//div[text()='₹18,999'])[1]"));
		System.out.println(price);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Buy now']")).click();
	}
	
	
}
}
