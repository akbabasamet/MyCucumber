package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

import javax.swing.*;

public class AutomationStepDefintions {

    AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPage.singInButton.click();
    }

    @Given("user Create and account bölümüne email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationPage.createAccountButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        action.click(automationPage.gender).sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
                sendKeys("10").sendKeys(Keys.TAB).sendKeys("January").sendKeys(Keys.TAB).sendKeys("2000").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.company().name()).sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.address().city()).sendKeys(Keys.TAB)
                .sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("00000")
                .sendKeys(Keys.TAB).sendKeys("United States").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("0000000000").sendKeys(Keys.TAB).
                sendKeys("0000000000").sendKeys(Keys.TAB)
                .sendKeys("ALSK").perform();
    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        automationPage.registerButton.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }
}
