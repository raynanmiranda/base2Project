package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.PageBase;

public class ManagePage extends PageBase {

	public String nameProject;

	@FindBy(how = How.CSS, using = "button[class*='btn-white']")
	public WebElement btnCriarNovoProjeto;

	@FindBy(how = How.ID, using = "project-name")
	public WebElement nameProjectField;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/manage_proj_page.php']")
	public WebElement manageProjectTag; // Gerenciar Projetos

	@FindBy(how = How.XPATH, using = "//*[@value='Adicionar projeto']")
	public WebElement btnAddNewProject; // Criar Projeto

	@FindBy(how = How.ID, using = "project-status")
	public WebElement statusProject; // estado(Project)

	@FindBy(how = How.ID, using = "project-view-state")
	public WebElement visibleProject; // visibility(Project)

	@FindBy(how = How.ID, using = "project-description")
	public WebElement txtDescriptionField; // Description(Project)

	@FindBy(how = How.LINK_TEXT, using = "testNewProject") // "//*[@id='main-container']//*[2][@class='table-responsive']//a[text()='testNewProject']")
	public WebElement validateProjectCreated; // Description(Project)

	@FindBy(how = How.ID, using = "user-username")
	public WebElement user_Name; // UserName of create new Account(Manager Users)

	@FindBy(how = How.ID, using = "user-realname")
	public WebElement real_Name; // UserName of create new Account(Manager Users)

	@FindBy(how = How.ID, using = "email-field")
	public WebElement email; // UserName of create new Account(Manager Users)

	@FindBy(how = How.ID, using = "user-access-level")
	public WebElement accesslevel; // UserName of create new Account(Manager Users)

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/manage_user_page.php']")
	public WebElement manageUsersTag; // Gerenciar Usuários

	@FindBy(how = How.XPATH, using = "//*[@id='sidebar']//*[@href='/manage_overview_page.php']")
	public WebElement manageTag; // Gerenciar Tag

	@FindBy(how = How.XPATH, using = "//*[@id='manage-user-div']//*[text()='Criar nova conta']")
	public WebElement btnCreateNewAccount; // Criar nova conta

	@FindBy(how = How.XPATH, using = "//*[@id='manage-user-create-form']//*[@type='submit']")
	public WebElement btnCreateNewUser; // Criar Usuario

	@FindBy(how = How.XPATH, using = "//*[@id=\"main-container\"]//*[@class='alert alert-danger']/p[2]")
	public WebElement validateMgsEmailError;

	@FindBy(how = How.LINK_TEXT, using = "testUser") // "//*[@id='main-container']//*[2][@class='table-responsive']//a[text()='testNewProject']")
	public WebElement validateUserCreated;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@class='alert alert-success center']//*[@href='manage_user_page.php']")
	public WebElement btnSucessGeneral;

	@FindBy(how = How.XPATH, using = "//*[@id='navbar-container']//*[@href='bug_report_page.php']")
	public WebElement btnNewTask;

	@FindBy(how = How.ID, using = "reproducibility")
	public WebElement frequenceStatus; // estado(Frequence)

	@FindBy(how = How.ID, using = "severity")
	public WebElement severityStatus; // estado(Severity)

	@FindBy(how = How.ID, using = "priority")
	public WebElement priorityStatus; // estado(Severity)

	@FindBy(how = How.ID, using = "summary")
	public WebElement txtSummary; // estado(Summary)

	@FindBy(how = How.ID, using = "description")
	public WebElement txtDescription; // estado(Description)

	@FindBy(how = How.XPATH, using = "//*[@id='report_bug_form']//*[@type='submit']")
	public WebElement btnCreateNewTask; // Button Criar Nova Tarefa

	@FindBy(how = How.XPATH, using = "//*[@id='buglist']/tbody//*[@class='column-summary']")
	public WebElement validateTask; // validate task exist
	
	public void btnSucessGeneral() {
		btnSucessGeneral.click();
	}

	public void btnCriarNovoProjeto() {
		btnCriarNovoProjeto.click();
	}

	public void insertNameProjectField(String nameProject) {
		nameProjectField.clear();
		nameProjectField.sendKeys(nameProject);
	}

	public void manageProjectTag() {
		manageProjectTag.click();
	}

	public void addNewProject() {
		btnAddNewProject.click();

	}

	public void fillStatusProject() {
		Random number = new Random();

		WebElement ListBoxStatus = statusProject;
		Select select = new Select(ListBoxStatus);
		select.selectByIndex(number.nextInt(4));

	}

	public void fillVisibleProject() {
		Random number = new Random();

		WebElement ListBoxVisibility = visibleProject;
		Select select = new Select(ListBoxVisibility);
		select.selectByIndex(number.nextInt(2));

	}

	public void txtDescriptionField(String fillTxt) {
		txtDescriptionField.sendKeys(fillTxt);

	}

	public void validateProjectCreated() {

		// WebDriverWait wait = new WebDriverWait(driver, 10);
		nameProject = validateProjectCreated.getText();

	}

	public void manageUsersTag() {
		manageUsersTag.click();
	}

	public void btnCreateNewAccount() throws InterruptedException {

		btnCreateNewAccount.click();
	}

	public void fillUserName(String userName) {

		user_Name.clear();
		user_Name.sendKeys(userName);

	}

	public void fillRealName(String realName) {

		real_Name.clear();
		real_Name.sendKeys(realName);

	}

	public void fillEmail(String emailForm) {

		email.clear();
		email.sendKeys(emailForm);

	}

	public void btnCreateNewUser() {
		btnCreateNewUser.click();
	}

	public void validateUserCreated() {
		validateUserCreated.getText();
	}

	public void clickManageTag() {
		manageTag.click();
	}

	public void clickBtnNewTask() {
		btnNewTask.click();
	}

	public void fillFrenquenceStatusTask() {
		Random number = new Random();

		WebElement ListBoxStatusFrequence = frequenceStatus;
		Select select = new Select(ListBoxStatusFrequence);
		select.selectByIndex(number.nextInt(5));
	}

	public void fillSeverityStatusTask() {
		Random number = new Random();

		WebElement ListBoxStatusSeverity = severityStatus;
		Select select = new Select(ListBoxStatusSeverity);
		select.selectByIndex(number.nextInt(7));
	}

	public void fillPriorityStatusTask() {
		Random number = new Random();

		WebElement ListBoxStatusPriority = priorityStatus;
		Select select = new Select(ListBoxStatusPriority);
		select.selectByIndex(number.nextInt(7));
	}

	public void fillTxtSummaryTask(String summary) {
		txtSummary.clear();
		txtSummary.sendKeys(summary);
	}

	public void fillTxtDescriptionTask(String description) {
		txtDescription.clear();
		txtDescription.sendKeys(description);
	}

	public void clickBtnCreateNewTask() {
		btnCreateNewTask.click();
	}
	
	public String validadeExistTask(String task) {
		

		WebElement ListBoxtask = validateTask;
		Select select = new Select(ListBoxtask);
		
		
		if(select.equals("teste new task")) {
			
			task = "teste new task";
		}
		return task;
		}
	
}
