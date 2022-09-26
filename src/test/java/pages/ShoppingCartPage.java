package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartPage extends TestBase{
	
	@FindAll({@FindBy(css="ul > li")})
	List<WebElement> items;
	
	@FindBy(id="billing-coupon")
	WebElement chkCoupon;
	
	@FindBy(id="coupon")
	WebElement txtCoupon;
	
	
	@FindBy(xpath="//button[contains(text(), 'Apply')]")
	WebElement applyBtn;
	
	@FindBy(css="div.account-buttons > button.call-to-action")
	WebElement chkOutBtn;
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	//applyCoupon
	public void applyCoupon() {
		if(checkCartNotEmpty()) {
			txtCoupon.sendKeys("hi");
			applyBtn.click();
		}
	}
	
	public boolean checkCartNotEmpty() {
		if(items.size() > 0)
			return true;
		else 
			return false;
	}
	
	//checkout
	public void checkOutCart() {
		if(checkCartNotEmpty()) {
			chkOutBtn.click();
		}
	}
	
	//emptyCarg
	
	
}
