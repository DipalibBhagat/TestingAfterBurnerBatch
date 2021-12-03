package seleniumDriver;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver {
	static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDocumet\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
	}
	public static void openApplicationUrl() {
		driver.get("https://www.google.com/");
		
		
	}
	public static void closeBrowser() {
		driver.close();
		
	}
	public static void webApplicationInfo() {
		
		String expectdTitle= "google";
		
		String title=driver.getTitle();
		System.out.println("Application Title="+title);
		if(title.equals(expectdTitle))
			System.out.println("Actual title is equal to Expected title");
		else
			System.err.println("Actual title is not equal to Expected title[Actual title="+title+"]");
		
	}
	public static void  getCurrentUrlAndPageSource() {
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current Url="+currentUrl);
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source="+pageSource.substring(0, 10));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void navigationOperation() {
		driver.navigate().back();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.flipkart.com/");
		
		
		
	}
	
	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl();
		//closeBrowser();
		webApplicationInfo();
		getCurrentUrlAndPageSource();
		navigationOperation();
		
		
		
		
		
	} 

}
