package com.revature.steps;

import com.revature.pages.Site;
import com.revature.runners.TestRunner;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Steps for logging out.
 */
public class LogoutSteps {

	/**
	 * Presses the logout button on the dashboard.
	 * 
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user presses the logout button$")
	public void the_user_presses_the_logout_button() throws Throwable {
		if (TestRunner.dashboard.navbarToggleButton.isDisplayed()) {
			TestRunner.dashboard.navbarToggleButton.click();
		}
		TestRunner.dashboard.logoutButton.click();

	}

	/**
	 * Checks that the user is on the login page.
	 * 
	 * @throws Throwable If a problem occurs.
	 */
	@Then("^The user should be on the login page$")
	public void the_user_should_be_on_the_login_page() throws Throwable {
		Assert.assertEquals(Site.URL + "login",
			TestRunner.driver.getCurrentUrl());
	}

}
