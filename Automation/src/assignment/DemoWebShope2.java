package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShope2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Computers");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='X Path']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Login 1.0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vikki@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Login 2.0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vikki@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Login 3.0']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vikki@321");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
