package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuAppPage {
    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addButonu;

    @FindBy(xpath = "//*[@class='added-manually']")
    public WebElement deleteButonu;


    @FindBy(xpath = "//button[@class='added-manually']")
    public List<WebElement> deleteListesi;
}
