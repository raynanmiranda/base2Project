package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

public class AccountPage extends PageBase{

	//*** The elements Map *************
	@FindBy(how = How.ID,using="username")
	public WebElement userNameField;
	
	@FindBy(how = How.ID,using="email-field")
	public WebElement emailField;
	
	@FindBy(how = How.ID,using="captcha-field")
	public WebElement captchaField;
	
	@FindBy(how = How.XPATH, using = "//*[@value='Criar Conta']")
	public WebElement btnCreateAccount;
	
	//**********************************
}

