package seleniumDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AbsoluteXpath extends webDriverCommonMethods {
	public static void validateEmail(String email) {
		String regex = "^[a-zA-Z+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher= pattern.matcher(email);
		
		if(matcher.matches())
			System.out.println("Email ID is Valid");
		else
			System.out.println("Email Id is not Valid");
		
		
	}
	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl("https://admin-demo.nopcommerce.com/login?returnurl=%2Fadmin%2F");
		WebElement emailfield = driver.findElement(By.xpath("//input[contains(@class,'email')]"));
		clearText(emailfield);
		sendkeysMethod(emailfield, "admin@yourstore.com");
		String emailId =  driver.findElement(By.xpath("//input[contains(@class,'email')]")).getAttribute("value");
		//System.out.println("Email Id "+emailId);
		validateEmail(emailId);
	
		
		//Handle CheckBox.
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='Password']"));
		clearText(passwordField);
		sendkeysMethod(passwordField, "admin");
		
		 WebElement checkBoxField = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 if(checkBoxField.isSelected())
			 System.out.println("Checkbox is checked");
		 else
			 System.out.println("Checkbox is not checked");
		 
		 //Handle Lebel.
		 WebElement lebelRemember = driver.findElement(By.xpath("//label[@for='RememberMe']"));
		 String actualLebel = lebelRemember.getText();
		 String expectedLebel = "remember me?";
		 if(actualLebel.equals(expectedLebel))
			 System.out.println("Lebel match");
		 else
			 System.out.println("Lebel is different");
		 
			 
		 //Handle Login button
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		if(loginBtn.isEnabled())
			System.out.println("Login button enabled");
		else
			System.out.println("Login button Disabled");
		clickMethod(loginBtn);

	}

}
