package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailelement;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordelement;
    @FindBy(id ="enterbtn")
    private WebElement loginelement;
    @FindBy(id ="errormsg")
    private WebElement errorelement;


    public void loginInvalid(String email, String password, String error){
        emailelement.sendKeys(email);
        passwordelement.sendKeys(password);
        loginelement.click();
        elementMetods.validateElementText(errorelement, error);
    }
}
