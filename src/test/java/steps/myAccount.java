package steps;

import static org.junit.Assert.assertEquals;

import pages.PrincipalPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAccount extends PrincipalPage{

	// Constructor method
	PrincipalPage principalPage = null;
	public MyAccount(){
		principalPage = new PrincipalPage();
	}
	
		 
	 

	
	// Methods have link with cucumber to execute the scenarios
	@Given("^I'm already logged in$")
	public void i_m_already_logged_in() throws Throwable {
	    principalPage.openPage("http://mantis.base2.com.br/login_page.php");
	    principalPage.dataLogin();
	}

	@When("^fill in the old password \"([^\"]*)\"$")
	public void fill_in_the_old_password(String oldPass) throws Throwable {
	    principalPage.oldPassword(oldPass);
	    
	}

	@And("^fill in the new password \"([^\"]*)\"$")
	public void fill_in_the_new_password(String newPass) throws Throwable {
	    principalPage.newPassword(newPass);
	    principalPage.passWordChanges(newPass);
	}

	@And("^confirm the new password \"([^\"]*)\"$")
	public void confirm_the_new_password(String arg1) throws Throwable {
	    principalPage.newPasswordConfirm(arg1);
	}

	@And("^click on 'Atualizar Usuario'$")
	public void click_on_Atualizar_Usuario() throws Throwable {
	    principalPage.btnUpdateUser();
	}

	@Then("^will salve my new password$")
	public void will_salve_my_new_password() throws Throwable {
	    
	}

	@And("^fill in a new e-mail \"([^\"]*)\"$")
	public void fill_in_a_new_e_mail(String Email) throws Throwable {
	    principalPage.email(Email);
	}

	@And("^fill in a new name \"([^\"]*)\"$")
	public void fill_in_a_new_name(String name) throws Throwable {
	    principalPage.realName(name);
	}

	@Then("^will save with sucess$")
	public void will_save_with_sucess() throws Throwable {
	    
	}

	@When("^Click on the 'Preferências' tag$")
	public void click_on_the_Preferências_tag() throws Throwable {
	    principalPage.preferencesTag();
	}

	@Then("^Will access the preferences itens$")
	public void will_access_the_preferences_itens() throws Throwable {
	    assertEquals("Preferências", principalPage.validateMenusMyAccount.getText());
	}

	@When("^Click on the 'Gerenciar colunas' tag$")
	public void click_on_the_Gerenciar_colunas_tag() throws Throwable {
	    principalPage.manageColunsTag();
	}

	@Then("^Will access the manageColuns itens$")
	public void will_access_the_manageColuns_itens() throws Throwable {
		assertEquals("Gerenciar Colunas", principalPage.validateMenusMyAccount.getText());
	}

	@When("^Click on the 'Perfils' tag$")
	public void click_on_the_Perfils_tag() throws Throwable {
	    principalPage.perfilTag();
	}

	@Then("^Will access the perfils itens$")
	public void will_access_the_perfils_itens() throws Throwable {
		assertEquals("Perfís", principalPage.validateMenusMyAccount.getText());
	}

	@When("^Click on the 'TokenAPI' tag$")
	public void click_on_the_TokenAPI_tag() throws Throwable {
	    principalPage.tokenApiTag();
	}

	@Then("^Will access the TokenAPI itens$")
	public void will_access_the_TokenAPI_itens() throws Throwable {
		assertEquals("Tokens API", principalPage.validateMenusMyAccount.getText());
	}
	
	
}
