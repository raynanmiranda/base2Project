Feature: forgetPassword

Background:
Given I already have access to the Login Page "http://mantis.raynan.base2.com.br/login_page.php"
Given I forgot my password

Scenario: Access the Link 'Perdeu a senha?'

	
	When I insert a valid user "administrator"
	And Click on the loginButton
	And Click on the link 'Perdeu a sua senha?'
	Then will be directed to reset the password


Scenario: Change the password

	When I insert a valid user "administrator"
	And Click on the loginButton
	And Click on the link 'Perdeu a sua senha?'
	When I insert the valid e-mail "raynan.miranda@base2.com.br"
	And click on the Send button
	Then will return to loginPage 	

Scenario: Invalid username_Change the password 

	When I insert a invalid user "raynmiranda"
	And Click on the loginButton
	And Click on the link 'Perdeu a sua senha?'
	When I insert the valid e-mail "raynan.miranda@base2.com.br"
	And click on the Send button
	Then will show a message erro 
