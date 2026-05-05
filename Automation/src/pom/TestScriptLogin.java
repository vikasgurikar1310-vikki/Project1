package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptLogin {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	FileInputStream fis = new FileInputStream("./testdata/commendata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	driver.get(url);
	
	String email = prop.getProperty("Email");
	String pass = prop.getProperty("password");
	HomePage hp = new HomePage(driver);
	hp.getLoginlink().click();
	LoginPage ln = new LoginPage(driver);
	ln.getEmailtextfield().sendKeys(email);
	ln.getPasswordtextfield().sendKeys(pass);
	
	
	
}
}
