package Tests;

import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import Share.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {

    @Test
    public void metodatest() {

        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickskippSighnin();

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gotoAlertPage();

        AlertPage alertPage=new AlertPage(driver);
        alertPage.acceptAlertProcess();
        alertPage.dismissAlertProcess();
        alertPage.fillAlertProcess(propertyFile.getValue("alertValue"));
    }
}