package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
@BeforeSuite
public void beforesuite()
{
	Reporter.log("before suite is executed",true);
	}
@AfterSuite
public void aftersuite()
{
	Reporter.log("after suite is executing",true);
}
@BeforeTest
public void beforetest()
{
	Reporter.log("before test is executing",true);}

@AfterTest
public void aftertest()
{
	Reporter.log("after test is executing",true);}

@BeforeClass
public void beforeclass()
{
	Reporter.log("before class is executing",true);}

@AfterClass
public void afterclass()
{
	Reporter.log("afterclass is executing",true);}

@BeforeMethod
public void beforemethod()
{
	Reporter.log("beforemethod is executing",true);}

@AfterMethod
public void aftermethod()
{
	Reporter.log("aftermethod is executing",true);}

@Test
public void test()
{
	Reporter.log("test is executing",true);
	}
}
