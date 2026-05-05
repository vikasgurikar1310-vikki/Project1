package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterScript {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	FileInputStream fis = new FileInputStream("./testdata/commendata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	driver.get(url);
	String fn = prop.getProperty("FirstName");
	String ln = prop.getProperty("LastName");
	String email = prop.getProperty("Email");
	String pass = prop.getProperty("password");
	String conf = prop.getProperty("Confirmpassword");
	
	HomePage hp = new HomePage(driver);
	hp.getRegisterlink().click();
    
	Register r = new  Register(driver);
	r.getFirstnametextfield().sendKeys(fn);
	r.getLastnametextfield().sendKeys(ln);
	r.getEmailtextfield().sendKeys(email);
	r.getPasswordtextfield().sendKeys(pass);
	r.getConfirmpasstextfield().sendKeys(conf);
	r.getRegisterbutton().click();
	
}
}
