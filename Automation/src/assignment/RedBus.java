package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/?gad_source=1&gad_campaignid=22479772058&gclid=CjwKCAjwspPOBhB9EiwATFbi5KjTUuwaLOLwPE9Xb0XDZcxpfh1VbyRDq7JnwRw3vzX5T__Ed5H-TBoCTMEQAvD_BwE");
	
	//step1
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//step2
	String sourcecode = driver.getPageSource();
	System.out.println(sourcecode);
	
	//step3
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.redbus.in/?gad_source=1&gad_campaignid=22479772058&gclid=CjwKCAjwspPOBhB9EiwATFbi5KjTUuwaLOLwPE9Xb0XDZcxpfh1VbyRDq7JnwRw3vzX5T__Ed5H-TBoCTMEQAvD_BwE"))
		System.out.println("welcome page is displayed");
	else
		System.out.println("welcome page is not displayed");
	
	
   //step4
	driver.quit();
}
}

