package TestCase;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogicalProgram {

	@Test @DataProvider(name="loginusers")
	public void fbusers(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9300528%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwlqOXBhBqEiwA-hhitKp0aq5sF-CSlor_P2FRIiRANW43d7Ec7pPm3jBVdgIeGgxyKBlW2xoCXRUQAvD_BwE");
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("password");
		driver.findElement(By.xpath("(//button[text()=\"Sign Up\"])[1]")).click();
	}
		@DataProvider(name="loginusers")
		public Object[][] testdata1()
		{
			Object [][] obj=new Object [2][2];
			obj[0][0]="username";
			obj[0][1]="password";
			obj[1][0]="username";
			obj[1][1]="password";
			return obj;	
		}
		
}
		
		

	


