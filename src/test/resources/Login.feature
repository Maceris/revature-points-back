Feature: Logging in

	Scenario Outline: Log in with correct credentials
		Given The user is on the login page
		When The user types "<username>" into the username field
		When The user types "<password>" into the password field
		When The user presses the login button
		Then The user should be on the dashboard page
		When The user presses the logout button
		Then The user should be on the login page
		
		Examples:
		|username|password|
		|cburks|password|
		|jpruski|password|
		|jcoffin|password|
	
	Scenario Outline: Log in as a trainer
		Given The user is on the login page
		When The user types "<username>" into the username field
		When The user types "<password>" into the password field
		When The user clicks on the trainer button
		When The user presses the login button
		Then The user should be on the dashboard page
		When The user presses the logout button
		Then The user should be on the login page

		Examples:
		|username|password|
		|aranieri|password|