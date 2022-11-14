package Pages;

import HelpMetods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElementMetods elementMetods;
    public PageMetods pageMetods;
    public AlertMetods alertMetods;
    public FrameMetods frameMetods;
    public WindowMetods windowMetods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementMetods=new ElementMetods(driver);
        pageMetods=new PageMetods(driver);
        alertMetods=new AlertMetods(driver);
        frameMetods=new FrameMetods(driver);
        windowMetods=new WindowMetods(driver);
    }
}
