package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booknow extends BaseClass {
	public Booknow() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txtfirstname;
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txtlastname;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement txtaddresstname;
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement txtcreditcardtno;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement creditcardtype;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement monthbtn;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement yearbtn;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement textcvvno;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement booknowbtn;
	
	
	
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtaddresstname() {
		return txtaddresstname;
	}
	public WebElement getTxtcreditcardtno() {
		return txtcreditcardtno;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getMonthbtn() {
		return monthbtn;
	}
	public WebElement getYearbtn() {
		return yearbtn;
	}
	public WebElement getTextcvvno() {
		return textcvvno;
	}
	
	public WebElement getBooknowbtn() {
		return booknowbtn;
	}
	public void tobooknow(String firstname,String  lastname, String address,String ccno ,String cctype, String month,String year,String cvvno ) {
		toSendInput(getTxtfirstname(), firstname);
		toSendInput(getTxtlastname(), lastname);
		toSendInput(getTxtaddresstname(), address);
		toSendInput(getTxtcreditcardtno(), ccno);
		toSelectByVisibletext(getCreditcardtype(), cctype);
		toSelectByVisibletext(getMonthbtn(), month);
		toSelectByVisibletext(getYearbtn(), year);
		toSendInput(getTextcvvno(), cvvno);
		toClick(getBooknowbtn());
		

	}
	

}
//VISA
//December
//2022