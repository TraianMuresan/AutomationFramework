package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import Share.Hooks;
import Share.ShareData;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {
    @Test
    public void metodatest(){

        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickskippSighnin();

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gotoWindowPage();

        WindowPage windowPage=new WindowPage(driver);
        windowPage.tabProsses();
        windowPage.windowProsses();
        windowPage.tabsProcces();
    }

}
