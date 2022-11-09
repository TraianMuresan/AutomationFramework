package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".nav-stacked>li>a")
    public List<WebElement> alertButtons;

    @FindBy (css = "#OKTab>button")
    public WebElement alertOk;

    @FindBy (css = "#CancelTab>button")
    public WebElement alertOkCancel;

    @FindBy (css = "#Textbox>button")
    public WebElement alertText;

    public void acceptAlertProcess(){
        elementMetods.clickelement(alertButtons.get(0));
        elementMetods.clickelement(alertOk);
        alertMetods.acceptAlert();
    }

    public void dismissAlertProcess(){
        alertButtons.get(1).click();
        alertOkCancel.click();
        alertMetods.dismissAlert();
    }

    public void fillAlertProcess(String value){
        alertButtons.get(2).click();
        alertText.click();
        alertMetods.fillAlert("Traian");
    }
}
