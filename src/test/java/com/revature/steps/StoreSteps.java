package com.revature.steps;

import com.revature.runners.TestRunner;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class StoreSteps {

	private static final String REWARD_NAME = "TestReward"
		+ Integer.toString((int) (Math.random() * Integer.MAX_VALUE));
	private static final int REWARD_STOCK = 1;
	private static final int REWARD_COST = 1234;

	private int rewardId;

	@When("^The user inputs the prize value as an adjustment$")
	public void the_user_inputs_the_prize_value_as_an_adjustment()
		throws Throwable {
		TestRunner.adjustmentPage.adjustmentField
			.sendKeys(Integer.toString(REWARD_COST));
	}

	@When("^The user clicks on the create button$")
	public void the_user_clicks_on_the_create_button() throws Throwable {
		TestRunner.driver.findElement(By.id("createButton")).click();
	}

	@When("^The user enters a prize name$")
	public void the_user_enters_a_prize_name() throws Throwable {
		TestRunner.driver.findElement(By.id("editName")).sendKeys(REWARD_NAME);
	}

	@When("^The user enters a prize price$")
	public void the_user_enters_a_prize_price() throws Throwable {
		TestRunner.driver.findElement(By.id("editPrice"))
			.sendKeys(Integer.toString(REWARD_COST));
	}

	@When("^The user enters a prize stock$")
	public void the_user_enters_a_prize_stock() throws Throwable {
		TestRunner.driver.findElement(By.id("editStock"))
			.sendKeys(Integer.toString(REWARD_STOCK));
	}

	@When("^The user clicks on the submit edit button$")
	public void the_user_clicks_on_the_submit_edit_button() throws Throwable {
		TestRunner.driver.findElement(By.id("submitEditButton")).click();
	}

	@When("^The user clicks on the buy button for the new prize$")
	public void the_user_clicks_on_the_buy_button_for_the_new_prize()
		throws Throwable {
		WebElement reward = TestRunner.driver.findElement(
			By.xpath("//b[contains(text(),'" + REWARD_NAME + "')]"));
		String idString = reward.getAttribute("id");
		idString = idString.replaceAll("rewardName", "");
		int id;
		// exception here counts as failing test
		id = Integer.parseInt(idString);
		this.rewardId = id;
		Thread.sleep(1000);
		TestRunner.driver.findElement(By.id("buyButton" + this.rewardId))
			.click();
		Thread.sleep(1000);
	}

	@Then("^The stock of the new prize should be reduced by one$")
	public void the_stock_of_the_new_prize_should_be_reduced_by_one()
		throws Throwable {
		String stockValue = TestRunner.driver
			.findElement(By.id("rewardStock" + this.rewardId)).getText();
		int stock = Integer.parseInt(stockValue);
		Assert.assertEquals(REWARD_STOCK - 1, stock);
	}

	@When("^The user clicks on the delete button for the newly created prize$")
	public void
		the_user_clicks_on_the_delete_button_for_the_newly_created_prize()
			throws Throwable {
		Thread.sleep(1000);
		TestRunner.driver.findElement(By.id("deleteButton" + this.rewardId))
			.click();
		Thread.sleep(1000);
	}

	@Then("^The new prize should no longer exist$")
	public void the_new_prize_should_no_longer_exist() throws Throwable {
		try {
			TestRunner.driver.findElement(
				By.xpath("//b[contains(text(),'" + REWARD_NAME + "')]"));
			// the element should not exist
			Assert.fail();
		}
		catch (NoSuchElementException e) {
			// good
		}
	}

}
