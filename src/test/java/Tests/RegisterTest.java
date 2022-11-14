package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Share.Hooks;
import org.testng.annotations.Test;

import java.util.HashMap;

public class RegisterTest extends Hooks {

    @Test
    public void metodatest() {

        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickskippSighnin();

        HashMap<String, String> testData=propertyFile.getKeysValues();
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.registerProsses(testData);
    }
}
