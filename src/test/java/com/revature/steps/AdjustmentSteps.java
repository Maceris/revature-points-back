package com.revature.steps;

import com.revature.runners.TestRunner;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

/**
 * Steps for adjusting points.
 */
public class AdjustmentSteps {

	private int lastPoints;

	/**
	 * Checks that the point value has changed since last seen by the specified
	 * amount.
	 *
	 * @param value The value the points should have changed by.
	 * @throws Throwable If a problem occurs.
	 */
	@Then("^The associates points should be adjusted by \"([^\"]*)\"$")
	public void the_associates_points_should_be_adjusted_by(String value)
		throws Throwable {
		String points =
			TestRunner.adjustmentPage.curPoints.getAttribute("value");
		int curPoints;
		int deltaPoints;
		try {
			curPoints = Integer.parseInt(points);
			deltaPoints = Integer.parseInt(value);
		}
		catch (NumberFormatException e) {
			// specifically different values
			curPoints = Integer.MIN_VALUE;
			deltaPoints = Integer.MIN_VALUE + 1;
		}
		Assert.assertEquals(this.lastPoints + deltaPoints, curPoints);
	}

	/**
	 * Clicks on the adjust button on the adjustments page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user clicks on the adjust button$")
	public void the_user_clicks_on_the_adjust_button() throws Throwable {
		String points =
			TestRunner.adjustmentPage.curPoints.getAttribute("value");
		try {
			this.lastPoints = Integer.parseInt(points);
		}
		catch (NumberFormatException e) {
			this.lastPoints = 0;
		}
		TestRunner.adjustmentPage.adjustButton.click();
	}

	/**
	 * Types the given text into the adjustments box.
	 *
	 * @param value The value to enter, should be a number.
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user inputs \"([^\"]*)\" as an adjustment$")
	public void the_user_inputs_as_an_adjustment(String value)
		throws Throwable {
		TestRunner.adjustmentPage.adjustmentField.clear();
		TestRunner.adjustmentPage.adjustmentField.sendKeys(value);
	}

	/**
	 * Selects Jared King on the associates page.
	 *
	 * @throws Throwable If a problem occurs.
	 */
	@When("^The user selects a known associate$")
	public void the_user_selects_a_known_associate() throws Throwable {
		Select selector =
			new Select(TestRunner.adjustmentPage.associateDropdown);
		// Jared King ID
		selector.selectByValue("11");

	}
}
