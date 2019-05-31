package MavenJenkinsGI.MavenJenkinsAI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/");
		
		WebElement element=driver.findElement(By.xpath("//*[@class='menu-item-text']//*[text()='Tutorial']"));
	
		Actions action=new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@class='menu-item-text']//*[text()='Maven']")).click();
		
		Thread.sleep(1500);
		
	
	
	
}
}
