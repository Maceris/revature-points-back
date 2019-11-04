package com.revature.steps;

import com.revature.pages.Site;
import com.revature.runners.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Steps for navigation between pages.
 */
public class NavigationSteps {

	private void ensureElementVisible(WebElement toClick) {
		WebElement navbarToggler =
			TestRunner.driver.findElement(By.id("navbarToggler"));
		if (!toClick.isDisplayed()) {
			if (navbarToggler.isDisplayed()) {
				navbarToggler.click();
			}
		}
	}

	/**
	 * Finds and clicks on the adjustments button.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user clicks on the adjustments button$")
	public void the_user_clicks_on_the_adjustments_button() throws Throwable {
		WebElement adjustButton =
			TestRunner.driver.findElement(By.id("adjustmentsButton"));
		this.ensureElementVisible(adjustButton);
		adjustButton.click();
	}

	/**
	 * Finds and clicks on the dashboard button.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user clicks on the dashboard button$")
	public void the_user_clicks_on_the_dashboard_button() throws Throwable {
		WebElement dashButton =
			TestRunner.driver.findElement(By.id("dashboardButton"));
		this.ensureElementVisible(dashButton);
		dashButton.click();
	}

	/**
	 * Finds and clicks on the store button.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user clicks on the store button$")
	public void the_user_clicks_on_the_store_button() throws Throwable {
		WebElement storeButton =
			TestRunner.driver.findElement(By.id("storeButton"));
		this.ensureElementVisible(storeButton);
		storeButton.click();
	}

	/**
	 * Logs in as a known trainer.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@Given("^The user is logged in as a trainer$")
	public void the_user_is_logged_in_as_a_trainer() throws Throwable {
		TestRunner.driver.get(Site.URL);
		TestRunner.loginPage.usernameField.sendKeys("aranieri");
		TestRunner.loginPage.passwordField.sendKeys("password");
		TestRunner.loginPage.trainerButton.click();
		TestRunner.loginPage.loginButton.click();
	}

	/**
	 * Logs the user in as a known associate.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@Given("^The user is logged in as an associate$")
	public void the_user_is_logged_in_as_an_associate() throws Throwable {
		TestRunner.driver.get(Site.URL);
		TestRunner.loginPage.usernameField.sendKeys("jking");
		TestRunner.loginPage.passwordField.sendKeys("password");
		TestRunner.loginPage.associateButton.click();
		TestRunner.loginPage.loginButton.click();
	}

	/**
	 * Presses the logout button on the dashboard.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user presses the logout button$")
	public void the_user_presses_the_logout_button() throws Throwable {
		WebElement logoutButton =
			TestRunner.driver.findElement(By.id("logoutButton"));
		this.ensureElementVisible(logoutButton);
		logoutButton.click();
	}

	/**
	 * Checks that the user is on the adjustments page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@Then("^The user should be on the adjustments page$")
	public void the_user_should_be_on_the_adjustments_page() throws Throwable {
		Assert.assertEquals(Site.URL + "adjustments",
			TestRunner.driver.getCurrentUrl());
	}

	/**
	 * Checks that the user is now on the dashboard page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@Then("^The user should be on the dashboard page$")
	public void the_user_should_be_on_the_dashboard_page() throws Throwable {
		Thread.sleep(1000);
		Assert.assertEquals(Site.URL + "dashboard",
			TestRunner.driver.getCurrentUrl());
	}

	/**
	 * Checks that the user is on the store page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@Then("^The user should be on the store page$")
	public void the_user_should_be_on_the_store_page() throws Throwable {
		Assert.assertEquals(Site.URL + "store",
			TestRunner.driver.getCurrentUrl());
	}
}
