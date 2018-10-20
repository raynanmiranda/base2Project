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
	
@CreateNewTask-SideBarWay	
Scenario: Create New Task by SideBar

	And  have a project already
	When click on 'Criar Tarefa' on SideBar 
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
		

@AddCategoryOfProject
Scenario: Add new category on Project

And  have a project already
When I insert the category "newcategory" on field
And  Click on 'Adicionar Categoria'
Then I will be able to see the new category added		

@EditCategoryOfProject
Scenario: Edit a category on Project

And  have a project already
And  have a category already
When Click on edit the category 'newcategory' 
And  update the category
Then I will be able to save the update	

@DeleteCategoryOfProject
Scenario: Delete a category on Project

And  have a project already
And  have a category updated already
When Click on 'Apagar' category 
And  Confirm delete category of project
Then Category will be deleted


@DeleteAllTask	
Scenario: Delete all Tasks

	And  have a project already
	And  click on 'Ver Tarefa' on sidebar 
	When click on select All tasks
	And  select 'Apagar' on dropDown
	Then Will delete all tasks