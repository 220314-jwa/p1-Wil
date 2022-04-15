package net.revature.pages;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Wait;

	// following the page object model design pattern,
	// this class will represent what the pet app home page
	// is like and what interactions we might want to do
public class PitchHomePage {	
		WebDriver driver;
		
		// PageFactory allows you to use annotations to have Selenium instantiate your
		// WebElement fields for you
		@FindBy(id="username")
		WebElement usernameInput;
		@FindBy(id="password")
		WebElement passwordInput;
		@FindBy(id="loginbtn")
		WebElement loginbtn;
		// TODO
	
		
		public PitchHomePage(WebDriver driver) {
			this.driver = driver;
			
			// tells Selenium to find the elements based on the annotations above
			PageFactory.initElements(driver, this);
		}
		
		public void navigateTo() {
			driver.get("C:\\Users\\densl\\OneDrive\\Documents\\Revature2022\\PITCHYAPRO\\login.html");
		}
		
		public void username(String username) {
			usernameInput.sendKeys(username);
		}
		
		public void password(String password) {
			passwordInput.sendKeys(password);
		}
		
		public void loginbtn() {

		}


	
}
