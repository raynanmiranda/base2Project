Feature: principalMantisPage

Background:
Given I'm already logged

@test
Scenario: Access myAccount
	
	When Access the menuAccount
	And click on MyAccount
	Then will access my account Page
	
Scenario: Access the ver Tarefas Tab

	When Click on Ver Tarefas
	Then Will access the Ver Tarefas page
	
Scenario: Access the Resumo Tab

	When Click on Resumo
	Then Will access the Resumo page
	
Scenario: Access the Gerenciar tab

	When Click on Gerenciar tab
	Then Will access the Gerenciar page
	
Scenario: Access the Registro de Mudancas

	When Click on Registro de mudancas
	Then Will access the Registro de mudancas page
	
Scenario: Access the Planejamento

	When Click on Planejamento
	Then Will access the Planejamento page
	
	