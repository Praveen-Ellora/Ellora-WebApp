package MavenJenkinsGI.MavenJenkinsAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRatio {

	
public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		String appurl="https://www.toolsqa.com/automation-practice-form";
		driver.get(appurl);
		
		WebElement element=driver.findElement(By.id("sex-1"));
		element.click();
		
		driver.findElement(By.id("profession-1")).click();
		
		boolean staus = driver.findElement(By.id("sex-0")).isSelected();
		
		if(staus){
			
			System.out.println("Naadum Naatu Makkalum Naasamai Pogattum");
		}
		
}
}
