package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dropdown);
		
		s.selectByIndex(2);

		s.selectByValue("search-alias=computers-intl-ship");
		
		s.selectByVisibleText("Boys' Fashion");
	
		List<WebElement> ele = s.getOptions();
		
		System.out.println(ele.size());
		
		for(WebElement i:ele)
		{
			System.out.println(i.getText());
		}
		driver.close();
		
	
	
	}
	
	
	

}
