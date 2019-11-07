Feature: Prize lifecycle
	Scenario: A prize is created, purchased, and deleted
		Given The user is logged in as a trainer
		When The user clicks on the adjustments button
		Then The user should be on the adjustments page
		When The user selects a known associate
		When The user inputs the prize value as an adjustment
		When The user clicks on the adjust button
		When The user clicks on the store button
		When The user clicks on the create button
		When The user enters a prize name
		When The user enters a prize price
		When The user enters a prize stock
		When The user clicks on the submit edit button
		Given The user is logged in as an associate
		When The user clicks on the store button
		When The user clicks on the buy button for the new prize
		Then The stock of the new prize should be reduced by one
		Given The user is logged in as a trainer
		When The user clicks on the store button
		When The user clicks on the delete button for the newly created prize
		Then The new prize should no longer exist