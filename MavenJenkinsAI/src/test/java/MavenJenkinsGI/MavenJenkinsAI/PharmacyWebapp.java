package MavenJenkinsGI.MavenJenkinsAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PharmacyWebapp {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				//driver.manage().window().maximize();	
		String appurl="https://curie-doctor.firebaseapp.com/#/app/login";
		driver.get(appurl);
		driver.findElement(By.id("username")).sendKeys("thangam@gmail.com");	
		driver.findElement(By.id("password")).sendKeys("thangam");
		driver.findElement(By.id("signin")).click();
		Thread.sleep(3000);
		
	driver.manage().window().maximize();	
	driver.findElement(By.xpath("//*[@id='embededcomponents']/div/div[2]/table/tbody/tr[3]/td[5]")).click();
	
	Thread.sleep(1500);
	driver.findElement(By.xpath("//*[@id='addpatient']")).click();
	
	
/*	driver.findElement(By.id("mobile1")).sendKeys("9789589562");
	
	driver.findElement(By.id("name")).sendKeys("Raajavel Pandiyan");
		
	driver.findElement(By.id("problem")).sendKeys("Accident");
	
	driver.findElement(By.id("email")).sendKeys("pf2411@gmail.com");
	
	//driver.findElement(By.xpath("//*[@type='submit']//following::button[1]")).click();
	
	driver.findElement(By.xpath("//*[@id='embededcomponents']/div/div[3]/div[2]/div[1]/div/div/div[2]/div[3]/center/button[1]")).click();*/
	Thread.sleep(1500);

	
	}
}