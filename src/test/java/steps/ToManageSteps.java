package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ManagePage;

public class ToManageSteps extends ManagePage{

	String markerName = null;
	String descriptionName = null;
	String markerNameUpdated = null;
	String descriptionNameUpdated = null;
	
	// -------------------- Access Markers Tab ------------------------
	
	@When("^I click on the 'Gerenciar' sidebar$")
	public void i_click_on_the_Gerenciar_sidebar() throws Throwable {
		clickManageTag();
	}

	@And("^Click on the 'Gerenciar Marcadores' tab$")
	public void click_on_the_Gerenciar_Marcadores_tab() throws Throwable {
	    clickManageBookMarksTab();
	}

	@Then("^will be able to manage and create bookMarks$")
	public void will_be_able_to_manage_and_create_bookMarks() throws Throwable {
		validateManageMarkersTab();
	}
	
	
	// ------------------------- Creating New Marker ----------------------
	
	@When("^I Fill up the name \"([^\"]*)\"$")
	public void i_Fill_up_the_name(String name) throws Throwable {
		validateManageMarkersTab();
		fillUpmarkerNameField(name);
	    markerName = name;
	}

	@And("^Fill up the description \"([^\"]*)\"$")
	public void fill_up_the_description(String description) throws Throwable {
	    fillUpmarkerDescriptionField(description);
	    descriptionName = description;
	    
	}

	@And("^I click on 'Criar Marcador'$")
	public void i_click_on_Criar_Marcador() throws Throwable {
	    clickBtnCreateMarker();
	}

	@Then("^will be created the new Marker$")
	public void will_be_created_the_new_Marker() throws Throwable {
	   Thread.sleep(3000);
		validateMarkerCreated(markerName);
	}
	
	// ------------------- Update Marker -------------------------------------
	
	@When("^I click on marker created$")
	public void i_click_on_marker_created() throws Throwable {
		clickOnMarker(markerName);
		validateMarkerAccessedSucessfuly(markerName);
	}

	@When("^I click on update Marker$")
	public void i_click_on_update_Marker() throws Throwable {
		clickBtnUpdateMarker();
	}

	@When("^Change the marker information$")
	public void change_the_marker_information() throws Throwable {
	    markerNameUpdated = markerName+"2";
	    descriptionNameUpdated = descriptionName+"2";
		updateMarkerName(markerNameUpdated);
	    updateMarkerDescription(descriptionNameUpdated);
	}

	@When("^I click on update marker button$")
	public void i_click_on_update_marker_button() throws Throwable {
		clickBtnUpdateMarker();
	}

	@Then("^Will be updated the Marker$")
	public void will_be_updated_the_Marker() throws Throwable {
		clickManageTag();
		clickManageBookMarksTab();
		validateMarkerCreated(markerNameUpdated);
	}
	
}
