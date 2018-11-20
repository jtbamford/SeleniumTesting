package com.qa.Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomepageTest {
	
	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menu;
	
	public void moveToPage(String string) {
		//if(string.equals("menu")) {
		menu.click();
		//}
		//search.sendKeys(Keys.ENTER);
	}
	
}
