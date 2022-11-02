package HelpMetods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class WindowMetods {
    public WebDriver driver;

    public WindowMetods(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoSpecificWindow(Integer index){
        ArrayList<String> tablist=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tablist.get(index));
        System.out.println (driver.getTitle());
    }

    public void closWindow(){
        driver.close();
    }
}
