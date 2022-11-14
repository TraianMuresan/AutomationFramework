package Tests;

import Pages.IndexPage;
import Pages.LoginPage;
import Share.Hooks;
import org.testng.annotations.Test;

public class LoginTest extends Hooks {

    @Test
    public void metodatest(){

        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickSighnin();

        String emailvalue= propertyFile.getValue("email");
        String passwordvalue= propertyFile.getValue("password");
        String expectederror= propertyFile.getValue("errormesage");

        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginInvalid(emailvalue, passwordvalue, expectederror);
    }
}
