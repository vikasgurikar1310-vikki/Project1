package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnDigitalDownloads extends BAseClass {
	@Test
	public void clickondigitaldownloads()
	{
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		Reporter.log("DigitalDownload is displayed");
	}

}
