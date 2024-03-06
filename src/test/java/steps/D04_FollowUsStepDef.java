package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_HomePage;

import java.util.ArrayList;

import static base.TestBase.driver;

public class D04_FollowUsStepDef {
    ArrayList<String> tabs;
    P01_HomePage HomePage = new P01_HomePage(driver);

    @Given(": User Is in Home Page")
    public void userIsInHomePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        tabs = new ArrayList<>(driver.getWindowHandles());
    }

    @And(": User Clicks On Facebook Link")
    public void userClicksOnFacebookLink() {
        HomePage.ClickOnFacebookFollowUsLink();
        switchToNewTab();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then(": User is redirected to Facebook TAP")
    public void userIsRedirectedToFacebookTAP() {
        // Your verification logic for the Facebook page
        closeCurrentTab();
    }

    @And(": User Clicks On X Link")
    public void userClicksOnXLink() {
        HomePage.ClickOnXFollowUsLink();
        switchToNewTab();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then(": User is redirected to X TAP")
    public void userIsRedirectedToXTAP() {
        // Your verification logic for the X page
        closeCurrentTab();
    }

    @And(": User Clicks On Youtube Link")
    public void userClicksOnYoutubeLink() {
        HomePage.ClickOnYoutubeFollowUsLink();
        switchToNewTab();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then(": User is redirected to Youtube TAP")
    public void userIsRedirectedToYoutubeTAP() {
        // Your verification logic for the Youtube page
        closeCurrentTab();
    }

    private void switchToNewTab() {
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    private void closeCurrentTab() {
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
}
