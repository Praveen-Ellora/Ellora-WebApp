package MavenJenkinsGI.MavenJenkinsAI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")

public class Open_Close_Browsers {
	
public static void main(String[] args){
		
ChromeOptions options = new ChromeOptions();

// ************** Disable Notifications ***************

//options.addArguments("--disable-notifications");
		
System.setProperty("webdriver.chrome.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

//WebDriver driver =new ChromeDriver(options);
		
/*System.setProperty("webdriver.gecko.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\geckodriver.exe");	

WebDriver driver=new FirefoxDriver();*/

driver.manage().window().maximize();

//driver.get("https://patientapp-d92af.firebaseapp.com/#/Praveen%20Dental%20Clinic");

driver.get("https://curie.health/#/app/pharmalogin");

driver.findElement(By.id("username")).sendKeys("thangam@gmail.com");
driver.findElement(By.id("password")).sendKeys("thangam");

driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

driver.findElement(By.id("signin")).click();
		
	}

}
