package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Baseclass {
	
	@Parameters({"UserName","Password"})
	@Test
	
	private void NegativeLogin(String UserNameVal, String PasswordVal) {
		
	LoginPage login = new LoginPage();
	login.Login(UserNameVal,PasswordVal);
	login.Errorcheck();
	
	
	}
	
	@Parameters({"UserName","CorrectPassword"})
	@Test
	
	private void PositiveLogin(String UserNameVal, String PasswordVal) {
		LoginPage login = new LoginPage();
		login.Login(UserNameVal,PasswordVal);
		
	}
}
