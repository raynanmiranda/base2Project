Feature: Projects


Background:
Given I'm already logged in

@EntryOfManageProject
Scenario: Verify the possibility to go to 'Gerenciar Projetos' tab

When I click on the 'Convidar Usuários' button
And click on the 'Gerenciar projetos' tab
Then will be able to manage and create projects

@CreateNewProject
Scenario: Create a New Project

And I click on the 'Convidar Usuários' button
And click on the 'Gerenciar projetos' tab
And Click on the 'Criar Novo Projeto' button
When I fill up the valid data form
And Click on the 'Adicionar projeto' button
Then Will create the Project

@CreateNewUserOnManageUsers
Scenario: Create a New user account

And I click on the 'Convidar Usuários' button
And click on the 'Gerenciar usuários' tab
And Click on the 'Criar Nova Conta' button
When I fill up the valid user data form
And Click on the 'Criar Usuário' button
Then Will create the user