package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageText extends TestBase{
	LoginPage	login;
	@BeforeMethod
	public	void	setup() throws IOException
	{
	initalization();
	login	=	new	LoginPage();
	}
	@Test
	public void GetTitleTest()
	{
		String value = login.GetTitle();
		Assert.assertEquals(value, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	@Test
	public	void	verifyKiteLogoTest()
	{
	boolean value = login.verifyKiteLogo();
	Assert.assertEquals(value, true);
	}
	@Test
	public	void	verifyZerodhaLogoTest()
	{
	boolean value = login.verifyZerodhaLogo();
	Assert.assertEquals(value, true);
	}
	@Test
	public void LoginToAppTest() throws InterruptedException
	{
		String value = login.LoginToApp();
		Assert.assertEquals(value, "Akshay");
	}
	@AfterMethod
	public	void	exit() {
	driver.close();

}
}

