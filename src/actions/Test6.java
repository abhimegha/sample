package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Actions a=new Actions(driver);

WebElement ele = driver.findElement(By.id("course"));
a.moveToElement(ele).perform();

driver.findElement(By.linkText("Selenium Training")).click();

WebElement ele1 = driver.findElement(By.id("add"));
a.doubleClick(ele1).perform();

	}

}
