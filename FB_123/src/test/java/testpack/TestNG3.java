package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {
	
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Beforesuit-selenium");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest-selenium");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass-selenium");
		
	}
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("beforeMethod-selenium");
		
	}
@Test
public void testA() {
	System.out.println("TestA-selenium");
}
	@Test
	public void testB() {
		System.out.println("TestB-selenium");
	}
	@Test
	public void testC() {
		System.out.println("TestC-selenium");
	}
	
	@Test
	public void testD() {
		System.out.println("TestD-selenium");
	}
@AfterMethod 
public void afterMethod() {
	System.out.println("AfterMethod-selenium");
	
}

@AfterClass
public void afterClass() {
	System.out.println("AfterClass-selenium");
	
}

@AfterTest
public void afterTest() {
	System.out.println("AfterTest-selenium");
}


@AfterSuite
public void afterSuit() {
	System.out.println("Aftersuit-selenium");
}


}
