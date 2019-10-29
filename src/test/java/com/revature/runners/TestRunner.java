package com.revature.runners;

import com.revature.pages.LoginPage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Runs the cucumber tests.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.revature.steps")
public class TestRunner {
	/**
	 * The driver to use for testing.
	 */
	public static WebDriver driver;

	/**
	 * The login page.
	 */
	public static LoginPage loginPage;

	/**
	 * Set up before all tests.
	 */
	@BeforeClass
	public static void setUp() {
		File file = new File("src/main/resources/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		loginPage = new LoginPage();
	}

	/**
	 * Tear down after all tests.
	 */
	@AfterClass
	public static void teardown() {
		driver.quit();
	}

}
