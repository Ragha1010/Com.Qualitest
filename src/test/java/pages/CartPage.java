package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CartPage extends CommonMethods {

    @FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement itemInTheCart;

    public CartPage() {
        PageFactory.initElements(driver, this);
    }



    public void testPrice() {
        String price = itemInTheCart.getText();
        //System.out.println(secondprice);
        String p = price.replace("£", "");
        // System.out.println(newt);
        double seoncdPriceValue = Double.parseDouble(p);
        int ValueInInt = (int) seoncdPriceValue;
        System.out.println(ValueInInt);
    }
}