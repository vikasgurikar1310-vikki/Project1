package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
	driver.findElement(By.xpath("//span[@class='ng-tns-c2785778308-3 icon-cancel']")).click();
	//Actions act = new Actions(driver);
	driver.findElement(By.id("password")).sendKeys("1234");
	Actions act = new Actions(driver);
	WebElement ref = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[1]"));
	act.clickAndHold(ref).perform();
	
			
}
}
