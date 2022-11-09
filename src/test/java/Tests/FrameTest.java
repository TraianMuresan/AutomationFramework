package Tests;

import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import Share.ShareData;
import org.testng.annotations.Test;

public class FrameTest extends ShareData {
    @Test
    public void metodatest() {

        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickskippSighnin();

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gotoFramePage();

        FramePage framePage=new FramePage(driver);
        framePage.singleFrame("Scrie Ceva");
        framePage.multipleFrame("Scrie Altceva");
    }

}
