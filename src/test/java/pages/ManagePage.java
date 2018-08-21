package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.PageBase;

public class ManagePage extends PageBase{

public String nameProject;
	
	@FindBy(how = How.CSS, using = "button[class*='btn-white']")
	public WebElement btnCriarNovoProjeto;
	
	@FindBy(how = How.ID, using = "project-name")
	public WebElement nameProjectField;	
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/manage_proj_page.php']")
	public WebElement manageProjectTag; //	Gerenciar Projetos
	
	@FindBy(how = How.XPATH, using = "//*[@value='Adicionar projeto']")
	public WebElement btnAddNewProject; //	Criar Projeto
	
	@FindBy(how = How.ID, using = "project-status")
	public WebElement statusProject; //	estado(Project)
	
	@FindBy(how = How.ID, using = "project-view-state")
	public WebElement visibleProject; //	visibility(Project)
	
	@FindBy(how = How.ID, using = "project-description")
	public WebElement txtDescriptionField; //	Description(Project)
	
	@FindBy(how = How.LINK_TEXT, using = "testNewProject")//"//*[@id='main-container']//*[2][@class='table-responsive']//a[text()='testNewProject']")
	public WebElement validateProjectCreated; //	Description(Project)
	
	@FindBy(how = How.ID, using = "user-username")
	public WebElement user_Name; //	UserName of create new Account(Manager Users)
	
	@FindBy(how = How.ID, using = "user-realname")
	public WebElement real_Name; //	UserName of create new Account(Manager Users)
	
	@FindBy(how = How.ID, using = "email-field")
	public WebElement email; //	UserName of create new Account(Manager Users)
	
	@FindBy(how = How.ID, using = "user-access-level")
	public WebElement accesslevel; //	UserName of create new Account(Manager Users)
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/manage_user_page.php']")
	public WebElement manageUsersTag; //	Gerenciar Usuarios
	
	@FindBy(how = How.XPATH, using = "//*[@id='manage-user-div']//*[text()='Criar nova conta']")
	public WebElement btnCreateNewAccount; //Criar nova conta
	
	@FindBy(how = How.XPATH, using = "//*[@value='Criar Usuario']")
	public WebElement btnCreateNewUser; //Criar Usuario 
	
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
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		nameProject =	validateProjectCreated.getText();
		
		
	}
	
	public void manageUsersTag() {
		manageUsersTag.click();
	}
	public void btnCreateNewAccount() throws InterruptedException {
		
		btnCreateNewAccount.click();
	}
	
	public void set_DataFileUser() throws Exception {
		
		
		
	}
	
	
	public void btnCreateNewUser() {
		btnCreateNewUser.click();
	}

	
}
