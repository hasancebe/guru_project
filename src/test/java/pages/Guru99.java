package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99 {

    public Guru99() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name=\"uid\"]")
    public WebElement user_Id;

    @FindBy (css = "input[name=\"password\"]")
    public WebElement password;

    @FindBy (css = "input[name=\"btnLogin\"]")
    public  WebElement loginButton;

    @FindBy(css = "input[name=\"btnReset\"]")
    public WebElement resetButton;

}