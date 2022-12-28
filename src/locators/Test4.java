package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nbbsgsj");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("231155jbnbhhu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'_ab8w')])[4]")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		{
			System.out.println(title);
		}
		String url = driver.getCurrentUrl();
		{
			System.out.println(url);
			
		}
	     
		if(title.equals("Instagram"))
		{
		System.out.println("pass:home page is displayed");
		}
		else
		{
			System.out.println("fail:home page is not displayed");
		}

		driver.close();
	}

}
