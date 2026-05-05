package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartByXpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone17");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='RG5Slk']"));
for(int i = 1;i<=iphone.size();i++)
{
	
	}
}
}
