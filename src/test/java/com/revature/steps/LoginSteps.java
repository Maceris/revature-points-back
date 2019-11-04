package com.revature.steps;

import com.revature.pages.Site;
import com.revature.runners.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Steps for the login process.
 */
public class LoginSteps {

	/**
	 * Click the trainer button on the login page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user clicks on the trainer button$")
	public void the_user_clicks_on_the_trainer_button() throws Throwable {
		TestRunner.loginPage.trainerButton.click();
	}

	/**
	 * Navigates the user to the login page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@Given("^The user is on the login page$")
	public void the_user_is_on_the_login_page() throws Throwable {
		TestRunner.driver.get(Site.URL);
	}

	/**
	 * Clicks the login button on the login page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user presses the login button$")
	public void the_user_presses_the_login_button() throws Throwable {
		TestRunner.loginPage.loginButton.click();
	}

	/**
	 * Types the given string into the password field on the login page.
	 *
	 * @param password The password.
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user types \"([^\"]*)\" into the password field$")
	public void the_user_types_into_the_password_field(String password)
		throws Throwable {
		TestRunner.loginPage.passwordField.sendKeys(password);
	}

	/**
	 * Types the given string into the username field on the login page.
	 *
	 * @param username The username to use.
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user types \"([^\"]*)\" into the username field$")
	public void the_user_types_into_the_username_field(String username)
		throws Throwable {
		TestRunner.loginPage.usernameField.sendKeys(username);
	}

}
