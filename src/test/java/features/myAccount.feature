Feature: My Account 

Background:
	
	Given I'm already logged in
	When Access the menuAccount
	And click on MyAccount
	#Then will access my account Page

Scenario: fill in the form on the myAccount with new Password
	
	When fill in the old password "29092017"
	And fill in the new password "20170929"
	And confirm the new password "20170929"
	And click on 'Atualizar Usuario'
	Then will salve my new password

	
Scenario: Change the name and E-mail on MyAccount form	
	
	When fill in the old password "20170929"
	And fill in the new password "29092017"
	And confirm the new password "29092017"
	And fill in a new e-mail "raynan.miranda@base2.com"
	And fill in a new name "Raynann Miranda"
	And click on 'Atualizar Usuario'
	Then will save with sucess
	
Scenario: Change the name and E-mail Again on MyAccount form	
	
	When fill in the old password "29092017"
	And fill in the new password "29092017"
	And confirm the new password "29092017"
	And fill in a new e-mail "raynan.miranda@base2.com.br"
	And fill in a new name "Raynan Miranda"
	And click on 'Atualizar Usuario'
	Then will save with sucess

Scenario: Access the Preferences Tag

	When Click on the 'Preferências' tag
	Then Will access the preferences itens

Scenario: Access the Manage coluns Tag

	When Click on the 'Gerenciar colunas' tag
	Then Will access the manageColuns itens

Scenario: Access the Perfils Tag

	When Click on the 'Perfils' tag
	Then Will access the perfils itens
	
Scenario: Access the TokenAPI Tag

	When Click on the 'TokenAPI' tag
	Then Will access the TokenAPI itens
