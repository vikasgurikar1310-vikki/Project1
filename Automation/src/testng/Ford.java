package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ford {
@Test(groups = "Smoke")
public void launch()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.ford.com/?srsltid=AfmBOop9fMbp8DwXnGL1YPHsQU15IYK4HdrtmBNeZo60fyG0Sh5QLIpx");
	Reporter.log("Mustang is launching soon in India",true);
	}

}
