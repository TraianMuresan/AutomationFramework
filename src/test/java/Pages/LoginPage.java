package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    public WebElement emailelement;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordelement;
    @FindBy(id ="enterbtn")
    public WebElement loginelement;
    @FindBy(id ="errormsg")
    public WebElement errorelement;


    public void loginInvalid(String email, String password, String error){
        emailelement.sendKeys(email);
        passwordelement.sendKeys(password);
        loginelement.click();
        elementMetods.validateElementText(errorelement, error);
    }
}
