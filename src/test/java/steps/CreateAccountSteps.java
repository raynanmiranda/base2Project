package steps;

import static org.junit.Assert.assertEquals;

import pages.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountSteps extends loginPage {

	loginPage loginPage = null;
	public CreateAccountSteps() {
	loginPage = new loginPage();
	}
	
	@Given("^I already have access Login Page \"([^\"]*)\"$")
	public void I_already_have_access_Login_Page(String page) throws Throwable {
		loginPage.openPage(page);
	}
	
	@When("^I click on the 'criar uma nova conta'$")
	public void i_click_on_the_criar_uma_nova_conta() throws Throwable {
	    loginPage.btnCreateNewAccount();
	}

	@Then("^will be directed to signup Page$")
	public void will_be_directed_to_signup_Page() throws Throwable {
	    assertEquals(loginPage.validateCreatePage.getText(),"Criar Conta");
	}

}
