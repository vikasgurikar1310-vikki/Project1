package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShope {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("FirstName")).sendKeys("vikas");
	driver.findElement(By.name("LastName")).sendKeys("p");
	driver.findElement(By.name("Email")).sendKeys("vikasgurikar1310@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("vikki@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("vikki@123");
	driver.findElement(By.id("register-button")).click();
	
	
	
}
}
