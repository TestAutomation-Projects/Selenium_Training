import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class WindowExample {
	static WebDriver driver;
	@Test
	public void test_CloseAllWindowsExceptMainWindow()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		System.out.println(getCurrentWindowTitle());
		String handle=getMainWindowHandle(driver);
		closeAllOtherWindows(handle);
		
		
	}
	
	public String getCurrentWindowTitle()
	{
		return driver.getTitle();
	}
	
	public String getMainWindowHandle(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
	public boolean closeAllOtherWindows(String mainWindowHandle)
	{
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String currentWindowHandle: allWindowHandles)
		{
			if(!currentWindowHandle.equals(mainWindowHandle))
			{
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(mainWindowHandle);
		if(driver.getWindowHandles().size()==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
