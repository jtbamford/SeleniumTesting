package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span")
	private WebElement searchresult;
	
	public boolean searchResult() {
		return searchresult.isDisplayed();
	}

}
