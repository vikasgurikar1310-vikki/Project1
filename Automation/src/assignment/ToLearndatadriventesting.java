package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearndatadriventesting {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	FileInputStream fis = new FileInputStream("./testdata/commendata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String name = prop.getProperty("Name");
	String email = prop.getProperty("Email");
	String mobile = prop.getProperty("Mobile");
	String age = prop.getProperty("Age");
	
	driver.get(url);
	driver.findElement(By.id("firstname")).sendKeys(name);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("mobile")).sendKeys(mobile);
	driver.findElement(By.id("datepicker")).sendKeys(age);
	WebElement course = driver.findElement(By.id("course"));
	Select sel = new Select(course);
	sel.selectByVisibleText("MCA");
	
	
	
}
}
