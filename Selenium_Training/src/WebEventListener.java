import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener implements WebDriverEventListener {

	@Override
	public void afterChangeValueOf(WebElement we, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Change value " + we.getText());
		
		
	}

	@Override
	public void afterClickOn(WebElement we, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Click " + we.toString());

	}

	@Override
	public void afterFindBy(By type, WebElement we, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String value, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement we, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Change value " + we.getText());

	}

	@Override
	public void beforeClickOn(WebElement we, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Click " + we.toString());

	}

	@Override
	public void beforeFindBy(By Type, WebElement we, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Trying to find the element by: " + Type.toString());

		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigate Back");

	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigating Forward");

		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigating to: " +  url);

		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
