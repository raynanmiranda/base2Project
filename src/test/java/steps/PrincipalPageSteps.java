package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import pages.PrincipalPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrincipalPageSteps extends PrincipalPage {

	PrincipalPage principalPage = null;
	
	
	public PrincipalPageSteps() {
		principalPage = new PrincipalPage();
	}
	
	// ******** Access Principal Page of Mantis - Account **************
	
	@Given("^I'm already logged$")
	public void i_m_already_logged() {
	   principalPage.openPage("http://mantis.base2.com.br/login_page.php");
	   principalPage.dataLogin();
	}

	@When("^Access the menuAccount$")
	public void access_the_menuAccount() throws Throwable {
	   principalPage.myAccountMenu();
	}

	@And("^click on MyAccount$")
	public void click_on_MyAccount() throws Throwable {
	   principalPage.myAccount();
	}

	@Then("^will access my account Page$")
	public void will_access_my_account_Page() throws Throwable {
	    assertEquals("Minha Conta", validateMyAccount.getText());
	}

	// *********************//***************************
	
	// ************* ACCESS MENUs OF MANTIS *************
	
	@When("^Click on Ver Tarefas$")
	public void click_on_Ver_Tarefas() throws Throwable {
	    principalPage.menuSeeTask();
	}

	@Then("^Will access the Ver Tarefas page$")
	public void will_access_the_Ver_Tarefas_page() throws Throwable {
	   assertTrue(principalPage.validateSeeTask.isEnabled());
	}

	@When("^Click on Criar Tarefa$")
	public void click_on_Criar_Tarefa() throws Throwable {
	    principalPage.menuCreateTask();
	}

	@Then("^Will access the Criar Tarefa page$")
	public void will_access_the_Criar_Tarefa_page() throws Throwable {
		assertTrue(principalPage.validateCreateTask.isDisplayed());

	}

	@When("^Click on button Criar Tarefa$")
	public void click_on_button_Criar_Tarefa() throws Throwable {
	    principalPage.btnCreateTask();
	}
	
	@When("^Click on Registro de mudancas$")
	public void click_on_Registro_de_mudancas() throws Throwable {
	    principalPage.menuRegisterChange();
	}

	@Then("^Will access the Registro de mudancas page$")
	public void will_access_the_Registro_de_mudancas_page() throws Throwable {
	    assertTrue(principalPage.validateRegisterChange.isEnabled());
	}

	@When("^Click on Planejamento$")
	public void click_on_Planejamento() throws Throwable {
	   principalPage.menuPlanning();
	}

	@Then("^Will access the Planejamento page$")
	public void will_access_the_Planejamento_page() throws Throwable {
	   assertTrue(principalPage.validatePlanning.isEnabled());
	}
	
	// **************************************************
}
