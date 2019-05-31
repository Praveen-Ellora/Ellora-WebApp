package MavenJenkinsGI.MavenJenkinsAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String appurl="https://www.google.com/";
		driver.get(appurl);
		
				
		driver.findElement(By.xpath("//*[@type='submit']//following::input[3]")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to(appurl);
		
		driver.close();
			
}
}
