package com.qa.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.Tests.HomepageTest;
import static org.junit.Assert.*;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Steps {
	
	WebDriver driver;
	String url;
	
	@After
	public void tearDown() throws Exception {
		//Thread.sleep(3000);
		driver.quit();
	}
	
	@Before
	public void setup() {
		url="http://www.practiceselenium.com/welcome.html";
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Development/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("the correct web address")
	public void the_correct_web_address() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
		driver.getCurrentUrl();
		if(url.equals(driver.getCurrentUrl())) {
			testRunner.test.log(LogStatus.PASS, "correct url");

		}
		assertEquals(url,driver.getCurrentUrl());
	}

	@When("I navigate to the {string} page")
	public void i_navigate_to_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//string="menu";
		HomepageTest h1 = PageFactory.initElements(driver,HomepageTest.class);
		h1.moveToPage(string);
		if("http://www.practiceselenium.com/menu.html".equals(driver.getCurrentUrl())) {
			testRunner.test.log(LogStatus.PASS, "navigated to menu page");

		}
		assertEquals("http://www.practiceselenium.com/menu.html",driver.getCurrentUrl());
	}

	@Then("I can browse a list of the available products.")
	public void i_can_browse_a_list_of_the_available_products() {
	    // Write code here that turns the phrase above into concrete actions
		MenuPageTest m1 = PageFactory.initElements(driver,MenuPageTest.class);
		m1.browse();
		if(m1.browse().equals(true)) {
			testRunner.test.log(LogStatus.PASS, "can browse list of products");
		}
		assertEquals(true,m1.browse());
		
	}

	@When("I click the checkout button")
	public void i_click_the_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		MenuPageTest m1 = PageFactory.initElements(driver,MenuPageTest.class);
		m1.clickCheckout();
	}

	@Then("I am taken to the checkout page")
	public void i_am_taken_to_the_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		if("http://www.practiceselenium.com/check-out.html".equals(driver.getCurrentUrl())) {
			testRunner.test.log(LogStatus.PASS, "taken to checkout page");

		}
		assertEquals("http://www.practiceselenium.com/check-out.html",driver.getCurrentUrl());
	}



}
