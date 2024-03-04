package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_HomePage;

import static base.TestBase.driver;

public class D01_RegisterStepsDef {
    P01_HomePage HomePage = new P01_HomePage(driver);

    @Given(": User Change Currency & navigate to register page")
    public void userChangeCurrencyNavigateToRegisterPage() {
        HomePage.SelectEuroCurrency();
        HomePage.ClickOnRegisterPageLink();


    }

    @When(":Selecting Gender")
    public void selectingGender() {
    }

    @And(":Filling First name")
    public void fillingFirstName() {
    }

    @And(":Filling Last Name")
    public void fillingLastName() {
    }

    @And(":Selecting Date of birth d-m-y")
    public void selectingDateOfBirthDMY() {
    }

    @And(":Filling Email")
    public void fillingEmail() {
    }

    @And(":Filling Company name")
    public void fillingCompanyName() {
    }

    @And(":Selecting Newsletter")
    public void selectingNewsletter() {
    }

    @And(": Filling Password")
    public void fillingPassword() {
    }

    @And(":Filling Confirm Password the same to Password Field")
    public void fillingConfirmPasswordTheSameToPasswordField() {
    }

    @And(":Clicking on Register Button")
    public void clickingOnRegisterButton() {
    }

    @Then(":Success Message of Registration will appear")
    public void successMessageOfRegistrationWillAppear() {
    }



}
