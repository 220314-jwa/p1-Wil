package net.revature.gluecode;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import net.revature.pages.PitchHomePage;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.*;

public class LoginStepImpl {
	static WebDriver driver;
	static PitchHomePage pitchHome;
	
	@BeforeAll
	public static void setUp() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		pitchHome = new PitchHomePage(driver);
	}
	@AfterAll
	public static void closeDriver() {
		driver.quit();
	}
	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
	    pitchHome.navigateTo();
	}

	@When("the user enters the correct username")
	public void the_user_enters_the_correct_username() {
	    pitchHome.username("qro");
	}

	@When("the user enters the correct password")
	public void the_user_enters_the_correct_password() {
	    pitchHome.password("qrodro");
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
	    pitchHome.loginbtn();
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5000))
				.pollingEvery(Duration.ofMillis(50000));
		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("loginForm"), 1));
	}

}
