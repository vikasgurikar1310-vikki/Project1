package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnShoes extends BAseClass {
	
	@Test
	public void clickshoes()
	{
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		Reporter.log("Shoes is displayed",true);
	}
	

}
