package HelpMetods;

import org.openqa.selenium.WebDriver;

public class PageMetods {
    public WebDriver driver;

    public PageMetods(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateUrl(String value){
        driver.navigate().to(value);
    }

}
