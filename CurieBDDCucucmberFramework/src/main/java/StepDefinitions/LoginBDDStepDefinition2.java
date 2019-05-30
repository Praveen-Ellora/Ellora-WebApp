package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginBDDStepDefinition2 {
	
	WebDriver driver=null;
	@Given("^Url2 of application$")
	public void url_of_app()
	{
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("https://curie-doctor.firebaseapp.com/#/app/login");
	       driver.manage().window().maximize();
		
	}
	
	
	@When("^Url2 is opened$")
	public void url_is_opened() throws InterruptedException
	{
		  String title=driver.getTitle();
		  System.out.println("Appplictaion tiltle is :  " +title);
		  /*//Clicking login menu button   
		  driver.findElement(By.xpath("//*[@class='hamburger']/div")).click();
		   
		  //clicking Login button
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@class='nav-wrapper']/nav/a[1]")).click();*/
		
		
	}
	
	//regular expression for username and password is \"(.*)\"
	
//	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
//	 public void user_enter_username_and_password(String username,String password)
//	{
//		
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
	
//	@Then("^user enter <Username> and <Password>$")
//	public void user_enter_username_and_password()
//	{
//		
//		driver.findElement(By.id("username")).sendKeys("amit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("amit123");
//		
//	}
//	
	
     @Then("^User2 enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	
	
	@Then("^User2 user clicks Login button$")
	public void user_user_clicks_Login_button()
	{
		driver.findElement(By.id("signin")).click();
	}
	
	
	
	@Then("^click all main menu at the top$")
	public void click_All_Main_MenuAt_Top()
	{
		driver.findElement(By.id("signin")).click();
		
	}
	
	@Then("^User2 is on home page$")
	public void user_is_on_home_page()
	{
		
		String title=driver.getTitle();
		System.out.print("Homepage title is :" +title);
		
		
		
	}

}
