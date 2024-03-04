package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_HomePage extends P00_BasePage {

    public P01_HomePage(WebDriver Driver) {
        super(Driver);
    }

    By RegisterPageLink = By.xpath("//a[@href='/register?returnUrl=%2F']");
    public void ClickOnRegisterPageLink(){
        ClickOnElement(RegisterPageLink);
    }

    By CurrencyList = By.id("customerCurrency");
    public void SelectEuroCurrency(){
        Select SelectEuro = new Select(driver.findElement(CurrencyList));
        SelectEuro.selectByVisibleText("Euro");
    }
    public void SelectUSDollarCurrency(){
        Select SelectEuro = new Select(driver.findElement(CurrencyList));
        SelectEuro.selectByVisibleText("US Dollar");
    }

    By LoginPageLink = By.xpath("//a[@class='ico-login']");
    public void ClickOnLoginPageLink(){
        ClickOnElement(LoginPageLink);
    }
    By WishListPageLink = By.xpath("//a[@class='ico-wishlist']");
    public void ClickOnWishListPageLink(){
        ClickOnElement(WishListPageLink);
    }
    By ShoppingCartPageLink = By.xpath("//a[@class='ico-cart']");
    public void ClickOnShoppingCartPageLink(){
        ClickOnElement(ShoppingCartPageLink);
    }
    By SearchField = By.id("small-searchterms");
    public void SetSearchField(String Text){
        SetElementText(SearchField,Text);
    }
    By SearchButton = By.xpath("//button[@class='button-1 search-box-button']");
    public void ClickOnSearchButton(){
        ClickOnElement(SearchButton);
    }

}