package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span")
	private WebElement searchresult;
	
	
	
	public boolean searchResult() {
		return searchresult.isDisplayed();
	}

}
