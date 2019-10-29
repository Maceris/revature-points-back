Feature: Logging in

	Scenario Outline: Log in with correct credentials
		Given The user is on the login page
		When The user types "<username>" into the username field
		When The user types "<password>" into the password field
		When The user presses the login button
		Then The user should be on the dashboard page
		
		Examples:
		|username|password|
		|test|test|
		|guest|guest|
		|user1|password|
	