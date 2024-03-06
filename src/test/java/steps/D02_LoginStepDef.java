package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_HomePage;
import pages.P02_RegisterPage;
import pages.P03_LoginPage;

import static base.TestBase.driver;

public class D02_LoginStepDef {

    P01_HomePage Homepage = new P01_HomePage(driver);
    P03_LoginPage LoginPage = new P03_LoginPage(driver);


    @Given(": Redirected to Home Page then to Login Page")
    public void redirectedToHomePageThenToLoginPage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        Homepage.ClickOnLoginPageLink();
    }

    @When(": User Fill Registered Email Field")
    public void userFillRegisteredEmailField() {
        LoginPage.SetEmailField("M.AhmedDDDDDAA@gmail.com");
    }

    @And(": User Fill Registered Password")
    public void userFillRegisteredPassword() {
        LoginPage.SetPasswordField("M.ahmed@123");
    }

    @And(": Click On Remember me Check Box")
    public void clickOnRememberMeCheckBox() {
        LoginPage.ClickOnRememberMeCheckBox();
    }

    @And(": Click On Login Button")
    public void clickOnLoginButton() {
        LoginPage.ClickOnLoginButton();
    }

    @Then(": Login Successfully")
    public void loginSuccessfully() {
       Assert.assertEquals(driver.findElement(By.xpath("//div[@class='topic-block-title']//h2")).getText(),"Welcome to our store");
    }
}
