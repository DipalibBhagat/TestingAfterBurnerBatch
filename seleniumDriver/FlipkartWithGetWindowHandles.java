package seleniumDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartWithGetWindowHandles extends webDriverCommonMethods {
	public static void closeLoginWindow() {
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	}

	public static void searchProduct() {
		String product = "Laptop Bag";
		WebElement searchBar = driver.findElement(By.cssSelector("input[name='q']"));
		searchBar.sendKeys(product);
		searchBar.submit();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//img[contains(@src,'mafzrznxfrhjsqw')]")).click();

	}

	public static void handleWindows() {
		String parent = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		Iterator<String> itr = handles.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println("Title: " + driver.getTitle());
			if (driver.getTitle()
					.equals("WESLEY 16 inch Laptop Backpack DARK BLUE, Black - Price in India | Flipkart.com")) {
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl("https://www.flipkart.com/");
		closeLoginWindow();
		searchProduct();
		handleWindows();

	}

}
