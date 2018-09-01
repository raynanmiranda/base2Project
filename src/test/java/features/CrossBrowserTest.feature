Feature: Login with CrossBrowser

Background:
Given I want to Login on the "http://mantis.raynan.base2.com.br/login_page.php" 


@ValidLogin
Scenario: Sucess Login 
	
	When I Insert the user "administrator"
	And Click on LoginButton
	And Insert the password "29092017"
	Then I will login with sucess