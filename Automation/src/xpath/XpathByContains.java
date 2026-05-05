package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[contains(@title,'Search for ')])[1]")).sendKeys("mobiles");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	String text = driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2026 Tricentis Demo Web Shop. All rights reserved')]")).getText();
	System.out.println(text);
	
}
}
	