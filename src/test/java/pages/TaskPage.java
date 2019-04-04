package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

public class TaskPage extends PageBase {

	
	@FindBy(how = How.XPATH, using = "//*[@id='buglist']/tbody//*[@class='column-id']/a")
	public WebElement numTaskLink;
	
	@FindBy(how = How.ID, using = "bug_monitor_list_username")
	public WebElement nameUserTaskField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='monitoring']//*[@value='Adicionar']")
	public WebElement btnAddUserTask;
	
	private WebElement validateUserOnTask(String userTask) {
		
		return driver.findElement(By.xpath("//*[@id='monitoring']//td//*[text()='"+userTask+"']"));
	}
	
	public void clickBtnTaskLink() {
		numTaskLink.click();
	}
	
	public void insertNameUserTaskField(String userTask) {
		
		nameUserTaskField.clear();
		nameUserTaskField.sendKeys(userTask);
	}
	
	public void clickBtnAddUserTask() {
		btnAddUserTask.click();
	}
	
	public boolean validateUserAddedOnTask(String userTask) {
		
		if(validateUserOnTask(userTask).getText().equals(userTask)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
