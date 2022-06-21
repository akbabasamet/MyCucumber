package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutomotionExerciseDefinitions {
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

    @Given("Navigate to url of automationexercise")
    public void navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        automationExercisePage.anasayfa.isEnabled();
    }

    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        automationExercisePage.signinButton.click();

    }

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        automationExercisePage.logInDisabled.isDisplayed();
    }

    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        automationExercisePage.emailLogIn.sendKeys(ConfigReader.getProperty("autoEmail"));
        automationExercisePage.passwordLogIn.sendKeys(ConfigReader.getProperty("autoPassword"));

    }

    @Then("Click login button")
    public void click_login_button() {
        automationExercisePage.logInButton.click();

    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        automationExercisePage.loggedInAs.isDisplayed();

    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        automationExercisePage.deleteButton.click();

    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() throws IOException {
        automationExercisePage.deleteButton2.isDisplayed();

        ReusableMethods.getScreenshotElement("exercise",automationExercisePage.deleteButton2);

    }

}
