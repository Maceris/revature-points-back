package com.revature.pages;

import com.revature.runners.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The login page for the site.
 */
public class LoginPage {
	
	/**
	 * The username input field.
	 */
	@FindBy(id = "usernameField")
	public WebElement usernameField;

	/**
	 * The password input field.
	 */
	@FindBy(id = "passwordField")
	public WebElement passwordField;

	/**
	 * The login button.
	 */
	@FindBy(id = "loginButton")
	public WebElement loginButton;

	/**
	 * Initializes the elements of the page with the driver.
	 */
	public LoginPage() {
		PageFactory.initElements(TestRunner.driver, this);
	}

}
