package Share;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class ShareData {
    public WebDriver driver;

    @BeforeMethod
    public void preparedriver(){
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod
    public void cleardriver(){
        driver.quit();
    }
}
