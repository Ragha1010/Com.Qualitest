package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonMethods {

    @FindBy(xpath="(//*[@class='yith-wcwl-icon fa fa-heart-o'])[1]")
    public WebElement firstItem;


    @FindBy(xpath="(//*[@class='yith-wcwl-icon fa fa-heart-o'])[3]")
    public WebElement secondItem;


    @FindBy(xpath="(//*[@class='yith-wcwl-icon fa fa-heart-o'])[4]")
    public WebElement thirdItem;


    @FindBy(xpath="(//*[@class='yith-wcwl-icon fa fa-heart-o'])[5]")
    public WebElement fourthItem;

    @FindBy(xpath="(//*[@class='lar la-heart'])[1]")
    public WebElement wishList;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public void clickOnFirstItem(){
       // waitForLoad();
        if (firstItem.isDisplayed()){
            firstItem.click();
            System.out.println("first item selected");
        }
    }

    public void clickOnSecondtItem(){
        //waitForLoad();
        if (secondItem.isDisplayed()){
            secondItem.click();
            System.out.println("second item selected");
        }
    }



    public void clickOnThirdItem() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        //waitForLoad();
        if (thirdItem.isDisplayed()){
            thirdItem.click();
            System.out.println("third item selected");
        }
    }

    public void clickOnFourthItem(){
        //waitForLoad();
        if (fourthItem.isDisplayed()){
            fourthItem.click();
            System.out.println("fourth item selected");
        }
    }

    public void clcikOnWishListOption() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(500,0)");
        //waitForLoad();
        Thread.sleep(3000);
        wishList.click();
        Thread.sleep(3000);
    }

}
