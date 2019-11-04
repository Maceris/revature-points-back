Feature: Adjusting associate points

	Scenario Outline: Adjust user points
		Given The user is logged in as a trainer
		When The user clicks on the adjustments button
		Then The user should be on the adjustments page
		When The user selects a known associate
		When The user inputs "<value>" as an adjustment
		When The user clicks on the adjust button
		Then The associates points should be adjusted by "<value>"
		
		Examples:
		|value|
		|100|
		|-100|