Feature: Navigating between pages

	Scenario: Associate pages
		Given The user is logged in as an associate
		When The user clicks on the store button
		Then The user should be on the store page
		When The user clicks on the dashboard button
		Then The user should be on the dashboard page
	
	Scenario: Trainer pages
		Given The user is logged in as a trainer
		When The user clicks on the adjustments button
		Then The user should be on the adjustments page
		When The user clicks on the store button
		Then The user should be on the store page
		When The user clicks on the dashboard button
		Then The user should be on the dashboard page