Feature: CreateAccount

Background:
Given I already have access Login Page "http://localhost/mantis/login_page.php"

Scenario: Access the account link

	When I click on the 'criar uma nova conta'
	Then will be directed to signup Page
