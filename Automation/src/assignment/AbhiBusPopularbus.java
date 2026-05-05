package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusPopularbus {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.abhibus.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement scroll = driver.findElement(By.xpath("//h2[text()='Popular Bus Routes']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scroll);
	driver.findElement(By.xpath("//img[@alt='Bangalore to Hyderabad']/../..//a[text()='View Buses']")).click();
	WebElement scroll1 = driver.findElement(By.xpath("//span[text()='Bus Partner']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scroll1);
	scroll1.click();
	driver.findElement(By.xpath("//label[text()='FlixBus']/..//input[@type='checkbox']")).click();
//
//	List<WebElement> bus = driver.findElements(By.xpath("//div[@class='container service-info-left-section ']"));
//	for(WebElement ele : bus)
//	{	System.out.println("----------busdetails---------");
//		System.out.println(ele.getText());
//	}
	List<WebElement> details = driver.findElements(By.xpath("//h5[text()='FlixBus']/../..//div[@class='container travel-distance ']"));
	for(WebElement ele : details)
	{
		System.out.println("------------details--------------");
		System.out.println(ele.getText());
	}
	List<WebElement> price = driver.findElements(By.xpath("//h5[text()='FlixBus']/../../../../..//span[text()='₹']"));
	for(WebElement ele1 : price)
	{
		System.out.println("-----------price-------------");
		System.out.println(ele1.getText());
	}

	
	
}
}
