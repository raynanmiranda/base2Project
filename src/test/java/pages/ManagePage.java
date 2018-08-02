package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.PageBase;

public class ManagePage extends PageBase{

	@FindBy(how = How.CLASS_NAME, using = "btn btn-primary btn-white btn-round")
	public WebElement btnCriarNovoProjeto;
	
	@FindBy(how = How.ID, using = "project-name")
	public WebElement nameProjectField;	
	
	public void btnCriarNovoProjeto() {
		btnCriarNovoProjeto.click();
	}
	
	public void insertNameProjectField(String nameProject) {
		nameProjectField.clear();
		nameProjectField.sendKeys(nameProject);
	}
	
}
