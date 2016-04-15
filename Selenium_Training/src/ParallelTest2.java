import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest2 {
   public static RemoteWebDriver driver;
   public static String url="http://www.google.com";
	@BeforeClass
	@Parameters("BrowserType")
	public void setup(String browserType) throws MalformedURLException
	{
		driver=Browser.getDriver(browserType);
		driver.manage().window().maximize();
	}
	
	@Test
	public void search()
	{
		driver.navigate().to(url);
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");

		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
}
