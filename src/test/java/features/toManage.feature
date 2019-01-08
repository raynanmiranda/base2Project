Feature: To Manage 

Background: 
	Given I'm already logged in 
	
@AcessManageMarkers 
Scenario: Access the 'Gerenciar Marcadores' tab 

	When I click on the 'Gerenciar' sidebar 
	And  Click on the 'Gerenciar Marcadores' tab 
	Then will be able to manage and create bookMarks 
	
@CreateNewMarker 
Scenario: Create a New Marker 

	And  I click on the 'Gerenciar' sidebar 
	And  Click on the 'Gerenciar Marcadores' tab 
	When I Fill up the name "testMarker" 
	And  Fill up the description "testMakerDescription" 
	And  I click on 'Criar Marcador' 
	Then will be created the new Marker 
	
@UpdateMarker 
Scenario: Update the existing Marker 

	And  I click on the 'Gerenciar' sidebar 
	And  Click on the 'Gerenciar Marcadores' tab 
	And  I Fill up the name "testMarker2" 
	When I click on marker created "testMarker2"
	And  I click on update Marker 
	And  Change the marker information 
	And  I click on update marker button 
	Then Will be updated the Marker 
	
@DeleteMarker 
Scenario: Delete the existing Marker 

	And  I click on the 'Gerenciar' sidebar 
	And  Click on the 'Gerenciar Marcadores' tab  
	When I click on marker created "testMarker3"
	And  I click on delete marker 
	And  I click on confirm delete Marker 
	Then Will be deleted the Marker