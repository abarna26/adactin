package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class searchpage extends BaseClass {
	public searchpage() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//select[@id='location']")
	private WebElement locationbtn; 
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotelbtn;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtypebtn;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noofroomsbtn; 
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement searchbtn;
	
	
	public WebElement getLocationbtn() {
		return locationbtn;
	}
	public WebElement getHotelbtn() {
		return hotelbtn;
	}
	public WebElement getRoomtypebtn() {
		return roomtypebtn;
	}
	public WebElement getNoofroomsbtn() {
		return noofroomsbtn;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	} 
 public void search( String location, String hotel, String roomtype ,String noofrooms ) {
	 toSelectByVisibletext(locationbtn, location);
	 toSelectByVisibletext(hotelbtn, hotel);
	 toSelectByVisibletext(roomtypebtn, roomtype);
	 toSelectByVisibletext(noofroomsbtn, noofrooms);
	 toClick(searchbtn);
	 
	

}




}
