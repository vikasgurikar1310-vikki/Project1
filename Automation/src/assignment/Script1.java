package assignment;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.time.Duration;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script1 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("(//span[text()='Demo Testing Site'])[2]"));
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("(//span[text()='Drag And Drop'])[2]")).click();
	Set<String> allids = driver.getWindowHandles();
	for(String s : allids)
	{
		driver.switchTo().window(s);
	}
	WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
	driver.switchTo().frame(frame);
	WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement drop = driver.findElement(By.id("trash"));
	Actions act1 = new Actions(driver);
	act1.dragAndDrop(drag, drop).perform();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
	Set<String> all = driver.getWindowHandles();
	for(String s1 : all)
	{
		driver.switchTo().window(s1);
	}
	WebElement scroll = driver.findElement(By.xpath("//a[text()='Download']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",scroll);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./screenshots/script.png");
	org.openqa.selenium.io.FileHandler.copy(temp, perm);
}
}
