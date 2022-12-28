package navigationapi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.myntra.com/");
     driver.navigate().back();
     Thread.sleep(5000);
     
     driver.navigate().forward();
     Thread.sleep(5000);
     
     driver.navigate().refresh();
     Thread.sleep(5000);
     
     driver.close();
     
     
     
	}

}
