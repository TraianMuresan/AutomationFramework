package HelpMetods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMetods {
    public WebDriver driver;

    public ElementMetods(WebDriver driver) {
        this.driver = driver;
    }

    public void waitvisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickelement(WebElement element){
        waitvisible(element);
        element.click();
    }

    public void moveelement(WebElement element){
        waitvisible(element);
        Actions action=new Actions(driver);
        action.moveToElement(element).perform();

    }
    public void validateElementText(WebElement element, String value){
        waitvisible(element);
        String actuelerror=element.getText();
        Assert.assertEquals(actuelerror,value);
    }

    public void dorpdownElement(WebElement element, String value){
        Select skillselect=new Select(element);
        skillselect.selectByVisibleText(value);
    }
}
