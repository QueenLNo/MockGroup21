package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
private WebDriver driver;
	

	
	@FindBy (xpath = "(//input[@data-type='text'])[1]")
	private WebElement firstName;
	
	@FindBy (xpath = "(//input[@data-type='text'])[2]")
	private WebElement lastName;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	private WebElement mobileNumber;
	
	@FindBy (xpath = "//input[@name='reg_passwd__']")
	private WebElement passWord;
	
	
	@FindBy (xpath = "//select[@aria-label='Day']")
	private WebElement birthDate;
	
	@FindBy (xpath = "//select[@aria-label='Month']")
	private WebElement birthMonth;
	
	@FindBy (xpath = "//select[@aria-label='Year']")
	private WebElement birthYear;
	
	@FindBy (xpath = "(//input[@type='radio'])[1]")
	private WebElement female;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]")
	private WebElement male;
	
	@FindBy (xpath = "(//input[@type='radio'])[3]")
	private WebElement custom;
	
	@FindBy (xpath = "//button[text()='Sign Up']")
	private WebElement signUpButton;
	
	
	public SignUpPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendfirstName() {
		firstName.sendKeys("Winika");
	}
	
	public void sendlastName(String user) {
		lastName.sendKeys(user);
	}
	
	public void sendmobileNumbe() {
		mobileNumber.sendKeys("1234567890");
	}
	public void sendpassWord(String user) {
		passWord.sendKeys(user);	
	}
	
	
	public void sendbirthDate() {
		
    Select s = new Select (birthDate);
		s.selectByVisibleText("7");	
	}
	public void sendbirthMonth() {
		
		Select s = new Select (birthMonth);
		s.selectByVisibleText("Jul");	
	}
	public void sendbirthYear() {
		
		Select s = new Select (birthYear);
		s.selectByVisibleText("1982");
	}
	public void clickOnfemale() {
		female.click();	
	}
	public void clickOnmale() {
		male.click();	
	}
	
	public void clickOnsignUpButton() {
		signUpButton.click();	
	}
	
	
	
	
	
}
