Feature: principalMantisPage

Background:
Given I'm already logged

Scenario: Access myAccount
	
	When Access the menuAccount
	And click on MyAccount
	Then will access my account Page
	
Scenario: Access the ver Tarefas Tab

	When Click on Ver Tarefas
	Then Will access the Ver Tarefas page
	
Scenario: Access the Criar Tarefa Tab

	When Click on Criar Tarefa
	Then Will access the Criar Tarefa page
	
Scenario: Access the Criar Tarefa Button

	When Click on button Criar Tarefa
	Then Will access the Criar Tarefa page
	
Scenario: Access the Registro de Mudancas

	When Click on Registro de mudancas
	Then Will access the Registro de mudancas page
	
Scenario: Access the Planejamento

	When Click on Planejamento
	Then Will access the Planejamento page
	
	