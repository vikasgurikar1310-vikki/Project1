package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnName {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Thread.sleep(3000);
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("google.com");
	driver.findElement(By.name("pass")).sendKeys("google");
	//driver.quit();
}
}
