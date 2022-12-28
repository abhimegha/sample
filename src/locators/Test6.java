package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abghtdgdn");
		driver.findElement(By.id("pass")).sendKeys("12548hhgdhd");
		driver.findElement(By.name("pass")).click();
		
		String title = driver.getTitle();
		{
			System.out.println(title);
		}
		String url = driver.getCurrentUrl();
		{
			System.out.println(url);
		}
		if(title.equals("Facebook – log in or sign up"))
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
