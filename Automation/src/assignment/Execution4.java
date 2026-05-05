package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Execution4 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	WebElement ele = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
	ele.clear();
	ele.sendKeys("123456");
	WebElement rewrite = driver.findElement(By.id("mat-input-1"));
	rewrite.clear();
	rewrite.sendKeys("80");
	WebElement per = driver.findElement(By.id("mat-input-2"));
	per.clear();
	per.sendKeys("90.90");
	WebElement drop = driver.findElement(By.id("mat-select-value-0"));
	Select sel = new Select(ele);
	sel.selectByIndex(3);
	
}
}
