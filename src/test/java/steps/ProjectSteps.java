package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
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
	protected String textTask = "test new task";
	public String checkUser;

	private String fieldUserName = "testUser";
	private String fieldRealName = "testRealUser";
	private String fieldEmail = "teste@teste.com";

	

	@When("^I click on the 'Convidar Usuarios' button$")
	public void i_click_on_the_Convidar_Usuarios_button() {
		principalPage.btnConvidarUsuarios();
	}

	@And("^click on the 'Gerenciar projetos' tab$")
	public void click_on_the_Gerenciar_projetos_tab() {
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
	public void i_fill_up_the_valid_user_data() throws Throwable {
		managePage.fillUserName(fieldUserName);
		managePage.fillRealName(fieldRealName);
		managePage.fillEmail(fieldEmail);
	}

	@When("^I fill up the userName (.*) on the form$")
	public void i_fill_up_the_userName_on_the_form(String userName) {
		managePage.fillUserName(userName);
		checkUser = userName;
	}

	@And("^I fill up the realName (.*) on the form$")
	public void i_fill_up_the_realName_on_the_form(String realName) {
		managePage.fillRealName(realName);

	}

	@And("^I fill up the email (.*) on the form$")
	public void i_fill_up_the_email_on_the_form(String email) {
		managePage.fillEmail(email);

	}

	@And("^Click on the 'Criar Usuario' button$")
	public void click_on_the_criar_usuario_button() throws Throwable {
		managePage.btnCreateNewUser();
		Thread.sleep(5000);
	}

	@Then("^Will create the user$")
	public void will_create_the_user() throws Throwable {
		Thread.sleep(5000);
		managePage.manageUsersTag();
		assertEquals("testUser", validateUserCreated.getText());
	}

	@Then("^Will validate the user$")
	public void will_validate_the_user() {

		if (checkUser.equals("test1")) {

			managePage.manageUsersTag();
			assertEquals("test1", managePage.validateUserCreated.getText());
			System.out.println("Validated E-mail valid. True");

		} else if (checkUser.equals("test5")) {
			assertEquals("Este e-mail já está sendo usado. Por favor, volte e selecione outro.",
					managePage.validateMgsEmailError.getText());
			System.out.println("Validated E-mail already exist. True");
		}

		else if (checkUser.equals("test2") || checkUser.equals("test3") || checkUser.equals("test4")) {

			assertEquals("E-mail inválido.", managePage.validateMgsEmailError.getText());
			System.out.println("Validated E-mail Invalid. True");

		}
	}

	// ------------------Steps for create New Task -----------------------

	@And("^have a project already$")
	public void have_a_project_already() throws Throwable {
		managePage.clickManageTag();
		managePage.manageProjectTag();
		assertEquals(checkName, managePage.validateProjectCreated.getText());
	}

	@When("^click on 'Criar Tarefa' on SideBar$")
	public void click_on_Criar_Tarefa_SideBar() {
		managePage.clickBtnNewTaskSideBar();
	}
	
	@When("^click on 'Criar Tarefa' button$")
	public void click_on_Criar_Tarefa_button() {
		managePage.clickBtnNewTask();
	}

	@When("^Fill up all form with valid data$")
	public void fill_up_all_form_with_valid_data() {
		managePage.fillFrenquenceStatusTask();
		managePage.fillSeverityStatusTask();
		managePage.fillPriorityStatusTask();
		managePage.fillTxtSummaryTask("Test new task");
		managePage.fillTxtDescriptionTask("writing description of new task");
	}

	@When("^Click on 'Criar Nova Tarefa' button$")
	public void click_on_Criar_Nova_Tarefa_button() throws InterruptedException {
		managePage.clickBtnCreateNewTask();
		Thread.sleep(5000);
	}

	@Then("^Will have a task created$")
	public void will_have_a_task_created() {
		
		String taskResult = null;
		managePage.validadeExistTask(taskResult);
		assertEquals(textTask,taskResult);
		
	}
	
	
	//----------------EditTask----------------------
	
	@And("^click on 'Ver Tarefa' on SideBar$")
	public void click_on_Ver_Tarefa_on_SideBar() throws Throwable {
	    
	}

	@And("^Already have a task$")
	public void already_have_a_task() throws Throwable {
	   
	}

	@When("^Click on the pencil icon$")
	public void click_on_the_pencil_icon() throws Throwable {
	   
	}

	@When("^update the Task$")
	public void update_the_Task() throws Throwable {
	    
	}

	@When("^Save the new information$")
	public void save_the_new_information() throws Throwable {
	   
	}

	@Then("^Will have a task updated$")
	public void will_have_a_task_updated() throws Throwable {
	  
	}

	
	//--------------Add Category of Project ---------------
	
	@When("^I insert the category \"([^\"]*)\" on field$")
	public void i_insert_the_category_on_field(String newCategoryName) {
		managePage.fillNewCategory(newCategoryName);
	}
	
	@And("^Click on 'Adicionar Categoria'$")
	public void click_on_adicionar_categoria() {
		managePage.clickBtnAddCategory();
	}
	
	@Then("^I will be able to see the new category added$")
	public void i_will_be_able_to_see_the_new_category_added() {
		assertEquals("newcategory", managePage.validateNewCategory.getText());
		
	}
	
	
	//--------------Edit Category of Project ---------------
	
	@And("^have a category already$")
	public void have_a_category_already() {
		assertEquals("newcategory", managePage.validateNewCategory.getText());
	}
	
	
	@When("^Click on edit the category 'newcategory'$")
	public void click_on_edit_the_category_newcategor() {
		managePage.clickBtnEditCategory();
	}
	
	@And("^update the category$")
	public void update_the_category() {
		managePage.fillUpdateCategoryName("newcategoryUpdated");
		managePage.clickBtnUpdateCategory();
	}
	
	@Then("^I will be able to save the update$")
	public void I_will_be_able_to_save_the_update() throws InterruptedException {
		
		Thread.sleep(5000);
		assertEquals("newcategoryUpdated", managePage.validateCategoryUpdated.getText());
		
		
		
	}
	
	
}
