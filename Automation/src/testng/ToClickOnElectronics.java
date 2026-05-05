package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnElectronics extends BAseClass {
	@Test
	public void clickonelectronics()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		Reporter.log("electronics is displayed",true);
	}

}
