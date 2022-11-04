package Tests;

import HelpMetods.AlertMetods;
import HelpMetods.ElementMetods;
import HelpMetods.FrameMetods;
import HelpMetods.PageMetods;
import Share.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FrameTest extends ShareData {
    @Test
    public void metodatest() {

        ElementMetods elementMetods = new ElementMetods(driver);
        PageMetods pageMetods = new PageMetods(driver);
        FrameMetods frameMetods = new FrameMetods(driver);

        WebElement skipsighnin = driver.findElement(By.id("btn2"));
        elementMetods.clickelement(skipsighnin);


        WebElement switchto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMetods.moveelement(switchto);
        WebElement frames = driver.findElement(By.xpath("//a[text()='Frames']"));
        elementMetods.clickelement(frames);

        pageMetods.navigateUrl("https://demo.automationtesting.in/Frames.html");
        List<WebElement> frameOptions=driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        frameOptions.get(0).click();
        frameMetods.switchFrame("singleframe");
        WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Scrie Ceva");
        frameMetods.switchDefault();

        frameOptions.get(1).click();

        frameMetods.switchFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));

        frameMetods.switchFrame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement input2=driver.findElement(By.cssSelector("input[type='text']"));
        input2.sendKeys("Scrie AltCeva");


    }

    }
