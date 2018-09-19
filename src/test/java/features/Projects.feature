Feature: Projects 


Background: 
	Given I'm already logged in 
	
@EntryOfManageProject 
Scenario: Verify the possibility to go to 'Gerenciar Projetos' tab 

	When I click on the 'Convidar Usuarios' button 
	And click on the 'Gerenciar projetos' tab 
	Then will be able to manage and create projects 
	
@CreateNewProject 
Scenario: Create a New Project 

	And I click on the 'Convidar Usuarios' button 
	And click on the 'Gerenciar projetos' tab 
	And Click on the 'Criar Novo Projeto' button 
	When I fill up the valid data form 
	And Click on the 'Adicionar projeto' button 
	Then Will create the Project 
	
@CreateNewUserOnManageUsers 
Scenario: Create a New user account 

	And I click on the 'Convidar Usuarios' button 
	And click on the 'Gerenciar usuarios' tab 
	And Click on the 'Criar Nova Conta' button 
	When I fill up the valid user data form 
	And Click on the 'Criar Usuario' button 
	Then Will create the user 

@CreateNewTask	
Scenario: Create New Task by Button

	And  have a project already
	When click on 'Criar Tarefa' button 
	And  Fill up all form with valid data
	And  Click on 'Criar Nova Tarefa' button
	Then Will have a task created

@ValidateEmailsOfUser 
Scenario Outline: Using Different e-mails 

	And I click on the 'Convidar Usuarios' button 
	And click on the 'Gerenciar usuarios' tab 
	And Click on the 'Criar Nova Conta' button 
	When I fill up the userName <userName> on the form 
	And I fill up the realName <realName> on the form 
	And I fill up the email <email> on the form 
	And Click on the 'Criar Usuario' button 
	Then Will validate the user 
	
	Examples: 
	
		| userName | realName | 		email			   |
		|test1     | correct  | raynan@base2.com.br        |
		|test2     | invalid  | raynan.mirandabase2.com.br |
		|test3     | invalid  | raynan.miranda@            |
		|test4     | invalid  | raynan.miranda@base2.com,  |
		|test5     | SameEmail| raynan@base2.com.br        |