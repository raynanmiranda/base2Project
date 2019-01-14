package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class ForgetPassword extends LoginPage{

	// Constructor method
		LoginPage loginPg = null;
		public ForgetPassword() {
		loginPg = new LoginPage();
		}
		protected String validForgetPasswordPage = "Reajuste de Senha";
		protected String validLoginPage = "Entrar";
		protected String validMgsErro = "APPLICATION ERROR #1903";
		
		// Methods have link with cucumber to execute the scenarios
		@Given("^I already have access to the Login Page \"([^\"]*)\"$")
		public void I_already_have_access_to_the_Login_Page(String page) throws Throwable {
		    loginPg.openPage(page);
		}
		
		@Given("^I forgot my password$")
		public void i_forgot_my_password() throws Throwable {
		    
		}

		@When("^I insert a valid user \"([^\"]*)\"$")
		public void i_insert_a_valid_user(String user) throws Throwable {
		    loginPg.imputUser(user);
		    
		}

		@When("^Click on the loginButton$")
		public void click_on_the_loginButton() throws Throwable {
		    loginPg.clickBtnLogin();
		}

		@When("^Click on the link 'Perdeu a sua senha\\?'$")
		public void click_on_the_link_Perdeu_a_sua_senha() throws Throwable {
			loginPg.forgetPassword();
		}

		@Then("^will be directed to reset the password$")
		public void will_be_directed_to_reset_the_password() throws Throwable {
		    assertEquals(validForgetPasswordPage, loginPg.validateForgetPasswordPage.getText());
		}
		
		//--------------- Change PassWord Step ----------------
		
		@When("^I insert a invalid user \"([^\"]*)\"$")
		public void i_insert_a_invalid_user(String arg1) throws Throwable {
			loginPg.imputUser(arg1);
		    
		}
		
		@When("^I insert the valid e-mail \"([^\"]*)\"$")
		public void i_insert_the_valid_e_mail(String email) throws Throwable {
		    loginPg.emailField(email);
		    
		}

		@And("^click on the Send button$")
		public void click_on_the_Send_button() throws Throwable {
		    loginPg.btnSendNewPassword();
		    
		}

		@Then("^will return to loginPage$")
		public void will_return_to_loginPage() {
		    loginPg.clickBtnBackLoginPage();
			assertEquals(validLoginPage,loginPg.validateLoginPage.getText());
		    
		}
		
		@Then("^will show a message erro$")
		public void will_show_a_message_erro() {
		    assertEquals(validMgsErro,loginPg.validateMgsError.getText());
		    
		}
		
		//------------End Change passWord ---------------------------- 

}
