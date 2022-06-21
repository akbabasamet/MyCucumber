package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NinjaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Collections;
import java.util.List;

public class PhoneStepDefiniitions {
    NinjaPage ninjaPage = new NinjaPage();
    PhoneStepDefiniitions phoneStepDefiniitions = new PhoneStepDefiniitions();

    @Given("websayfasina gider")
    public void websayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ninjaUrl"));
    }

    @Given("click on Phones & PDAs")
    public void click_on_phones_pd_as() {
        ninjaPage.butonPhonesAndPDAs.click();
    }

    @Given("get the brandName of phones")
    public List<String> get_the_brand_name_of_phones() {
        List<WebElement> urunListe = ninjaPage.urunListe;
        List<String> listStr = ReusableMethods.getElementsText(urunListe);
        Collections.sort(listStr);
        return listStr;
    }

    @Given("click on add to button for all elements")
    public void click_on_add_to_button_for_all_elements() {
        for (WebElement w : ninjaPage.allElementsAdd
        ) {
            w.click();
            ReusableMethods.waitForClickablility(w, 1);
        }
        //ninjaPage.allElementsAdd.forEach(WebElement::click); lambdayla
    }

    @Then("click on black total added cart button")
    public void click_on_black_total_added_cart_button() {
        ninjaPage.totalCartButton.click();
    }

    @Then("get the names of list from the cart")
    public List<String> get_the_names_of_list_from_the_cart() {
        List<WebElement> liste2 = ninjaPage.cartList;
        List<String> addList = ReusableMethods.getElementsText(liste2);
        Collections.sort(addList);
        return addList;
    }

    @Then("compare the names from displaying list and cart list")
    public void compare_the_names_from_displaying_list_and_cart_list() {
        Assert.assertEquals(phoneStepDefiniitions.get_the_names_of_list_from_the_cart(),
                phoneStepDefiniitions.get_the_brand_name_of_phones() );
    }


}
