package Tests;

import HelpMetods.AlertMetods;
import HelpMetods.ElementMetods;
import HelpMetods.PageMetods;
import HelpMetods.WindowMetods;
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

        ElementMetods elementMetods=new ElementMetods(driver);
        PageMetods pageMetods=new PageMetods(driver);
        AlertMetods alertMetods=new AlertMetods(driver);

        WebElement skipsighnin = driver.findElement(By.id("btn2"));
        elementMetods.clickelement(skipsighnin);


        WebElement switchto=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMetods.moveelement(switchto);
        //Actions action=new Actions(driver);
        //action.moveToElement(switchto).perform();
        WebElement alerts=driver.findElement(By.xpath("//a[text()='Alerts']"));
        elementMetods.clickelement(alerts);
        //alerts.click();

        pageMetods.navigateUrl("https://demo.automationtesting.in/Alerts.html");
        //driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertButtons = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        elementMetods.clickelement(alertButtons.get(0));
        //alertButtons.get(0).click();
        WebElement alertOk = driver.findElement(By.cssSelector("#OKTab>button"));
        elementMetods.clickelement(alertOk);
        //alertOk.click();
        alertMetods.acceptAlert();

        alertButtons.get(1).click();
        WebElement alertOkCancel = driver.findElement(By.cssSelector("#CancelTab>button"));
        alertOkCancel.click();
        alertMetods.dismissAlert();

        alertButtons.get(2).click();
        WebElement alertText = driver.findElement(By.cssSelector("#Textbox>button"));
        alertText.click();
        alertMetods.fillAlert("Traian");

    }
}