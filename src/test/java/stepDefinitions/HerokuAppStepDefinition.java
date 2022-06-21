package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuAppPage;
import utilities.ReusableMethods;

public class HerokuAppStepDefinition {

    HerokuAppPage herokuAppPage = new HerokuAppPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuAppPage.addButonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuAppPage.deleteButonu, 3);
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuAppPage.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuAppPage.deleteButonu.click();
    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue(herokuAppPage.deleteListesi.isEmpty());
    }

}

