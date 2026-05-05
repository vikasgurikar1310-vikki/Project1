package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
WebElement drop = driver.findElement(By.id("select3"));
	
	Select sel = new Select(drop);
	sel.selectByIndex(2);
	List<WebElement> allselect = sel.getOptions();
	for(WebElement ele : allselect)
	{
		System.out.println(ele.getText());
		System.out.println(sel.isMultiple());
	}
	
	System.out.println("-----------------------------------------------------------------");
	Thread.sleep(4000);
	
	 WebElement state= driver.findElement(By.id("select5"));
	 Select sel1 = new Select(state);
	 sel1.selectByIndex(1);
	 List<WebElement> all = sel1.getOptions();
	 for(WebElement e : all)
	 {
		 System.out.println(e.getText());
		 System.out.println(sel1.isMultiple());
	 }
}
}
