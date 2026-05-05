package windows;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	driver.manage().window().setSize(new Dimension(1244, 1020));
}
}
