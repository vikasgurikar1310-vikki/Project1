package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
	driver.switchTo().frame(frame);
	
	
	WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement drop = driver.findElement(By.id("trash"));
	
	Actions act  = new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
}
}
