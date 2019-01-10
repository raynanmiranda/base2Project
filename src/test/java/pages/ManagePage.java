package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
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

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/mantis/manage_proj_page.php']")
	public WebElement manageProjectTag; // Gerenciar Projetos

	@FindBy(how = How.XPATH, using = "//*[@value='Adicionar projeto']")
	public WebElement btnAddNewProject; // Criar Projeto

	@FindBy(how = How.ID, using = "project-status")
	public WebElement statusProject; // estado(Project)

	@FindBy(how = How.ID, using = "project-view-state")
	public WebElement visibleProject; // visibility(Project)

	@FindBy(how = How.ID, using = "project-description")
	public WebElement txtDescriptionField; // Description(Project)

	@FindBy(how = How.LINK_TEXT, using = "testNewProject1") // "//*[@id='main-container']//*[2][@class='table-responsive']//a[text()='testNewProject']")
	public WebElement validateProjectCreated; // Description(Project)

	@FindBy(how = How.ID, using = "user-username")
	public WebElement user_Name; // UserName of create new Account(Manager Users)

	@FindBy(how = How.ID, using = "user-realname")
	public WebElement real_Name; // UserName of create new Account(Manager Users)

	@FindBy(how = How.ID, using = "email-field")
	public WebElement email; // UserName of create new Account(Manager Users)

	@FindBy(how = How.ID, using = "user-access-level")
	public WebElement accesslevel; // UserName of create new Account(Manager Users)

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/mantis/manage_user_page.php']")
	public WebElement manageUsersTag; // Gerenciar Usuários

	@FindBy(how = How.XPATH, using = "//*[@id='sidebar']//*[@href='/mantis/manage_overview_page.php']")
	public WebElement manageTag; // Gerenciar Tag

	@FindBy(how = How.XPATH, using = "//*[@id='manage-user-div']//*[text()='Criar nova conta']")
	public WebElement btnCreateNewAccount; // Criar nova conta

	@FindBy(how = How.XPATH, using = "//*[@id='manage-user-create-form']//*[@type='submit']")
	public WebElement btnCreateNewUser; // Criar Usuario

	@FindBy(how = How.XPATH, using = "//*[@id=\"main-container\"]//*[@class='alert alert-danger']/p[2]")
	public WebElement validateMgsEmailError;

	@FindBy(how = How.LINK_TEXT, using = "testUser") // "//*[@id='main-container']//*[2][@class='table-responsive']//a[text()='testNewProject']")
	public WebElement validateTestUserCreated;

	@FindBy(how = How.LINK_TEXT, using = "test1")
	public WebElement validateTest1Created;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@class='alert alert-success center']//*[@href='/mantis/manage_user_page.php']")
	public WebElement btnSucessGeneral;

	@FindBy(how = How.XPATH, using = "//*[@id='navbar-container']//*[@href='bug_report_page.php']")
	public WebElement btnNewTask;

	@FindBy(how = How.XPATH, using = "//*[@id='sidebar']//*[@href='/mantis/bug_report_page.php']")
	public WebElement btnNewTaskSideBar;

	@FindBy(how = How.XPATH, using = "//*[@id='sidebar']//*[@href='/mantis/view_all_bug_page.php']")
	public WebElement btnViewTaskSideBar;

	@FindBy(how = How.ID, using = "select-project-id")
	public WebElement elementListProject; // projects Selection

	@FindBy(how = How.ID, using = "category_id")
	public WebElement categoryType;

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

	@FindBy(how = How.XPATH, using = "//*[@id='buglist']/tbody")
	public WebElement validateTask; // validate task exist

	@FindBy(how = How.XPATH, using = "//*[@id='sidebar']//*[@href='/mantis/bug_report_page.php']")
	public WebElement updateTaskIcon;

	@FindBy(how = How.XPATH, using = "//*[@id='bug_action']//*[@class='lbl padding-6']")
	public WebElement checkSelectAllTasks;

	@FindBy(how = How.XPATH, using = "//*[@id='bug_action']//*[@name='action']")
	public WebElement selectionDropDownActionTask;

	@FindBy(how = How.XPATH, using = "//*[@id='bug_action']//*[@type='submit']")
	public WebElement btnDeleteAllTasks;

	@FindBy(how = How.XPATH, using = "//*[@id='action-group-div']//*[@type='submit']")
	public WebElement btnConfirmDeleteTasks;

	@FindBy(how = How.XPATH, using = "//*[@value='OK']")
	public WebElement btnOkActionTask;

	@FindBy(how = How.XPATH, using = "//*[@id='categories']//*[@class='input-sm']")
	public WebElement categoryField;

	@FindBy(how = How.ID, using = "proj-category-name")
	public WebElement updateCategoryField;

	@FindBy(how = How.ID, using = "dropdown_projects_menu")
	public WebElement menuSelectProjects;

	@FindBy(how = How.XPATH, using = "//*[@id='projects-list']//*[@class='list dropdown-yellow no-margin']/li")
	public List<WebElement> selectProject;

	@FindBy(how = How.XPATH, using = "//*[@id='categories']//*[@value='Adicionar Categoria']")
	public WebElement btnAddCategory;

	@FindBy(how = How.XPATH, using = "//*[@id='categories']//tr[2]//*[text()='Alterar']")
	public WebElement btnEditCategory;

	@FindBy(how = How.XPATH, using = "//*[@id='categories']//tr[2]//*[text()='Apagar']")
	public WebElement btnDeleteCategory;

	@FindBy(how = How.XPATH, using = "//*[@value='Apagar Categoria']")
	public WebElement btnConfirmDeleteCategory;

	@FindBy(how = How.XPATH, using = "//*[@value='Atualizar Categoria']")
	public WebElement btnSalveUpdateCategory;

	@FindBy(how = How.XPATH, using = "//*[@id='categories']")
	public WebElement validateNewCategory;

	@FindBy(how = How.XPATH, using = "//*[@id='categories']//*[text()='newcategory3Updated']")
	public WebElement validateCategoryUpdated;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/mantis/manage_tags_page.php']")
	public WebElement manageMarkersTab;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@class='active']//*[text()='Gerenciar Marcadores']")
	public WebElement validateManageMarkersTabActive;

	@FindBy(how = How.ID, using = "tag-name")
	public WebElement markerNameField;

	@FindBy(how = How.ID, using = "tag-description")
	public WebElement markerDescriptionField;

	@FindBy(how = How.NAME, using = "config_set")
	public WebElement btnCreateMarker;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@class='table-responsive']")
	public WebElement validateMarkerCreated;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@class='btn btn-primary btn-white btn-round' and @value='Atualizar Marcador']")
	public WebElement btnUpdateMarker;
	
	@FindBy(how = How.XPATH, using = "//*[@id='update_bug_form']//*[@type='submit']")
	private WebElement btnUpdateEditTask;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@class='widget-title lighter']")
	public WebElement validateAccessMarker;

	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@class='btn btn-primary btn-white btn-round' and @value='Apagar Marcador']")
	public WebElement btnDeleteMarker;
	
	@FindBy(how = How.ID, using = "steps_to_reproduce")
	private WebElement textAreaStepToReproduce;
	
	@FindBy(how = How.XPATH, using = "//td[contains(@class,'severity') and text()='grande']")
	public WebElement validateSeverityOnTaskEdited;

	private WebElement btnPencilEditTask(String taskName) {
		return driver.findElement(By.xpath("//td[contains(@class,'summary') and text()='" + taskName
				+ "']/parent::tr/td[contains(@class,'edit')]/a"));
	}
	
	private WebElement elementValidateSeverityOnTaskEdited(String severityName) {
		
		return driver.findElement(By.xpath("//td[contains(@class,'severity') and text()='"+severityName+"']"));
	}
	
	public WebElement elementValidateStepsOnTaskEdited(){
	
		return driver.findElement(By.xpath("//td[contains(@class,'bug-steps-to-reproduce')]"));

	}
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

	public void fillCategoryProject() {
		Random number = new Random();

		WebElement ListBoxStatus = categoryType;
		Select select = new Select(ListBoxStatus);
		select.selectByIndex(number.nextInt(4));

	}

	public void fillStatusProjectRandomic() {
		Random number = new Random();

		WebElement ListBoxStatus = statusProject;
		Select select = new Select(ListBoxStatus);
		select.selectByIndex(number.nextInt(4));

	}

	public void fillVisibleProjectRandomic() {
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

	public void validateTestUserCreated() {
		validateTestUserCreated.getText();
	}

	public void validateTest1Created() {
		validateTest1Created.getText();
	}

	public void clickManageTag() {
		manageTag.click();
	}

	public void clickBtnNewTask() {
		btnNewTask.click();
	}

	public void clickBtnNewTaskSideBar() {
		btnNewTaskSideBar.click();

	}

	public void selectProject(String projectName) {

		menuSelectProjects.click();

		int size = 0;
		size = selectProject.size();
		for (int i = 0; i <= size; i++) {

			String text = selectProject.get(i).getText();

			if (text.equalsIgnoreCase(projectName)) {
				selectProject.get(i).click();
				i = size;

			}
		}

	}

	public void fillFrenquenceStatusTaskRandomic() {
		Random number = new Random();

		WebElement ListBoxStatusFrequence = frequenceStatus;
		Select select = new Select(ListBoxStatusFrequence);
		select.selectByIndex(number.nextInt(5));
	}

	public void fillSeverityStatusTaskRandomic() {
		Random number = new Random();

		WebElement ListBoxStatusSeverity = severityStatus;
		Select select = new Select(ListBoxStatusSeverity);
		select.selectByIndex(number.nextInt(7));
	}

	public void fillPriorityStatusTaskRandomic() {
		Random number = new Random();

		WebElement ListBoxStatusPriority = priorityStatus;
		Select select = new Select(ListBoxStatusPriority);
		select.selectByIndex(number.nextInt(6));
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

	public void clickPencilUpdateTask(String taskName) {

		javaScriptExecutor().executeScript("arguments[0].click();", btnPencilEditTask(taskName));
		//btnPencilEditTask(taskName).click();

	}
	
public void getPriorityStatus(String priorityStatusName) {
		
		Select select = new Select(priorityStatus);
		select.selectByVisibleText(priorityStatusName);
		
		
	}
	
	public void getSeverityStatus(String severityStatusName) {
		
		Select select = new Select(severityStatus);
		select.selectByVisibleText(severityStatusName);
		
		
	}
	
	public void insertTextAreaStepToReproduce(String insertText) {
		textAreaStepToReproduce.clear();
		textAreaStepToReproduce.sendKeys(insertText);
	}
	
	public void clickOnbtnUpdateEditTask() {
		
		javaScriptExecutor().executeScript("arguments[0].click();",btnUpdateEditTask);
	}
	
	public boolean validateDataUpdateTask(String severityStatus, String priorityStatus) {
		
		boolean  validation;
		String severityName = elementValidateSeverityOnTaskEdited(severityStatus).getText();
		String priorityName = elementValidateSeverityOnTaskEdited(priorityStatus).getText();
		
		if(severityStatus.equalsIgnoreCase(severityName) && severityStatus.equalsIgnoreCase(priorityName)) {
		
			validation = true;
		}
		else {
			validation = false;
		}
		return validation;
		
	}
	
	public void validateTextStepsOnTaxk(){
		elementValidateStepsOnTaskEdited();
	}

	public boolean validadeExistTask(boolean taskResultReturn) {

		String task = "Test new task";
		int i, size;
		List<WebElement> ColectTasks = validateTask.findElements(By.xpath("tr//*[@class='column-summary']"));
		size = ColectTasks.size();

		for (i = 0; i <= size; i++) {

			String text = ColectTasks.get(i).getText();

			if (text.equalsIgnoreCase(task)) {

				i = size;
				return taskResultReturn = true;
			}

			else if (task != text) {
				taskResultReturn = false;
				System.out.println(ColectTasks.get(i).getText());
			}
		}

		return taskResultReturn;

	}

	public void fillNewCategory(String newCategory) {
		categoryField.clear();
		categoryField.sendKeys(newCategory);

	}

	public void clickBtnAddCategory() {
		btnAddCategory.click();
	}

	public void clickBtnEditCategory() {

		btnEditCategory.click();
	}

	public void fillUpdateCategoryName(String updateName) {

		updateCategoryField.clear();
		updateCategoryField.sendKeys(updateName);
	}

	public void clickBtnUpdateCategory() {

		btnSalveUpdateCategory.click();

	}

	public void clickBtnDeleteCategory() {

		btnDeleteCategory.click();
	}

	public String validNewCategory(String ct) {

		WebElement category = validateNewCategory.findElement(By.xpath("//*[text()='" + ct + "']"));

		return category.getText();

	}

	public void clickBtnConfirmDeleteCategory() {

		btnConfirmDeleteCategory.click();
	}

	public void clickBtnViewTaskSideBar() {
		btnViewTaskSideBar.click();
	}

	public void clickCheckSelectAllTasks() {
		checkSelectAllTasks.click();
	}

	public void selectActionsTask(String typeAction) {

		switch (typeAction.toLowerCase()) {

		case "delete":
			WebElement deleteAction = selectionDropDownActionTask.findElement(By.xpath("//*[@value='DELETE']"));
			deleteAction.click();

			break;
		default:

			break;
		}
	}

	public void clickToDeleteAllTasks() {
		btnDeleteAllTasks.click();
		btnConfirmDeleteTasks.click();
	}

	public void clickManageBookMarksTab() {
		manageMarkersTab.click();

	}

	public void validateManageMarkersTab() {
		assertEquals("Gerenciar Marcadores", validateManageMarkersTabActive.getText());
	}

	public void fillUpmarkerNameField(String markerName) {
		markerNameField.clear();
		markerNameField.sendKeys(markerName);

	}

	public void fillUpmarkerDescriptionField(String markerDescription) {
		markerDescriptionField.clear();
		markerDescriptionField.sendKeys(markerDescription);

	}

	public void clickBtnCreateMarker() {
		btnCreateMarker.click();

	}

	public void validateMarkerCreated(String markerName) {
		assertEquals(markerName,
				(validateMarkerCreated.findElement(By.xpath("//td//*[text()='" + markerName + "']")).getText()));
	}

	public void clickOnMarker(String markerName) {

		WebElement markerElement;
		markerElement = validateMarkerCreated.findElement(By.xpath("//td//*[text()='" + markerName + "']"));
		markerElement.click();

	}

	public void validateMarkerAccessedSucessfuly(String markerName) {
		assertEquals(true, (validateAccessMarker.getText().contains(markerName)));
	}

	public void clickBtnUpdateMarker() {

		btnUpdateMarker.click();
	}

	public void updateMarkerName(String name) {
		markerNameField.clear();
		markerNameField.sendKeys(name);
	}

	public void updateMarkerDescription(String description) {
		markerDescriptionField.clear();
		markerDescriptionField.sendKeys(description);

	}

	public void clickOnBtnDeleteMarker() {

		btnDeleteMarker.click();
	}

	public void validateMarkerDeleted(String markerName) {
		// assertEquals(markerName,
		// (validateMarkerCreated.findElement(By.xpath("//td//*[text()='"+markerName+"']")).getText()).isEmpty());

	}

}
