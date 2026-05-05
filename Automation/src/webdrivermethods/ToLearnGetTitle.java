package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	String title=driver .getTitle();
	if(title.equals("Demo Web Shop"))
	{
		System.out.println("welcome page is displayed");
	}
	else
	{
		System.out.println("welcome page is not displayed");
	}
	
	
		
		
	
	
	
}
}
