package Tests;

import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import Share.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {
    @Test
    public void metodatest() {

        IndexPage indexPage=new IndexPage(driver);
        indexPage.clickskippSighnin();

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gotoFramePage();

        FramePage framePage=new FramePage(driver);
        framePage.singleFrame(propertyFile.getValue("singleFrameValue"));
        framePage.multipleFrame(propertyFile.getValue("multipleFrameValue"));
    }
}
