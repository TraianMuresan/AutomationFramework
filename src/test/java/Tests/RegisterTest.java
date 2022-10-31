package Tests;

import Share.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTest extends ShareData {

    @Test
    public void metodatest() {
        WebElement skipsighnin=driver.findElement(By.id("btn2"));
        skipsighnin.click();

        WebElement firstname=driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
        String firstnamevalue="Traian";
        firstname.sendKeys(firstnamevalue);

        WebElement lastname=driver.findElement(By.cssSelector("input[ng-model='LastName']"));
        String lastnamevalue="Muresan";
        lastname.sendKeys(lastnamevalue);

        WebElement adress=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String adressvalue="Str. Caragiale, Nr. 2, Ap. 6";
        adress.sendKeys(adressvalue);

        WebElement emailadress=driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String emailadressvalue="baba@test.com";
        emailadress.sendKeys(emailadressvalue);

        WebElement phone=driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        String phonevalue="0742345876";
        phone.sendKeys(phonevalue);

        WebElement gender=driver.findElement(By.cssSelector("input[value='Male']"));
        gender.click();

        WebElement hobbiesmovies=driver.findElement(By.id("checkbox2"));
        hobbiesmovies.click();

        WebElement hobbieshockey=driver.findElement(By.id("checkbox3"));
        hobbieshockey.click();

        WebElement password1=driver.findElement(By.id("firstpassword"));
        String passwordvalue="test8844";
        password1.sendKeys(passwordvalue);

        WebElement password2=driver.findElement(By.id("secondpassword"));
        password2.sendKeys(passwordvalue);

        WebElement skills=driver.findElement(By.id("Skills"));
        Select skillselect=new Select(skills);
        skillselect.selectByVisibleText("Java");

        WebElement anul=driver.findElement(By.id("yearbox"));
        Select anulselect=new Select(anul);
        anulselect.selectByValue("1975");

        WebElement luna=driver.findElement(By.cssSelector("div [placeholder='Month']"));
        Select lunaselect=new Select(luna);
        lunaselect.selectByVisibleText("October");

        WebElement ziua=driver.findElement(By.id("daybox"));
        Select ziuaselect=new Select(ziua);
        ziuaselect.selectByValue("25");

        WebElement limba=driver.findElement(By.id("msdd"));
        limba.click();
        List<WebElement> limbaobtiuni=driver.findElements(By.className("ui-corner-all"));
        for (Integer index=0; index<limbaobtiuni.size();index++){
            if (limbaobtiuni.get(index).getText().equals("Dutch") || limbaobtiuni.get(index).getText().equals("English")){
                limbaobtiuni.get(index).click();
            }
        }

        gender.click();
        WebElement tara=driver.findElement(By.className("select2-selection--single"));
        tara.click();
        WebElement tarainput=driver.findElement(By.className("select2-search__field"));
        tarainput.sendKeys("Australia");
        tarainput.sendKeys(Keys.ENTER);

    }
}
