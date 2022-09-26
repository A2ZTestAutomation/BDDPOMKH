package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase
{
	
	@FindAll({@FindBy(css = "ul > li.preview") })
	List<WebElement> items;
	
	@FindBy(css = "ul > li.preview")
	WebElement item;
	
	@FindBy(css="div.detail-wrapper > button.call-to-action")
	WebElement addBtn;
	
	//Actions
	public void navigateToDetailPage() {
		item.click();
	}
	
	public void addItem() {
		addBtn.click();
	}
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isItemDisplayed() {
		if(!items.isEmpty())
			return true;
		else 
			return false;
				
	}
		

}
