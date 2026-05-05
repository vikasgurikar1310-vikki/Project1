package screenshot;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOfElement {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String Timestamp = LocalDateTime.now().toString().replace(":","-");
	WebElement ele = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
	File temp = ele.getScreenshotAs(OutputType.FILE);
	File perm = new File("./screenshots/"+Timestamp+".png");
	FileHandler.copy(temp, perm);
	
	
	//String FilePaths = "./screenshots/"+Timestamp+".png";
	
}
}
