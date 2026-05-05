package locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetName {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(WebElement l : links)
	{
		System.out.println(l.getText());
	}
}
}
