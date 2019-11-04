package com.revature.pages;

import com.revature.runners.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The dashboard page.
 * 
 */
public class Dashboard {

	/**
	 * The logout button.
	 */
	@FindBy(id = "logoutButton")
	public WebElement logoutButton;

	/**
	 * Allows for toggling the navbar.
	 */
	@FindBy(id = "navbarToggler")
	public WebElement navbarToggleButton;

	/**
	 * Initializes the elements of the page with the driver.
	 */
	public Dashboard() {
		PageFactory.initElements(TestRunner.driver, this);
	}
}
