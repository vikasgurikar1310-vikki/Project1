package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ToClickOnBooks extends BAseClass
{
	@Test
public void clickonbooks() throws InterruptedException
{
	driver.findElement(By.partialLinkText("Books")).click();
	Thread.sleep(3000);
	Reporter.log("books page is displayed",true);
	}
}
