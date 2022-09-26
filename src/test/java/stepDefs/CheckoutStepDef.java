package stepDefs;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;

public class CheckoutStepDef extends TestBase{

	HomePage homePage;
	SearchResultPage resultPage;
	ShoppingCartPage cartPage;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		initialize();
	}
	@When("User search an {string}")
	public void user_search_an(String strItem) {
		homePage = new HomePage();
		homePage.searchItem(strItem);
	}
	@Then("Should display Search result Page")
	public void should_display_search_result_page() {
		resultPage = new SearchResultPage();
		boolean isResultPage = resultPage.isItemDisplayed();
		Assert.assertTrue(isResultPage);
	}
	
	@Given("Navigate to Item Detail Page")
	public void navigate_to_item_detail_page() {
		resultPage = new SearchResultPage();
	    resultPage.navigateToDetailPage();
	}
	
	
	@When("User add item to cart")
	public void user_add_item_to_cart() {
		resultPage = new SearchResultPage();
		resultPage.addItem();
	}
	@Then("Item must be available in cart")
	public void item_must_be_available_in_cart() {
	   cartPage = new ShoppingCartPage();
	   boolean isItemAvlb = cartPage.checkCartNotEmpty();
	   Assert.assertTrue(isItemAvlb);
	}


}
