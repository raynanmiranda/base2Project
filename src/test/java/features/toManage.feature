Feature: To Manage

Background: 
	Given I'm already logged in 
	
@AcessManageMarkers 
Scenario: Access the 'Gerenciar Marcadores' tab 

	When I click on the 'Gerenciar' sidebar
	And  Click on the 'Gerenciar Marcadores' tab
	Then will be able to manage and create bookMarks 
	
@CreateNewMarker 
Scenario: Access the 'Gerenciar Marcadores' tab 

	And  I click on the 'Gerenciar' sidebar
	And  Click on the 'Gerenciar Marcadores' tab
	When I Fill up the name "testMarker"
	And  Fill up the description "testMakerDescription"
	And  I click on 'Criar Marcador'
	Then will be created the new Marker 
	
@UpdateMarker 
Scenario: Access the 'Gerenciar Marcadores' tab 

	And  I click on the 'Gerenciar' sidebar
	And  Click on the 'Gerenciar Marcadores' tab
	And  I Fill up the name "testMarker"
	And  Fill up the description "testMakerDescription"
	And  I click on 'Criar Marcador'
	When I click on marker created
	And  I click on update Marker
	And  Change the marker information
	And  I click on update marker button
	Then Will be updated the Marker
	