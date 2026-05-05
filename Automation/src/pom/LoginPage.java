package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id = "Email")
private WebElement emailtextfield;
@FindBy(id = "Password")
private WebElement passwordtextfield;
@FindBy(id = "RememberMe")
private WebElement remembermecheckbox;
@FindBy(xpath = "(//input[@type='submit'])[2]")
private WebElement loginbutton;

public LoginPage(WebDriver driver) {
	
PageFactory.initElements( driver,this);
}

public WebElement getEmailtextfield() {
	return emailtextfield;
}

public void setEmailtextfield(WebElement emailtextfield) {
	this.emailtextfield = emailtextfield;
}

public WebElement getPasswordtextfield() {
	return passwordtextfield;
}

public void setPasswordtextfield(WebElement passwordtextfield) {
	this.passwordtextfield = passwordtextfield;
}

public WebElement getRemembermecheckbox() {
	return remembermecheckbox;
}

public void setRemembermecheckbox(WebElement remembermecheckbox) {
	this.remembermecheckbox = remembermecheckbox;
}

public WebElement getLoginbutton() {
	return loginbutton;
}

public void setLoginbutton(WebElement loginbutton) {
	this.loginbutton = loginbutton;
}

}
