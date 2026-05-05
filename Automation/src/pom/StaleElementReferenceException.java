package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement we : ele)
	{
		we.click();
	}
	driver.findElement(By.xpath("//a[text()='Prompt']")).click();
	List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement w : check)
	{
		w.click();
	}
}
}
