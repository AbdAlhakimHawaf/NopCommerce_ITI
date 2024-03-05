package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_SearchPage extends P00_BasePage{
    public P04_SearchPage(WebDriver Driver) {
        super(Driver);
    }
   /* String FirstItemName = driver.findElement(By.xpath("//div[@class='details']//a[@href='/asus-n551jk-xo076h-laptop']")).getText();

    public String getFirstItemName() {
        return FirstItemName;
    }*/

    By AddFirstItemToCart = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
    public void ClickOnAddFirstItemToCart(){
        ClickOnElement(AddFirstItemToCart);
    }
    By ShoppingCartLinkInMessage = By.xpath("//p[@class='content']//a[@href='/cart'][1]");
    public void ClickOnShoppingCartLinkInMessage(){
        ClickOnElement(ShoppingCartLinkInMessage);
    }


}
