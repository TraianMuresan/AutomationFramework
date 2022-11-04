package HelpMetods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMetods {
    public WebDriver driver;

    public FrameMetods(WebDriver driver) {
        this.driver = driver;
    }
    public void switchFrame(String value){
        driver.switchTo().frame(value);
    }
    public void switchFrame(WebElement value){
        driver.switchTo().frame(value);
    }
    public void switchDefault(){
        driver.switchTo().defaultContent();
    }
}
