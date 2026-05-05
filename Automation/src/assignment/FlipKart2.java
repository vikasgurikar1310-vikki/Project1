package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	Dimension value = driver.findElement(By.xpath("//input[@type='text']")).getSize();
	System.out.println(value.getHeight());
	System.out.println(value.getWidth());
	String attribute = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).getAttribute("placeholder");
	System.out.println(attribute);
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(4000);
	String attribute1 = driver.findElement(By.xpath("//button[text()='Request OTP']")).getCssValue("color");
	System.out.println(attribute1); 
}
}
