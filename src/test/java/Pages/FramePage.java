package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".nav-tabs>li>a")
    public List<WebElement> frameOptions;

    @FindBy (css = "input[type='text']")
    public WebElement input;

    public void singleFrame(String value){
        frameOptions.get(0).click();
        frameMetods.switchFrame("singleframe");
        input.sendKeys(value);
        frameMetods.switchDefault();
    }

    public void multipleFrame (String value){
        frameOptions.get(1).click();
        frameMetods.switchFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMetods.switchFrame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        input.sendKeys(value);

    }
}
