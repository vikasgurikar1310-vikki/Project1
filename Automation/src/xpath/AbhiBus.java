package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengalaru");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Going To']")).sendKeys("Chikmagalur");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Search']")).click();
}
}
