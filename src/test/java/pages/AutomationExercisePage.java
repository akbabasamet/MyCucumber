package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement anasayfa;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signinButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement logInDisabled;

    @FindBy(xpath = "(//*[@placeholder='Email Address'])[1]")
    public WebElement emailLogIn;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordLogIn;

    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement logInButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAs;

    @FindBy(xpath = "(//a[@style='color:brown;'])[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//*[text()='Delete Account'])[2]")
    public WebElement deleteButton2;
}
