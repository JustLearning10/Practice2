package sprint1_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sprint1.day1;



public class day2 {
	WebDriver Driver;
	//Sign_Up_Form X;
    day1 Y;

    @BeforeTest
public void Setup () {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\Page_Object_Model_POM\\chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	String URL1 = ("http://automationpractice.com/index.php");
	Driver.get(URL1);
	}	

@Test
public void OpenSignInPage () {
	Y = new day1(Driver);
	Y.OpenSignInPage();
	String SignInPageTitle = Y.SignInPageTitle();
	Assert.assertTrue(SignInPageTitle.contains("Login - My Store"));
	System.out.println(SignInPageTitle);
	}
}
