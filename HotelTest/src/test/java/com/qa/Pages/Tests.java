package com.qa.Pages;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.Pages.HomePage;
import com.qa.Pages.ResultPage;

public class Tests {
	
	
	WebDriver driver;
	String url;
	
	@Before
	public void setup() {
		url="https://www.phptravels.net/";
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Development/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		//Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void searchTest() {
		driver.get(url);
		HomePage h1 = PageFactory.initElements(driver,HomePage.class);
		h1.searchForPlace("London");
		h1.setOffDate("25/11/2018");
		h1.returnDate("28/11/2018");
		//ResultPage s1 = PageFactory.initElements(driver,ResultPage.class);
		//assertEquals(s1.searchResult(),h1.searchForPlace("London"));
	}

}
