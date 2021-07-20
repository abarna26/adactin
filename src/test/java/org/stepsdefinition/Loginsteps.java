package org.stepsdefinition;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.Booknow;
import org.pojo.Continuepage;
import org.pojo.Loginpage;
import org.pojo.searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends BaseClass {
	
	@Given("As a User enter {string} and {string} and click login button")
	public void login(String username, String password) {
		Loginpage l= new Loginpage();
		l.login(username, password);
	    
	}

	@When("As a user verify the message")
	public void as_a_user_verify_the_message() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	    
	}

	@Then("As a user select {string} and {string} and {string} and{string} andclick the search button")
	public void select(String location, String hotel, String roomtype, String noofrooms) {
		searchpage s = new searchpage();
		s.search(location, hotel, roomtype, noofrooms);
	   
	   
	}

	@Then("As a user click select and continue button")
	public void as_a_user_click_select_and_continue_button() {
		Continuepage c=new Continuepage();
    	c.tocontinue();
	    
	}

	@Then("As a user enter {string} and{string} and {string} and {string} and {string} and {string} and{string}and{string} and click book now button")
	public void click(String firstname,String  lastname, String address,String ccno ,String cctype, String month,String year,String cvvno ) {
		Booknow b = new Booknow();
    	b.tobooknow(firstname, lastname, address, ccno, cctype, month, year, cvvno);
		
	    
	}

	@Then("As a user enter {string} and{string} and {string} and {string} and {string} and {string} and{string}and{string} and click boo")
	public void booknow(String firstname,String  lastname, String address,String ccno ,String cctype, String month,String year,String cvvno ) {
		Booknow b = new Booknow();
    	b.tobooknow(firstname, lastname, address, ccno, cctype, month, year, cvvno);
	    
	}


	


}
