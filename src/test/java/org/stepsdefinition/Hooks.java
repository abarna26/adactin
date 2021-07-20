package org.stepsdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before(order=-5)
	public void lanuchbrowser() {
		getdriver();
		lanuchUrl("http://adactinhotelapp.com/");
		toMaximimize();
		towait();
		}
	@Before(order=2)
	public void currenturl() {
		toGetTitle();
		
	}
	@After(order=8)
	public void screenshot(Scenario s) throws IOException {
		if (s.isFailed()) {
			String n=s.getName();
			 System.out.println(n);
			 
			 
			 s.embed(bytescreenshot(), "image/png");
		}
		 

	}
	@After(order=2)
	public void close() {
		toclose();

	}

}
