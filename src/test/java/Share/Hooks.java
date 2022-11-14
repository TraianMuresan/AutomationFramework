package Share;

import InputFile.PropertyFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends ShareData{

    public PropertyFile propertyFile;

    @BeforeMethod
    public void prepareInvirement(){
        preparedriver();
        propertyFile=new PropertyFile();
    }

    @AfterMethod
    public void clearInvirement(){
        cleardriver();
    }

}
