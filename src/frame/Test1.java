package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		
		WebElement ele1 = driver.findElement(By.id("userName"));
		ele1.sendKeys("903215649");
		
		
		driver.findElement(By.id("close-pop")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("phone");
		
	}

}
