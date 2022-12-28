package windowmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.com/");
      Thread.sleep(5000);
  
          //full screen
      driver.manage().window().fullscreen();
      Thread.sleep(5000);
      
      //minimize
      driver.manage().window().minimize();
      Thread.sleep(5000);
     
      
	}

}
