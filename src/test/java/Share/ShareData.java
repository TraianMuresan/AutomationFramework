package Share;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ShareData {
    public WebDriver driver;

    @BeforeMethod
    public void preparedriver(){
        //Setam driverul de Crome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleardriver(){
        driver.quit();
    }
}
