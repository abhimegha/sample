package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbutton;
	
	public Facebook(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
		public void usernameTextbox(String name) {
			
			usernametb.sendKeys(name);
		}
		public void passwordTextbox(String pwd) {
			passwordtb.sendKeys(pwd);
		}
		public void loginbutton() {
			
			loginbutton.click();
		}
		
		
		
	}
	
	


