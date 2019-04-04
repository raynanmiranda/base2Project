Feature: Task 


Background: 
	Given I'm already logged in
	
@MCheckUserOnTask
Scenario: Check user on Task 

	And  have a project already 
	And  click on 'Ver Tarefa' on SideBar 
	And  Already have a task
	When Click on the number icon link 
	And  relate the Task with a user
	Then Will have a user on task as responsable 
	 