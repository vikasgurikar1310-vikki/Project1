package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	driver.findElement(By.xpath("(//a[contains(@class,'btn text-neutral-800 light')]/../../../..//div[@class=\"h5 col\"])[1]")).click();
	
}
}
