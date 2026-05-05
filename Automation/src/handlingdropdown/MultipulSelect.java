package handlingdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipulSelect {
/**
 * @param args
 */
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	
	WebElement ref = driver.findElement(By.id("select-multiple-native"));
	Select sel = new Select(ref);
	
	sel.selectByIndex(0);
	sel.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
	sel.selectByVisibleText("Mens Cotton Jacket...");
	 List<WebElement> all = sel.getOptions();
	 for(WebElement e : all)
	 {
		 System.out.println(e.getText());
	 }
	  System.out.println(sel.isMultiple());
	  System.out.println("----------------------------");
	  
	  List<WebElement> all1 = sel.getAllSelectedOptions();
	  for(WebElement el : all1)
	  {
		  System.out.println(el.getText());
	  }
	  System.out.println("-------------------------------");
	  WebElement f1 = sel.getFirstSelectedOption();
	  System.out.println(f1.getText());
	  
	  sel.deselectByIndex(0);
	  
	
}
}

//div[contains(@class,'MuiInputBase-root ')]