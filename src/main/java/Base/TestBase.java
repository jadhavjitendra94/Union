package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public	static	WebDriver	driver;
	
	public String ReadPropertyfile(String value) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\26FEB2022\\src\\main\\java\\Config\\Config.property");
	
		prop.load(file);
		return prop.getProperty(value);
		
	}
	
	
	public	void	initalization() throws IOException
	{
	System.setProperty("webdriver.chrome.driver",	"chromedriver.exe");
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	driver	=	new	ChromeDriver(op);
	driver.manage().window().maximize();
//	driver.get("https://kite.zerodha.com/");
	driver.get(ReadPropertyfile("url"));
	driver.manage().timeouts().implicitlyWait(10,	TimeUnit.SECONDS);

}
}
