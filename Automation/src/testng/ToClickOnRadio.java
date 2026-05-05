package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnRadio extends BAseClass {
	@Test
	public void clickonradiobutton()
	{
		driver.findElement(By.id("pollanswers-1")).click();
		Reporter.log("Excellent is clicked");
	}

}
