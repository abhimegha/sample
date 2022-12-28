package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("nmmbjjjhkjhkjh");
		driver.findElement(By.id("password")).sendKeys("11244nbvfhgjhjh,");
		driver.findElement(By.id("last")).click();
		String title = driver.getTitle();
		{
			System.out.println(title);
		}
		String url = driver.getCurrentUrl();
		{
			System.out.println(url);
			
			
		}
		if(title.equals("SkillRary Courses"))
		{
			
			
			System.out.println("Pass:homepage is displayed");
		
			
		}
			else
		{
			System.out.println("fail : homepage is not displayed");
		}
		driver.close();	
	}

}
