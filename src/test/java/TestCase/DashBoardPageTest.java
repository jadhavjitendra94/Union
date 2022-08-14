package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.LoginPage;

public class DashBoardPageTest extends TestBase{
	LoginPage login;
	DashBoardPage dash;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initalization();
	    login=new LoginPage();
		login.LoginToApp();
		 dash=new DashBoardPage();
		
	}
	
	@Test
	public void VerifyusernameTest() throws InterruptedException
	{
		String value = dash.Verifyusername();
		Assert.assertEquals(value, "Akshay Rohidas Jagadale");
	}
	@Test
	public void VerifyemaiidTest() throws InterruptedException
	{
		String value = dash.Verifyemailid();
		Assert.assertEquals(value, "jadhavjitendra378@gmail.com");
	}
	@Test
	public void PlaceGTTorder() throws InterruptedException
	{
		dash.PlaceGTTorder();
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	

}
