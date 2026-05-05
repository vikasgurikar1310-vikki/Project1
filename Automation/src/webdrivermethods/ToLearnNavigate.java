package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	//driver.navigate().to("https://www.myntra.com/?utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gad_campaignid=20443628324&gbraid=0AAAAADoxBh7OgpR5lZcbNreTo2k3nwIEn&gclid=CjwKCAjwspPOBhB9EiwATFbi5FPn47zGp40NkUGlgEOt5Vbdx2xBZJ4ZfEQbvait81BnCqY38gx22xoCS5AQAvD_BwE");
driver.navigate().to(new URL("https://www.myntra.com/?utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gad_campaignid=20443628324&gbraid=0AAAAADoxBh7OgpR5lZcbNreTo2k3nwIEn&gclid=CjwKCAjwspPOBhB9EiwATFbi5FPn47zGp40NkUGlgEOt5Vbdx2xBZJ4ZfEQbvait81BnCqY38gx22xoCS5AQAvD_BwE") );

}
}
