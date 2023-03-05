package testpack;

import java.util.concurrent.TimeUnit;

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



public class TestNG2 {
	
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Beforesuit-Automation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest-Automation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass-Automation");
		
	}
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("beforeMethod-Automation");
		
	}
@Test
public void test1() {
	System.out.println("Test1-Automation");
}
	@Test
	public void test2() {
		System.out.println("Test2-Automation");
	}
	@Test
	public void test3() {
		System.out.println("Test3-Automation");
	}
	
	@Test
	public void test4() {
		System.out.println("Test4-Automation");
	}
@AfterMethod 
public void afterMethod() {
	System.out.println("AfterMethod-Automation");
	
}

@AfterClass
public void afterClass() {
	System.out.println("AfterClass-Automation");
	
}

@AfterTest
public void afterTest() {
	System.out.println("AfterTest-Automation");
}


@AfterSuite
public void afterSuit() {
	System.out.println("Aftersuit-Automation");
}

}