package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Execution1 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	
	Set<String> allwindow = driver.getWindowHandles();
	for(String s : allwindow)
	{
		driver.switchTo().window(s);
	}
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	driver.findElement(By.name("name")).sendKeys("vikas");
	driver.findElement(By.name("email")).sendKeys("vikasgurikar1313@gmail.com");
	
	WebElement db = driver.findElement(By.id("SELECTOR_1"));
	Select sel = new Select(db);
	Thread.sleep(5000);
	sel.selectByVisibleText("May");
	
	WebElement dd = driver.findElement(By.id("SELECTOR_2"));
    Select sel1 = new Select(dd);
    sel1.selectByVisibleText("10");
    
    WebElement y = driver.findElement(By.id("SELECTOR_3"));
    Select sel2 = new Select(y);
    sel2.selectByVisibleText("2015");
    
    TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./screenshots/images1.png");
	FileHandler.copy(temp, perm);
    
	
	
}
}
