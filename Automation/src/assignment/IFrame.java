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

public class IFrame {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
    WebElement frame = driver.findElement(By.id("singleframe"));
    driver.switchTo().frame(frame);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("automation");
    TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./screenshots/frame.png");
	FileHandler.copy(temp, perm);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	WebElement iframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(iframe);
	WebElement first = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
	driver.switchTo().frame(first);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
	
	TakesScreenshot ts1 = (TakesScreenshot)driver;
	File temp1 = ts1.getScreenshotAs(OutputType.FILE);
	File perm1 = new File("./screenshots/switch.png");
	FileHandler.copy(temp1, perm1);
	
	
	
    
    
}
}
