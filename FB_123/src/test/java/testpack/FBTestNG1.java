package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompackage.LogInPage;

public class FBTestNG1 {
	
	WebDriver driver;
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforesuit-Automation");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest-Automation1");
	}
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuj\\Documents\\auto\\chromedriver_win32\\chromedriver.exe");
	      
		 driver = new ChromeDriver ();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.manage().window().maximize();

	}
	
	@BeforeMethod
	public void openFacebook () {
		 driver.get("https://www.facebook.com/");
		
	}
@Test
public void logIn () throws InterruptedException {
	LogInPage  logInPage = new LogInPage (driver);
	
	logInPage.sendUserName();
	Thread.sleep(3000);
	logInPage.sendpassWord("1234565");
	Thread.sleep(3000);
	logInPage.clickOnLoginButton();
	Thread.sleep(3000);
	
	String expectedTitle = "Facebook – log in or sign up";
	String actualTitle = driver.getTitle();
	
	String expectedURL = "https://www.facebook.com/";
	String actualURL = driver.getCurrentUrl();
	
	if (actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
	{
		System.out.println("Passed");
	}
	else 
	{
		System.out.println("Failed");
    }
	


	}

@AfterMethod 
public void closeTab() {
	driver.close();
	
}

@AfterClass
public void closebrowser() {
	driver.quit();
	
}


@AfterTest
public void afterTest() {
	System.out.println("afterTest-Automation1");
}
@AfterSuite
public void afterSuit() {
	System.out.println("Aftersuit-Automation");
}

}

