Feature: Projects


Background:
Given I'm already logged in

Scenario: Verify the possibility to go to 'Gerenciar Projetos' tab

When I click on the 'Convidar Usuários' button
And click on the 'Gerenciar projetos' tab
Then will be able to manage and create projects


Scenario: Create a New Project

And I click on the 'Convidar Usuários' button
And click on the 'Gerenciar projetos' tab
And Click on the 'Criar Novo Projeto' button
When I fill up the valid data
And Click on the 'Adicionar projeto' button
Then Will create the Project