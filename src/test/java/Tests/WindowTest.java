package Tests;

import HelpMetods.ElementMetods;
import HelpMetods.PageMetods;
import HelpMetods.WindowMetods;
import Share.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {
    @Test
    public void metodatest(){

        ElementMetods elementMetods=new ElementMetods(driver);
        PageMetods pageMetods=new PageMetods(driver);
        WindowMetods windowMetods=new WindowMetods(driver);


        WebElement skipsighnin = driver.findElement(By.id("btn2"));
        elementMetods.clickelement(skipsighnin);

        WebElement switchto=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMetods.moveelement(switchto);
        WebElement windows=driver.findElement(By.xpath("//a[text()='Windows']"));
        elementMetods.clickelement(windows);

        pageMetods.navigateUrl("https://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsButtons = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        elementMetods.clickelement(windowsButtons.get(0));

        WebElement tabclick=driver.findElement(By.cssSelector("#Tabbed button"));
        elementMetods.clickelement(tabclick);

        windowMetods.gotoSpecificWindow(1);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(0);
        windowsButtons.get(1).click();

        WebElement windowclick=driver.findElement(By.cssSelector("#Seperate button"));
        windowclick.click();

        windowMetods.gotoSpecificWindow(1);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(0);
        windowsButtons.get(2).click();

        WebElement tabsclick=driver.findElement(By.cssSelector("#Multiple button"));
        tabsclick.click();

        windowMetods.gotoSpecificWindow(2);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(1);
        windowMetods.closWindow();
        windowMetods.gotoSpecificWindow(0);

    }
}
