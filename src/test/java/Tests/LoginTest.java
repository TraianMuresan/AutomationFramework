package Tests;

import Pages.IndexPage;
import Pages.LoginPage;
import Share.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ShareData {

    @Test
    public void metodatest(){
        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickSighnin();

        String emailvalue="mama@aaa.com";
        String passwordvalue="Abcd1234";
        String expectederror="Invalid User Name or PassWord";

        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginInvalid(emailvalue, passwordvalue, expectederror);
    }
}
