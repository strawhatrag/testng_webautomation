package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import testing.Baseclass;

public class LoginPage {
	
	WebDriver driver = Baseclass.driver;
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(linkText="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Remember;
	
	@FindBy(linkText="btn_login")
	WebElement LoginButton;
	
	@FindBy(linkText="msg_box")
	WebElement Error;


	public void Login(String UName, String Pwd) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectionConditions.visiblilityof(LoginLink));
		
		LoginLink.click();
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		Remember.click();
		LoginButton.click();
		
		
	}
	
	public void Errorcheck() {
		String ActualMsg = Error.getText();
		String ExpMsg = "the email is invalid";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualMsg, ExpMsg);
		soft.assertAll();

	}

}