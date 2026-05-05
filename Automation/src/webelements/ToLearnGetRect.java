package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Rectangle value = driver.findElement(By.xpath("//span[text()='Cart']")).getRect();
	System.out.println(value.getX());
	System.out.println(value.getY());
	System.out.println(value.getHeight());
	System.out.println(value.getWidth());
	System.out.println(value);
}
}
