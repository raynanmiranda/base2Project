package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ManagePage;
import pages.PrincipalPage;
import pages.TaskPage;

public class TaskSteps {

	
	ManagePage managePage = null;
	PrincipalPage principalPage = null;
	TaskPage taskPage = null;
	
	private String userMonitor = "test1";

	public TaskSteps() {
		managePage = new ManagePage();
		principalPage = new PrincipalPage();
		taskPage = new TaskPage();
	}
	
	@When("^Click on the number icon link$")
	public void click_on_the_number_icon_link() {
		
		taskPage.clickBtnTaskLink();
	}
	
	@And("^relate the Task with a user$")
	public void relate_the_Task_with_a_user() {
		
		taskPage.insertNameUserTaskField(userMonitor);
		taskPage.clickBtnAddUserTask();
	}
	
	@Then("^Will have a user on task as responsable$")
	public void will_have_a_user_on_task_as_responsable() {
		
		assertTrue("Usuario não encontrado na associação da Task", taskPage.validateUserAddedOnTask(userMonitor));
	}
	
}
