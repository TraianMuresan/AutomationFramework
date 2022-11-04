package HelpMetods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMetods {
    public WebDriver driver;

    public AlertMetods(WebDriver driver) {
        this.driver = driver;

    }
    public void acceptAlert(){
        Alert firstAlert=driver.switchTo().alert();
        firstAlert.accept();
    }
    public void dismissAlert(){
        Alert firstAlert=driver.switchTo().alert();
        firstAlert.dismiss();
    }
    public void fillAlert(String value){
        Alert firstAlert=driver.switchTo().alert();
        firstAlert.sendKeys(value);
        firstAlert.accept();
    }

}
