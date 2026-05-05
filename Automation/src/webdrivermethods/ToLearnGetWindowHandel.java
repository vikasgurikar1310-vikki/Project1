package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;

public class ToLearnGetWindowHandel {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/52");
	
	Thread.sleep(10000);
	driver.findElement(By.id("compare")).click();
	
	String windowid = driver.getWindowHandle();
	System.out.println(windowid);
}
}
