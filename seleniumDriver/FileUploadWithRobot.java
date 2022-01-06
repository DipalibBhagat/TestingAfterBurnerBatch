package seleniumDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadWithRobot {
	static WebDriver driver;

	@Test(priority = 1)
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDocumet\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 2)
	public static void openApplicationUrl() {
		driver.get("https://pdf2doc.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 3)
	public void getElement() {
		driver.findElement(By.xpath("//label[@for='fileSelector']")).click();
	}

	@Test(priority = 4)
	public void fileUpload() throws AWTException, InterruptedException {

		Thread.sleep(5000);
		StringSelection selection = new StringSelection("C:\\javaprogram\\712.pdf");
		Robot robot = new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(5000);

	}

	// @Test(priority = 5)
	public void downloadFile() throws AWTException {
		driver.findElement(By.xpath("//span[@class= 'file-button__text file-button__text_title']")).click();

	}

	@Test(priority = 5)
	public void downloadFileWithRobot() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

	}

	@Test(priority = 6)
	public void verifyDownloadedFile() {
		Boolean flag = false;

		File file = new File("C:\\Users\\Ramesh\\Downloads");
		File[] listFile = file.listFiles();

		for (int i = 0; i < listFile.length; i++) {
			if (listFile[i].getName().equals("712.doc")) {

				flag = true;
				break;

			}

		}
		if (flag == true) {
			System.out.println("file is found");
		} else {
			System.out.println("file is not found");
		}

	}

}
