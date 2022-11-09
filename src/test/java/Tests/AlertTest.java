package Tests;

import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import Share.ShareData;
import org.testng.annotations.Test;

public class AlertTest extends ShareData {

    @Test
    public void metodatest() {

        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickskippSighnin();

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gotoAlertPage();

        AlertPage alertPage=new AlertPage(driver);
        alertPage.acceptAlertProcess();
        alertPage.dismissAlertProcess();
        alertPage.fillAlertProcess("Era Ceva");
    }
}