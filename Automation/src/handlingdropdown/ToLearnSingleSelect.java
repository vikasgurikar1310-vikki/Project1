package handlingdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
public static void main(String[] args) {
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
	}
	//sel.selectByValue("India");
	//sel.selectByVisibleText("United Kingdom");
	System.out.println(sel.isMultiple());
}
}
