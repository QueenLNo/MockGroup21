package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pompackage.LogInPage;
import pompackage.SignUpPage;

public class FBCreateAcc {

WebDriver driver;
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browsername) {
		
	if(browsername.equals("chrome")) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuj\\Documents\\auto\\chromedriver_win32\\chromedriver.exe");
	      
		 driver = new ChromeDriver ();

	} 
		 
	
	if(browsername.equals("Firefox")) {
	
		System.setProperty("webdriver.gecko.driver","\"C:\\Users\\Anuj\\Documents\\Automation\\geckodriver.exe\"");
	      
		 driver = new FirefoxDriver ();

	} 
			 
		
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.manage().window().maximize();

	}
	
	
	@BeforeMethod
	public void openFacebook () {
		 driver.get("https://www.facebook.com/");
		
	}
@Test
public void signIn () throws InterruptedException {
	LogInPage  logInPage = new LogInPage (driver);
	SignUpPage  signUpPage    = new SignUpPage (driver);
	
	logInPage.clickOnCreateNewAccButton();
	
	signUpPage.sendfirstName();
	Thread.sleep(3000);
	
	signUpPage.sendlastName("chavan");
	Thread.sleep(3000);
	
	signUpPage.sendmobileNumbe();
	Thread.sleep(3000);
	
	
	signUpPage.sendpassWord("kfukuu");
	Thread.sleep(3000);
	
	signUpPage.sendbirthDate();
	Thread.sleep(3000);
	
	
	signUpPage.sendbirthMonth();
	Thread.sleep(5000);
	
	signUpPage.sendbirthYear();
	
	signUpPage.clickOnmale();
	
	signUpPage.clickOnfemale();
	Thread.sleep(3000);
	
	signUpPage.clickOnsignUpButton();
	
	
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

@AfterTest
public void closebrowser() {
	driver.quit();
	
}




}


	
	

