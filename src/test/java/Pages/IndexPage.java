package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage{

    @FindBy (id = "btn1")
    public WebElement sighinellement;

    @FindBy (id="btn2")
    public WebElement skipsighnin;

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickSighnin(){
        elementMetods.clickelement(sighinellement);
    }

    public void clickskippSighnin(){
        elementMetods.clickelement(skipsighnin);
    }
}
