package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.CombinableMatcher;
import org.junit.Assert;
import pages.CartPage;
import pages.HomePage;
import pages.WishListPage;
import utils.CommonMethods;

public class HomePageSteps extends CommonMethods {

    @Given("I am able to open the chrome browser and launch the application")
    public void i_am_able_to_open_the_chrome_browser_and_launch_the_application() {
       setUp();
    }

    @When("I add four different products to my wish list")
    public void i_add_four_different_products_to_my_wish_list() throws InterruptedException {
        HomePage hp = new HomePage();
        hp.clickOnFirstItem();
        hp.clickOnSecondtItem();
        hp.clickOnThirdItem();
        hp.clickOnFourthItem();
    }

    @When("I view my wishlist table")
    public void i_view_my_wishlist_table() throws InterruptedException {
        HomePage hp = new HomePage();
        hp.clcikOnWishListOption();
    }
    @Then("I find total four selected items in my whishlist")
    public void i_find_total_four_selected_items_in_my_whishlist() throws InterruptedException {
        WishListPage wp = new WishListPage();
        wp.getPrices();
    }
    @When("I search for lowest price product")
    public void i_search_for_lowest_price_product() {
        System.out.println("implemented");
    }
    @When("I am able to add the lowest price item  to my cart")
    public void i_am_able_to_add_the_lowest_price_item_to_my_cart() throws InterruptedException {
        WishListPage wp = new WishListPage();
        wp.clickOnCartOption();

    }
    @Then("I a, able to verify the item in my cart")
    public void i_a_able_to_verify_the_item_in_my_cart() {
        CartPage cp = new CartPage();
        String price = cp.itemInTheCart.getText();
        String p = price.replace("£", "");
        // System.out.println(newt);
        double seoncdPriceValue = Double.parseDouble(p);
        int ValueInInt = (int) seoncdPriceValue;
        System.out.println(ValueInInt);

        WishListPage wp = new WishListPage();
        String pricew = cp.itemInTheCart.getText();
        String wishListPriceLowest = pricew.replace("£", "");
        double valueFromWishList = Double.parseDouble(wishListPriceLowest);
        int wishValueInInt= (int) valueFromWishList;
        Assert.assertEquals(ValueInInt, wishValueInInt);

    }

    @Then("I close my browser")
    public void i_close_my_browser() {
        //tearDown();
        System.out.println("close browser");
    }
}
