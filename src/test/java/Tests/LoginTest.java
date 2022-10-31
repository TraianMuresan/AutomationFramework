package Tests;

import Share.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ShareData {

    @Test
    public void metodatest(){

        WebElement sighinellement=driver.findElement(By.id("btn1"));
        sighinellement.click();

        WebElement emailelement=driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailvalue="mama@aaa.com";
        emailelement.sendKeys(emailvalue);

        WebElement passwordelement=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String passwordvalue="Abcd1234";
        passwordelement.sendKeys(passwordvalue);

        WebElement loginelement=driver.findElement(By.id("enterbtn"));
        loginelement.click();

        //Validam mesaj eroare
        WebElement errorelement=driver.findElement(By.id("errormsg"));
        String expectederror="Invalid User Name or PassWord";
        String actuelerror=errorelement.getText();
        Assert.assertEquals(actuelerror,expectederror);

    }

}
