package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnRightClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions act = new Actions(driver);
	act.contextClick().perform();
	Thread.sleep(2000);
	WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
	act.contextClick(right).perform();
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	
}
}
