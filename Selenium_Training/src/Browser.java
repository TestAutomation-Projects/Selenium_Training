import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {
  public static RemoteWebDriver getDriver(String browser) throws MalformedURLException
  {
	  return new RemoteWebDriver(new URL("http://192.168.0.10:4444/wd/hub"),getBrowserCapability(browser));
  }
  public static DesiredCapabilities getBrowserCapability(String browserType)
  {
	  switch(browserType)
	  {
	  case "firefox":
		  System.out.println("Get firefox driver");
		  return DesiredCapabilities.firefox();
	  case "chrome":
		 System.setProperty("remotewebdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		  System.out.println("Get the chrome driver");
		  return DesiredCapabilities.chrome();
	  case "IE":
		  System.out.println("Get the IE driver");
		  return DesiredCapabilities.internetExplorer();
	  default:
		  return DesiredCapabilities.firefox();
	  }
  }
}
