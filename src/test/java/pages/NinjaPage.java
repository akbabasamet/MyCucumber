package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NinjaPage {
    public NinjaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement butonPhonesAndPDAs;

    @FindBy(xpath = "//h4")
    public List<WebElement> urunListe;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public List<WebElement> allElementsAdd;

    @FindBy(xpath = "//*[text()=' 3 item(s) - $583.19']")
    public WebElement totalCartButton;

    @FindBy(xpath = "//tbody//tr//td[2]//a")
    public List<WebElement> cartList;

}
