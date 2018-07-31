package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.PageBase;

public class PrincipalPage extends PageBase {

	private String userName = "raynan.miranda";
	protected static String NewPass = "29092017"; 
	
	
	//****** The Elements Map ******
	@FindBy(how = How.ID, using = "username")
	public WebElement userField;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement passwordField;
	
	@FindBy(how = How.XPATH, using = "//*[@value='Entrar']")
	public WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using="//*[@class='dropdown-toggle']")
	public WebElement myAccountMenu;
	
	@FindBy(how = How.XPATH, using="//*[@class='user-menu dropdown-menu dropdown-menu-right dropdown-yellow dropdown-caret dropdown-close']//*[@href='/account_page.php']")
	public WebElement myAccount; 
	
	@FindBy(how = How.XPATH, using="//*[@class='active']/a")
	public WebElement validateMyAccount;
	
	@FindBy (how = How.XPATH, using="//*[@class='nav nav-list']//*[@href='/view_all_bug_page.php']")
	public WebElement menuSeeTask;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bug_action\"]//*[@class='widget-title lighter']")
	public WebElement validateSeeTask;
	
	@FindBy (how = How.XPATH, using="//*[@class='nav nav-list']//*[@href='/bug_report_page.php']")
	public WebElement menuCreateTask;
	
	@FindBy(how = How.XPATH, using = "//*[@value='Criar Nova Tarefa']")
	public WebElement validateCreateTask;
	
	@FindBy (how = How.XPATH, using="//*[@class='nav nav-list']//*[@href='/bug_report_page.php']")
	public WebElement btnCreateTask;
	
	@FindBy (how = How.XPATH, using="//*[@class='btn btn-primary btn-sm']")
	public WebElement menuRegisterChange;
	
	@FindBy(how = How.XPATH, using = "//*[@class='active']")
	public WebElement validateRegisterChange;
	
	@FindBy (how = How.XPATH, using="//*[@class='nav nav-list']//*[@href='/roadmap_page.php']")
	public WebElement menuPlanning;
	
	@FindBy(how = How.XPATH, using = "//*[@class='active']")
	public WebElement validatePlanning;
	
	@FindBy(how = How.ID, using = "password-current")
	public WebElement oldPassword;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement newPassword;
	
	@FindBy(how = How.ID, using = "password-confirm")
	public WebElement newPasswordConfirm;
	
	@FindBy(how = How.ID, using = "email-field")
	public WebElement email;
	
	@FindBy(how = How.ID, using = "realname")
	public WebElement realName;
	
	@FindBy(how = How.XPATH, using = "//*[@value='Atualizar Usuário']")
	public WebElement btnUpdateUser;

	@FindBy(how = How.XPATH, using = "//*[@class='active']/a")
	public WebElement validateMenusMyAccount;
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/account_prefs_page.php']")
	public WebElement preferencesTag; //	Preferências
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/account_manage_columns_page.php']")
	public WebElement manageColunsTag; //	Gerenciar Colunas
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/account_prof_menu_page.php']")
	public WebElement perfilTag; //	Perfís
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//*[@href='/api_tokens_page.php']")
	public WebElement tokenApiTag; //	Tokens API
	
	
	// Methods used to access elements and do actions
	public void openPage(String page) {
		navegateTo(page); 
	}
	
	public void myAccountMenu() {
		myAccountMenu.click();
		
	}
	
	public void myAccount() {
		myAccount.click();
		
	}
	public void dataLogin() {
		userField.sendKeys(userName);
		btnLogin.click();
		passwordField.sendKeys(NewPass);
		btnLogin.click();
	}
	public void passWordChanges(String password) {
		NewPass = password;
	}
	
	public void menuSeeTask() {
		menuSeeTask.click();
	}
	
	public void menuCreateTask() {
		menuCreateTask.click();
	}	
	public void btnCreateTask() {
		btnCreateTask.click();
	}
	
	public void menuRegisterChange() {
		menuRegisterChange.click();
	}
	
	public void menuPlanning() {
		menuPlanning.click();
	}
	
	public void oldPassword(String oldPass) {
		oldPassword.clear();
		oldPassword.sendKeys(oldPass);
	}	
	public void newPassword(String newPass) {
		newPassword.clear();
		newPassword.sendKeys(newPass);
	}
	public void newPasswordConfirm(String confirmPass) {
		newPasswordConfirm.clear();
		newPasswordConfirm.sendKeys(confirmPass);
	}
	public void email(String Email) {
		email.clear();
		email.sendKeys(Email);
	}
	public void realName(String name) {
		realName.clear();
		realName.sendKeys(name);
	}
	public void btnUpdateUser() {

		btnUpdateUser.click();
	}
	
	public void preferencesTag() {
		preferencesTag.click();
	}
	
	public void manageColunsTag() {
		manageColunsTag.click();
	}
	
	public void perfilTag() {
		perfilTag.click();
	}
	
	public void tokenApiTag() {
		tokenApiTag.click();
	}
	
}

