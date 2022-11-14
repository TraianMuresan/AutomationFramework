package Share;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShareData {
    public WebDriver driver;

    public void preparedriver(){
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void cleardriver(){
        driver.quit();
    }
}
