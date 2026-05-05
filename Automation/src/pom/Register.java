package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
@FindBy(id = "FirstName")
private WebElement firstnametextfield;
@FindBy(id = "LastName")
private WebElement lastnametextfield;
@FindBy(id = "Email")
private WebElement emailtextfield;
@FindBy(id = "Password")
private WebElement passwordtextfield;
@FindBy(id = "ConfirmPassword")
private WebElement confirmpasstextfield;
@FindBy(id = "register-button")
private WebElement registerbutton;

public Register(WebDriver driver) {
	PageFactory.initElements( driver,this);
	
	
}

public WebElement getFirstnametextfield() {
	return firstnametextfield;
}

public void setFirstnametextfield(WebElement firstnametextfield) {
	this.firstnametextfield = firstnametextfield;
}

public WebElement getLastnametextfield() {
	return lastnametextfield;
}

public void setLastnametextfield(WebElement lastnametextfield) {
	this.lastnametextfield = lastnametextfield;
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

public WebElement getConfirmpasstextfield() {
	return confirmpasstextfield;
}

public void setConfirmpasstextfield(WebElement confirmpasstextfield) {
	this.confirmpasstextfield = confirmpasstextfield;
}

public WebElement getRegisterbutton() {
	return registerbutton;
}

public void setRegisterbutton(WebElement registerbutton) {
	this.registerbutton = registerbutton;
}

}
