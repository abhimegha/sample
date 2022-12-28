package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://firelawn.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


WebElement ele1 = driver.findElement(By.xpath("//a[text()='Men']"));

Actions a=new Actions(driver);
 
 
 a.moveToElement(ele1).perform();
 WebElement ele2 = driver.findElement(By.xpath("//a[text()='Sweatshirt']"));
Select s=new Select(ele2);

List<WebElement> ele3 = s.getOptions();

System.out.println(ele3.size());





for(WebElement i:ele3)
{
	System.out.println(i);
}
driver.close();
 
 
	}

}
