package Tests;

import Share.ShareData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class AlertTest extends ShareData {

    @Test
    public void metodatest() {

        WebElement skipsighnin = driver.findElement(By.id("btn2"));
        skipsighnin.click();

        WebElement switchto=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action=new Actions(driver);
        action.moveToElement(switchto).perform();
        WebElement alerts=driver.findElement(By.xpath("//a[text()='Alerts']"));
        alerts.click();

        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertButtons = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        alertButtons.get(0).click();
        WebElement alertOk = driver.findElement(By.cssSelector("#OKTab>button"));
        alertOk.click();
        Alert firstAlert=driver.switchTo().alert();
        firstAlert.accept();

        alertButtons.get(1).click();
        WebElement alertOkCancel = driver.findElement(By.cssSelector("#CancelTab>button"));
        alertOkCancel.click();
        Alert secondAlert=driver.switchTo().alert();
        secondAlert.dismiss();

        alertButtons.get(2).click();
        WebElement alertText = driver.findElement(By.cssSelector("#Textbox>button"));
        alertText.click();
        Alert thirdAlert=driver.switchTo().alert();
        thirdAlert.sendKeys("Traian M");
        thirdAlert.accept();


    }
}