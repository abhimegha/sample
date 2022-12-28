package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 driver.findElement(By.id("username")).sendKeys("manager");
 driver.findElement(By.name("pwd")).sendKeys("admin");
 driver.findElement(By.xpath("//div[text()='Login ']")).click();
 String title = driver.getTitle();
 System.out.println(title);
 
 String url = driver.getCurrentUrl();
 System.out.println(url);
 
 if(title.equals("actiTIME - Login"))
 {
	 System.out.println("pass:homepage is displayed");
 }
 else
 {
	 System.out.println("fail:homepage is not displayed");
 }
 driver.close();
 
	}

}
