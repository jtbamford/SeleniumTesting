package com.qa.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/div/input")
	private WebElement search;
	
	@FindBy(xpath="/html/body/div[9]")
	private WebElement setOffDate;
	
	@FindBy(xpath="/html/body/div[10]")
	private WebElement returnDate;
	
	public void searchForPlace(String place) {
		search.click();
		search.clear();
		search.sendKeys(place);
		//search.sendKeys(Keys.ENTER);
	}
	
	public void setOffDate(String date) {
		setOffDate.click();
		setOffDate.clear();
		setOffDate.sendKeys(date);
		//search.sendKeys(Keys.ENTER);
	}
	
	public void returnDate(String date) {
		returnDate.click();
		returnDate.clear();
		returnDate.sendKeys(date);
		//search.sendKeys(Keys.ENTER);
	}
	
	
	public void search(String place) {
		search.click();;
		search.sendKeys(Keys.ENTER);
	}
	
	


}
