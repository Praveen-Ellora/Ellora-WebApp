package MavenJenkinsGI.MavenJenkinsAI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TableList {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				//driver.manage().window().maximize();	
		String appurl="https://curie.health/#/app/login";
		driver.get(appurl);
		driver.findElement(By.id("username")).sendKeys("amit@gmail.com");	
		driver.findElement(By.id("password")).sendKeys("amit123");
		driver.findElement(By.id("signin")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='button']//*[text()=' DASHBOARD']")).click();
		driver.findElement(By.xpath("//img[@src='/img/cash.c7b49b6.png']")).click();
		//driver.manage().window().maximize();
		
driver.findElement(By.id("startpic_ct")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Feb 2019')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//span[contains(@class,'cell month') and text()='January']")).click();	   	    
		    driver.findElement(By.xpath("//span[contains(@class,'cell day') and text()='6']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("endpic_ct")).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Feb 2019')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'January')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(@class,'cell day') and text()='6']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Select s1=new Select(driver.findElement(By.id("facility_ct")));
		
		s1.selectByVisibleText("Christian Fellowship Nursing Home");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		List<WebElement> childs1 = driver.findElements(By.xpath("//*[@id='embededcomponents']/div/div[2]/div/div[2]/div[1]/button"));
//		//List<WebElement> childs1 = driver.findElements(By.xpath("//button[contains(text(),'Submit')]"));
//		System.out.println(childs1);
		driver.findElement(By.xpath("//*[@id='embededcomponents']/div/div[2]/div/div[2]/div[1]/button")).click();

		
		
	}
}
