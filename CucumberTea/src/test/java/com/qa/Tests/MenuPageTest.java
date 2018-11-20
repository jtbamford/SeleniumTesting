package com.qa.Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuPageTest {
	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000451934628\"]")
	private WebElement browsecheck;
	
	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
	private WebElement checkout;
	
	public Boolean browse() {
		//if(string.equals("menu")) {
		return browsecheck.isDisplayed();
		//}
		//search.sendKeys(Keys.ENTER);
	}
	
	public void clickCheckout() {
		checkout.click();
	}

}
