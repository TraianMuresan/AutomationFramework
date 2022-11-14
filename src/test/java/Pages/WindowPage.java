package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".nav-stacked>li>a")
    private List<WebElement> windowsButtons;

    @FindBy (css = "#Tabbed button")
    private WebElement tabclick;

    @FindBy (css = "#Seperate button")
    private WebElement windowclick;

    @FindBy (css = "#Multiple button")
    private WebElement tabsclick;

    public void tabProsses (){
        elementMetods.clickelement(windowsButtons.get(0));

        elementMetods.clickelement(tabclick);

        windowMetods.gotoSpecificWindow(1);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(0);
    }

    public void windowProsses (){
        windowsButtons.get(1).click();

        windowclick.click();

        windowMetods.gotoSpecificWindow(1);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(0);
    }

    public void tabsProcces (){
        windowsButtons.get(2).click();

        elementMetods.clickelement(tabsclick);

        windowMetods.gotoSpecificWindow(2);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(1);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(0);

    }
}
