package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnGiftCards extends BAseClass {
	@Test
	public void clickongiftcards()
	{
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Reporter.log("GiftCArd is displayed");
	}

}
