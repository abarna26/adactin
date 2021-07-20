package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	public Loginpage() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement txtuser;
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtpass;
	@FindBy(xpath="//input[@id='login']")
	private WebElement clickbtn;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getClickbtn() {
		return clickbtn;
	}
	public void login(String username,String password) {
		toSendInput(getTxtuser(),username);
		toSendInput(getTxtpass(),password);
		toClick(getClickbtn());
		

	}

}
