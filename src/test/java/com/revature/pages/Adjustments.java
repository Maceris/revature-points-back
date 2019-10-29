package com.revature.pages;

import com.revature.runners.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adjustments {

	/**
	 * The drop-down menu to select an associate.
	 */
	@FindBy(id = "associateSelect")
	public WebElement associateDropdown;

	/**
	 * The read-only field for current points.
	 */
	@FindBy(id = "currentPointsField")
	public WebElement curPoints;

	/**
	 * The field for inputting adjustment amounts.
	 */
	@FindBy(id = "adjustmentField")
	public WebElement adjustmentField;

	/**
	 * The button for submitting and adjustment.
	 */
	@FindBy(id = "adjustButton")
	public WebElement adjustButton;

	/**
	 * Initializes the elements of the page with the driver.
	 */
	public Adjustments() {
		PageFactory.initElements(TestRunner.driver, this);
	}

}
