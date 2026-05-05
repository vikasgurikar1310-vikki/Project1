package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("a[class='block w-full h-full']")).click();
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("vikas");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("vikasgurikar1310@gmail.com");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("vikki@123");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}
}
