package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowpopups {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/products_page/51");
	driver.findElement(By.id("compare")).click();
	Set<String> allids = driver.getWindowHandles();
	for(String s : allids)
	{
		driver.switchTo().window(s);
		driver.close();
	}
}
}
