package home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	By username = By.id("pFNGeogMLkOQ");
	By password = By.id("JMhnGmgpUgon");

	// write for all objects belongs to that page

	// Constructor

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}
	
	
	
	public void setUserid(String userid){
		driver.findElement(username).sendKeys(userid);
		
	}

	public void setPassword(String userpassword){
		driver.findElement(password).sendKeys(userpassword);
}
}
