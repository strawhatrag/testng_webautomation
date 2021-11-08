package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

@Test
public class Login{
	
	WebDriver driver;
	@Test
	public void NegativeLogin(String UserNameVal, String PasswordVal) {
		
		LoginPage login = new LoginPage();
		login.Login(UserNameVal,PasswordVal);
		
		WebElement Error = driver.findElement(By.id("msg box"));
		
		String ActualMsg = Error.getText();
		String ExpMsg = "This email or password you have entered in invalid.";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualMsg, ExpMsg);
		soft.assertAll();
	}
	
	public void PositiveLogin(String UserNameVal, String PasswordVal) {
		LoginPage login = new LoginPage();
		login.Login(UserNameVal,PasswordVal);
		
	}
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/WebProject/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	

}
	


}
