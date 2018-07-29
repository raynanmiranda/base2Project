Feature: Login 

Background:
Given I want to Login on the "http://mantis.raynan.base2.com.br/login_page.php" 

@ValidLogin
Scenario: Sucess Login 
	
	When I Insert the user "administrator"
	And Click on LoginButton
	And Insert the password "29092017"
	Then I will login with sucess

@InvalidLogin	
Scenario: failed Login - invalid user 
	#Given I want to Login on the "http://mantis.base2.com.br/login_page.php"
	When I Insert the invalid user "raynanmiranda"
	And Click on LoginButton
	And Insert the password "29092017"
	And Click on LoginButton
	Then I will not login with sucess

@InvalidLogin	
Scenario: failed Login - invalid password 
	#Given I want to Login on the "http://mantis.base2.com.br/login_page.php"
	When I Insert the user "administrator"
	And Click on LoginButton
	And Insert the invalid password "092017"
	And Click on LoginButton
	Then I will not login with sucess