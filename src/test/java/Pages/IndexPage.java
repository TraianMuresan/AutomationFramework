package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{

    @FindBy (id = "btn1")
    private WebElement sighinellement;

    @FindBy (id="btn2")
    private WebElement skipsighnin;

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
