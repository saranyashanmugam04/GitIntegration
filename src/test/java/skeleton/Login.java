package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {
	WebDriver driver;
	
	@Given("user launching chromebrowser")
	public void user_launching_chromebrowser() {
	   System.setProperty("webdriver.chrome.driver","C:\\Devops Testing\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("user opens login application")
	public void user_opens_login_application() {
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String un) {
	    driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enters passwrod as {string}")
	public void user_enters_passwrod_as(String psd) {
	    driver.findElement(By.name("password")).sendKeys(psd);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.name("Login")).click();
	}

	@Then("verify login success")
	public void verify_login_success() {
		String title=driver.getTitle();
		Assert.assertEquals("Home",title );
		driver.close();
	}

}
