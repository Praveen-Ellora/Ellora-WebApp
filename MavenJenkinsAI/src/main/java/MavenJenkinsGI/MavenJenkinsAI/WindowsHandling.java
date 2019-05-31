package MavenJenkinsGI.MavenJenkinsAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "P:\\CurieFramework\\WebApp_CSWA\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();	
String appurl="https://curie.health/#/app/login";
driver.get(appurl);
driver.findElement(By.id("username")).sendKeys("amit@gmail.com");	
driver.findElement(By.id("password")).sendKeys("amit123");
	//driver.findElement(By.id("password")).sendKeys(Keys.TAB);
	//driver.findElement(By.id("signin")).sendKeys(Keys.ENTER);
driver.findElement(By.id("signin")).click();
Thread.sleep(4500);
//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//driver.navigate().refresh();

String parent = driver.getWindowHandle();
//driver.findElement(By.xpath("//a[contains(@href, 'https://www.google.com/']"));
java.util.Set<String> allwindows=driver.getWindowHandles();

@SuppressWarnings("unused")
int Count=allwindows.size();

for(String child:allwindows){
	
	if(!parent.equalsIgnoreCase(child)){
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	
	driver.switchTo().window(parent);
	
	System.out.println(driver.getTitle());
	
}



		

		
		

	


		
}
}
