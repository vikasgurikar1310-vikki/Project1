package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Execution2 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://blazedemo.com/");
	
	WebElement from = driver.findElement(By.name("fromPort"));
	Select sel = new Select(from);
	sel.selectByVisibleText("Boston");
	
	WebElement to = driver.findElement(By.name("toPort"));
	Select sel1 = new Select(to);
	sel1.selectByVisibleText("Cairo");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	
	driver.findElement(By.id("inputName")).sendKeys("vikas");
	driver.findElement(By.id("address")).sendKeys("chickmagalur");
	driver.findElement(By.id("city")).sendKeys("beng");
	driver.findElement(By.id("state")).sendKeys("karnataka");
	driver.findElement(By.id("zipCode")).sendKeys("123456");
	
	WebElement card = driver.findElement(By.id("cardType"));
	Select ele = new Select(card);
	ele.selectByVisibleText("American Express");
	driver.findElement(By.id("creditCardNumber")).sendKeys("123456799");
	driver.findElement(By.xpath("//input[@value='11']")).sendKeys("10");
	driver.findElement(By.xpath("//input[@value='2017']")).sendKeys("2026");
	driver.findElement(By.id("nameOnCard")).sendKeys("john");
	driver.findElement(By.id("rememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	
	 TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshots/images2.png");
		FileHandler.copy(temp, perm);
	
}

}

