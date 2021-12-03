package seleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkart {
	
		static WebDriver driver;
		
		public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDocumet\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		}
		public static void openApplicationUrl() {
			driver.get("https://www.flipkart.com/");
		}
		public static void closeBrowser() {
			//driver.close();
			driver.quit();
			
		}
		public static void webApplicationInfo() {
			String title=driver.getTitle();
			System.out.println("Application Title="+title);
			String expectedtitle="Online Shopping Site ";
			if(title.equals(expectedtitle))
				System.out.println("Expected Title equal to Actual Title");
			else
				System.out.println("Expected Title not equal to Actual Title");
		}
		public static void getCurrentUrlAndPageSource() {
			String currentUrl=driver.getCurrentUrl();
			System.out.println("Application Current Url="+currentUrl);
			
			String pageSource=driver.getPageSource();
			System.out.println("Source code="+pageSource.substring(0, 20));
			
		}
		public static void navigationBackOperation() {
			driver.navigate().back();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		public static void navigationForwardOperation() {
			driver.navigate().forward();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		public static void navigationRefreshOperation() {
			driver.navigate().refresh();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
								e.printStackTrace();
			}
			
		}
		public static void navigatToOperation() {
			driver.navigate().to("https://www.google.com/");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		public static void main(String[] args) {
			launchBrowser();
			openApplicationUrl();
			
			webApplicationInfo();
			getCurrentUrlAndPageSource();
			navigationBackOperation();
			navigationForwardOperation();
			navigationRefreshOperation();
			navigatToOperation();
			closeBrowser();
			
			
			
			
			
			
			
			
		}
		
		
	

}
