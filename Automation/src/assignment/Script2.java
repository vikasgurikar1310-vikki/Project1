package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.hdfc.bank.in/");
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	driver.findElement(By.xpath("(//span[@class='anchor_wrap'])[1]")).click();
	
	Set<String> all = driver.getWindowHandles();
	for(String s : all)
	{
		driver.switchTo().window(s);
		
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//driver.findElement(By.xpath("//a[text()='Know More']")).click();
}
}
