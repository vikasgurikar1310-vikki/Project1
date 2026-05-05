package windows;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	driver.close();
}
}
