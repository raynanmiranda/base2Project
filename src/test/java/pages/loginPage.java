package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

import org.openqa.selenium.WebElement;

public class loginPage extends PageBase {

	@FindBy(how = How.ID, using = "username")
	public WebElement userField;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement passwordField;
	
	@FindBy(how = How.XPATH, using = "//*[@value='Entrar']")
	public WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']//p[contains(text(),'usuário e a senha')]")
	public WebElement mgsLoginInvalid;
	
	@FindBy(how = How.XPATH, using = "//*[@id='login-form']/fieldset/a")
	public WebElement linkForgetPassword;
	
	@FindBy (how = How.XPATH, using = "//*[@id='login-box']/div/div[1]/h4")
	public WebElement validateForgetPasswordPage;
	
	@FindBy(how = How.XPATH, using = "//*[@id='login-box']/div/div[2]/a")
	public WebElement btnCreateNewAccount;
	
	@FindBy (how = How.XPATH, using = "//*[@id='login-box']/div/div[1]/h4")
	public WebElement validateCreatePage;
	
	@FindBy (how = How.ID, using = "email-field")
	public WebElement emailField;
	
	@FindBy(how = How.XPATH, using = "//*[@value='Enviar']")
	public WebElement btnSendNewPassword;
	
	@FindBy(how = How.XPATH, using = "//*[@id='login-box']/div/div[1]/h4")
	public WebElement validateLoginPage;
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-container']/div/div[2]/p[1]")
	public WebElement validateMgsError;
	
	public void openPage(String page) {
		navegateTo(page); 
	}
	
	public void imputUser (String user) {
		userField.sendKeys(user);
	}	
	
	public void imputPassword(String password) {
		passwordField.sendKeys(password);
		
	}
	
	public void clickBtnLogin () {
		btnLogin.click();
	}
	
	public void forgetPassword () {
		linkForgetPassword.click();
	}
	
	public void btnCreateNewAccount() {
		btnCreateNewAccount.click();
	}
	
	public void emailField (String email) {
		emailField.sendKeys(email);
	}
	
	public void btnSendNewPassword() {
		btnSendNewPassword.click();
	}
}
