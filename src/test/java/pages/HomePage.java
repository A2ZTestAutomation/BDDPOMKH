package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(name="searchbar")
	WebElement inputTxt;
	
	@FindBy(id="button-search")
	WebElement srcBtn;
	
	//Loginbtn
	//SignBtn
	//ViewCartBtn
	
	//Actions
	//SearchItem
	public void searchItem(String item) {
		inputTxt.sendKeys(item);
		srcBtn.click();
	}
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	//Login Into app
	//Signin app
	//View cart
	//Select Items
}
