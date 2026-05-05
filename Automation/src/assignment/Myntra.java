package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Myntra {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.myntra.com/");
	
    WebElement ele = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true)", ele);
   
    
    
    WebElement clicks = driver.findElement(By.xpath("//a[text()='Contact Us']"));
    JavascriptExecutor js1 = (JavascriptExecutor)driver;
    js1.executeScript("arguments[0].click();",clicks);
    
    driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("6362552795");
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
    TakesScreenshot ts = (TakesScreenshot)driver;
    File temp = ts.getScreenshotAs(OutputType.FILE);
    File perm = new File("./screenshots/Myntra.png");
    FileHandler.copy(temp, perm);
    driver.navigate().back();
    
    String location = driver.findElement(By.xpath("//p[contains(text(),' Registered ')]/..//div[contains(text(),'Buildings Alyssa, ')]")).getText();
    System.out.println(location);
}
}
