package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[text()='SwitchTo']")
    public WebElement switchto;

    @FindBy (xpath = "//a[text()='Alerts']")
    public WebElement alerts;

    @FindBy (xpath = "//a[text()='Frames']")
    public WebElement frames;

    public void gotoAlertPage(){
        elementMetods.moveelement(switchto);
        elementMetods.clickelement(alerts);

        pageMetods.navigateUrl("https://demo.automationtesting.in/Alerts.html");
    }
    public void gotoFramePage(){
        elementMetods.moveelement(switchto);
        elementMetods.clickelement(alerts);

        pageMetods.navigateUrl("https://demo.automationtesting.in/Frames.html");
    }
}
