package steps;


import static org.junit.Assert.assertEquals;

import pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep extends LoginPage {
	
	// Constructor Method
	LoginPage loginPage = null;
	protected String mgsLoginInvalid = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.";
	public LoginStep() {
		loginPage = new LoginPage();
	}

			//********* LOGIN SUCESS ***********
	
	// Methods have link with cucumber to execute the scenarios
	@Given("^I want to Login on the \"([^\"]*)\"$")
	public void i_want_to_Login_on_the(String page){
	    loginPage.openPage(page);
	    
	}

	@When("^I Insert the user \"([^\"]*)\"$")
	public void i_Insert_the_user(String arg1) throws Throwable {
	    loginPage.imputUser(arg1);
	    
	}

	@And("^Insert the password \"([^\"]*)\"$")
	public void insert_the_password(String arg1) throws Throwable {
	   loginPage.imputPassword(arg1);
	}

	@And("^Click on LoginButton$")
	public void click_on_LoginButton() throws Throwable {
		loginPage.clickBtnLogin();
	}

	@Then("^I will login with sucess$")
	public void i_will_login_with_sucess() throws Throwable {
	    System.out.println(" User Logged with Sucess");
	    
	}
	
	
	
	// ****** INVALID USER LOGIN AND PASSWORD ******
	
	@When("^I Insert the invalid user \"([^\"]*)\"$")
	public void i_Insert_the_invalid_user(String arg1) throws Throwable {
	    loginPage.imputUser(arg1);
	}
	
	@And("^Insert the invalid password \"([^\"]*)\"$")
	public void insert_the_invalid_password(String arg1) throws Throwable {
	   loginPage.imputPassword(arg1);
	}
	
	@Then("^I will not login with sucess$")
		public void i_will_not_login_with_sucess() throws Throwable {
		    Thread.sleep(1000);
	    	assertEquals(loginPage.mgsLoginInvalid.getText(),mgsLoginInvalid);
	    	
	}
	    
	
}
