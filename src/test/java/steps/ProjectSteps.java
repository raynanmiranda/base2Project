package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ManagePage;
import pages.PrincipalPage;

public class ProjectSteps extends ManagePage {

	ManagePage managePage = null;
	PrincipalPage principalPage = null;
	
	public ProjectSteps() {
		managePage = new ManagePage();
		principalPage = new PrincipalPage();
	}
	
	private String checkName = "testNewProject";
		
	// Methods have link with cucumber to execute the scenarios
	/*@Given("^I'm already logged in$")
		public void i_m_already_logged_in() throws Throwable {
		    principalPage.openPage("http://mantis.raynan.base2.com.br/login_page.php");
		    principalPage.dataLogin();
		}*/
		
	@When("^I click on the 'Convidar Usuarios' button$")
	public void i_click_on_the_Convidar_Usuarios_button() {
		principalPage.btnConvidarUsuarios();
	}

	@And("^click on the 'Gerenciar projetos' tab$")
	public void click_on_the_Gerenciar_projetos_tab(){
	 managePage.manageProjectTag();
	}

	@Then("^will be able to manage and create projects$")
	public void will_be_able_to_manage_and_create_projects() throws Throwable {
	
	}
	
	@And("^Click on the 'Criar Novo Projeto' button$")
	public void click_on_the_Criar_Novo_Projeto_button() throws Throwable {
	managePage.btnCriarNovoProjeto();
	}

	@When("^I fill up the valid data form$")
	public void i_fill_up_the_valid_data() throws Throwable {
	  managePage.insertNameProjectField("testNewProject");
	  managePage.fillStatusProject();
	  managePage.fillVisibleProject();
	  managePage.txtDescriptionField("Description project test");
	}

	@When("^Click on the 'Adicionar projeto' button$")
	public void click_on_the_Adicionar_projeto_button() throws Throwable {
	    managePage.addNewProject();
	}

	@Then("^Will create the Project$")
	public void will_create_the_Project() throws Throwable {
		
		Thread.sleep(3000); 
		managePage.validateProjectCreated();
		assertEquals(checkName, managePage.nameProject);
	}
	
	@Given("^click on the 'Gerenciar usuarios' tab$")
	public void click_on_the_Gerenciar_usuarios_tab() throws Throwable {
	    managePage.manageUsersTag();
	}

	
	@And("^Click on the 'Criar Nova Conta' button$")
	public void click_on_the_Criar_Nova_Conta_button() throws Throwable {
		managePage.btnCreateNewAccount();
	}
	
	@When("^I fill up the valid user data form$")
	public void i_fill_up_the_valid_user_data_form() throws Throwable {
		managePage.set_DataFileUser(1,0);
		managePage.set_DataFileRealName(1,1);
		managePage.set_DataFileEmail(1,2);
		
	}
	
	@And("^Click on the 'Criar Usuario' button$")
	public void click_on_the_criar_usuario_button() throws Throwable {
		managePage.btnCreateNewUser();
	}
	
	@Then("^Will create the user$")
	public void will_create_the_user() throws Throwable {
		
	}

	
}
