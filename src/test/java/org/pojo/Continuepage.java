package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continuepage extends BaseClass {
	public Continuepage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement selectbtn;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebtn;
	
	public WebElement getSelectbtn() {
		return selectbtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	public void tocontinue() {
		
		toClick(selectbtn);
		toClick(continuebtn);
	}
	

}
