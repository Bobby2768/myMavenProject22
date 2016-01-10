package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import home_Page.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.starbucks.com/account/signin");
	}
	

	
	@Test
	public void LoginApp(){
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserid("Test");
		lp.setPassword("hello");
	}

}
