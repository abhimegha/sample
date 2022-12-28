package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).sendKeys("manager");
    driver.findElement(By.id("pass")).sendKeys("admin");
    driver.findElement(By.linkText("Forgotten password?")).click();
   
    driver.findElement(By.id("identify_email")).sendKeys("1234567891");
    driver.findElement(By.id("did_submit")).click();
  driver.close();    
    }

}
