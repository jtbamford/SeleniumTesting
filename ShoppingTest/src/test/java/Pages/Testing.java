package Pages;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	
	WebDriver driver;
	String url;
	
	@Before
	public void setup() {
		url="http://automationpractice.com/index.php";
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
		h1.searchForClothing("jumper");
		SearchPage s1 = PageFactory.initElements(driver,SearchPage.class);
		assertEquals(s1.searchResult(),h1.searchForClothing("jumper"));
	}

}
