package com.revature.steps;

import com.revature.pages.Site;
import com.revature.runners.TestRunner;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Steps for logging out.
 */
public class LogoutSteps {
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
