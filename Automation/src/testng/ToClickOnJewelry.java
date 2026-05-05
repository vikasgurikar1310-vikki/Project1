package testng;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnJewelry extends BAseClass {
	@Test
	public void clickonjewelry()
	{
		driver.findElement(By.partialLinkText("Jewelry")).click();
		Reporter.log("Jewelry is displayed");
	}

}
