package actions;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://firelawn.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Men']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(ele);
		
 List<WebElement> ele1 = driver.findElements(By.xpath("//a[text()='Sweatshirt']"));	
 
 System.out.println(ele1.size());
 
 for(WebElement i:ele1)
 {
	 System.out.println(i);
 }

	}

}
