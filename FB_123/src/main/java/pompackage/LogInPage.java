package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	private WebDriver driver;
	
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement userName;
	

	@FindBy (xpath = "//input[@type='password']")
	private WebElement passWord;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement logInButton;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement forgetPassword;
	
	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	
	public LogInPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName() {
		userName.sendKeys("Winika");
	}
	public void sendpassWord(String user) {
		passWord.sendKeys(user);	
	}
	
    public void clickOnLoginButton () {
    	logInButton.click();
    }
    public void clickOnForgetPasswordButton () {
    	forgetPassword.click();
    }
    public void clickOnCreateNewAccButton () {
    	createNewAccount.click();
    }
    
}
