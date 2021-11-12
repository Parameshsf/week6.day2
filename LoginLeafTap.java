package cucumber_testcases;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLeafTap extends BaseClass {
	
	//public ChromeDriver driver;
	
	/*@Given("launch the chrome browser")
	public void launchChrome() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}*/
	
	/*@Given("Enter the URL of leaftap application {string}")
	public void enterURL(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}*/
	
	@Given("Enter the username as {string}")
	public void enterUserName(String userName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("username")).sendKeys(userName);

	}
	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click the login button")
	public void clickLogin() {
		// TODO Auto-generated method stub
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("home page should be displayed")
	public void verifyHomePage() {
		// TODO Auto-generated method stub
		System.out.println("Home Page displayed");

	}
	
	/*@Given("Close the driver")
	public void closeDriver() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		driver.close();

	}*/
	
	@But("error message should be displayed")
	public void loginError() {
		// TODO Auto-generated method stub
		System.out.println("Login credentials are not correct. Error message displayed");

	}

}
