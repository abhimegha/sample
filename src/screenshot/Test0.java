package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Type casting
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//access the method and photo will be stored in RAM
		
		File ele = ts.getScreenshotAs(OutputType.FILE);
		
		//specify the location where photo should be stored
		
		File loc=new File("./skillrary.png");
		
		//copy paste from RAM to your location
		
		FileUtils.copyFile(ele, loc);
		driver.close();
		
	}

}
