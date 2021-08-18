package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class WishListPage extends CommonMethods {



    @FindBy(xpath="(//*[@class='woocommerce-Price-amount amount'])[5]")
    public WebElement price_First_Item;

    @FindBy(xpath="(//*[@class='woocommerce-Price-amount amount'])[8]")
    public WebElement price_Second_Item;

    @FindBy(xpath="(//*[@class='woocommerce-Price-amount amount'])[9]")
    public WebElement price_Third_Item;

    @FindBy(xpath="(//*[@class='woocommerce-Price-amount amount'])[11]")
    public WebElement price_Fourth_Item;

    @FindBy(xpath="(//*[@class='product-add-to-cart'])[5]")
    public WebElement fourthProduct;

    @FindBy(xpath="(//*[@class='product-add-to-cart'])[4]")
    public WebElement thirdProduct;

    @FindBy(xpath="(//*[@class='product-add-to-cart'])[3]")
    public WebElement secondProduct;

    @FindBy(xpath="(//*[@class='product-add-to-cart'])[2]")
    public WebElement firstProduct;

    @FindBy(xpath="//*[@class='la la-shopping-bag']")
    public WebElement cartoption;




    public WishListPage(){
        PageFactory.initElements(driver, this);
    }

    public void waitForLoad() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void getPrices() throws InterruptedException {

        Thread.sleep(3000);
        String firstprice = price_First_Item.getText();
       // System.out.println(firstprice);
        String newF = firstprice.replace("£", "");
       // System.out.println(newF);
        double firstPriceValue = Double.parseDouble(newF);
        int firstPriceValueInInt = (int) firstPriceValue;
        System.out.println(firstPriceValueInInt);

        String thirdprice = price_Third_Item.getText();
       // System.out.println(thirdprice);
        String newt = thirdprice.replace("£", "");
       // System.out.println(newt);
        double thirdPriceValue = Double.parseDouble(newt);
        int thirdPriceValueInInt = (int) thirdPriceValue;
        System.out.println(thirdPriceValueInInt);

        String secondprice = price_Second_Item.getText();
        //System.out.println(secondprice);
        String news = secondprice.replace("£", "");
       // System.out.println(newt);
        double seoncdPriceValue = Double.parseDouble(news);
        int secondPriceValueInInt = (int) seoncdPriceValue;
        System.out.println(secondPriceValueInInt);

        String fourthprice = price_Fourth_Item.getText();
       // System.out.println(fourthprice);
        String newf = fourthprice.replace("£", "");
       // System.out.println(newt);
        double fourthPriceValue = Double.parseDouble(newf);
        int fourthPriceValueInInt = (int) fourthPriceValue;
        System.out.println(fourthPriceValueInInt);

        if(firstPriceValueInInt<secondPriceValueInInt && firstPriceValueInInt<thirdPriceValueInInt && firstPriceValueInInt<fourthPriceValueInInt){
            System.out.println("First product has the lowest price");
            firstProduct.click();
        }else if(secondPriceValueInInt<thirdPriceValueInInt && secondPriceValueInInt<fourthPriceValueInInt && secondPriceValueInInt<firstPriceValueInInt){
            System.out.println("second product has the lowest price");
            secondProduct.click();
        }else if(thirdPriceValueInInt<fourthPriceValueInInt && thirdPriceValueInInt<secondPriceValueInInt && thirdPriceValueInInt<firstPriceValueInInt){
            System.out.println("third product has the lowest price");
            thirdProduct.click();
        }else if(fourthPriceValueInInt<thirdPriceValueInInt && fourthPriceValueInInt<secondPriceValueInInt && fourthPriceValueInInt<firstPriceValueInInt){
            System.out.println("fourth product has the lowest price");
            fourthProduct.click();
        }else{
            System.out.println("no value found");
        }

        Thread.sleep(4000);
    }

    public void clickOnCartOption() throws InterruptedException {
        waitForLoad();
        cartoption.click();
        Thread.sleep(5000);
    }
}
