import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest1 {
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
	public void Opensearch()
	{
		driver.navigate().to(url);
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");

		
	}
	@Test
	public void search()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium Easy Grid Tutorials");
		driver.findElement(By.name("btnG")).click();

	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
}
