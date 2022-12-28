package actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test10 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

WebElement dd = driver.findElement(By.id("month"));

Select s=new Select(dd);

s.selectByIndex(1);
s.selectByValue("8");
s.selectByVisibleText("May");

List<WebElement> ele = s.getOptions();
System.out.println(ele.size());
ArrayList a=new ArrayList();


for(WebElement i: ele) {
	String text=i.getText();
System.out.println(text);
a.add(text);
}
{
	System.out.println(s.isMultiple());
	
}
System.out.println("*******************after sorting********************");
Collections.sort(a);

for(Object o:a)
	
{
	System.out.println(o);
}
driver.close();


}

	}


