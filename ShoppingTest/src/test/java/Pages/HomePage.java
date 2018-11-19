package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="search_query_top")
	private WebElement search;
	
	public boolean searchForClothing(String clothes) {
		search.click();
		search.clear();
		search.sendKeys(clothes);
		search.sendKeys(Keys.ENTER);
		return true;
	}

}
