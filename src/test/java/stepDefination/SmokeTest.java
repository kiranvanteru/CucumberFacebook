package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars-Drivers\\chromedriver.exe");
//		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}
	@When("^i enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_username_and_valid_password(String uname, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
		
	}
	@Then("^Application should be closed$")
	public void Application_should_be_closed() throws Throwable {
		driver.close();
		
	}
}
