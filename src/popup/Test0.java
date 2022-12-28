package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));

Actions a=new Actions(driver);
a.moveToElement(ele).perform();

driver.findElement(By.xpath("//a[text()='munit testing ']")).click();

driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();


Alert alt = driver.switchTo().alert();
Thread.sleep(3000);

//if we want to click on ok

alt.accept();

//if we want to click on cancel

//alt.dismiss();
driver.close();
	}

}
