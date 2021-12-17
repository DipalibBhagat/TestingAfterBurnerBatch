package seleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommonMethods {
	static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDocumet\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void openApplicationUrl(String url) {
		driver.get(url);

	}
	public static void clearText(WebElement ele) {
		ele.clear();
		
		
	}
	public static void sendkeysMethod(WebElement ele,String emailId) {
		ele.sendKeys(emailId);
		
		
	}
	public static void clickMethod(WebElement ele) {
		ele.click();
		
	}
	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl("https://admin-demo.nopcommerce.com/login?returnurl=%2Fadmin%2F");
	}

}
