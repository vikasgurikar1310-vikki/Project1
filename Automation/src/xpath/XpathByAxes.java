package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//String price = driver.findElement(By.xpath("//td[text()='United Airlines']/following-sibling::td[3]")).getText();
	//System.out.println(price);
	driver.findElement(By.xpath("//td[text()='United Airlines']/preceding-sibling::td[2]")).click();
}
}
