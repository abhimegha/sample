package navigationapi;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.amazon.com/");
  Thread.sleep(5000);
  
  driver.navigate().to("https://www.myntra.com/");
  Thread.sleep(5000);
  driver.close();
	}

}
