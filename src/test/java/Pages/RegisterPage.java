package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[text()='SwitchTo']")
    private WebElement switchto;
    @FindBy (xpath = "//a[text()='Alerts']")
    private WebElement alerts;
    @FindBy (xpath = "//a[text()='Frames']")
    private WebElement frames;
    @FindBy (css = "input[ng-model='FirstName']")
    private WebElement firstname;
    @FindBy (css = "input[ng-model='LastName']")
    private WebElement lastname;
    @FindBy (xpath = "//textarea[@ng-model='Adress']")
    private WebElement adress;
    @FindBy (css = "input[ng-model='EmailAdress']")
    private WebElement emailadress;
    @FindBy (css = "input[ng-model='Phone']")
    private WebElement phone;
    @FindBy (css = "input[value='Male']")
    private WebElement gender;
    @FindBy (id = "checkbox2")
    private WebElement hobbiesmovies;
    @FindBy (id = "checkbox3")
    private WebElement hobbieshockey;
    @FindBy (id = "firstpassword")
    private WebElement password1;
    @FindBy (id = "secondpassword")
    private WebElement password2;
    @FindBy (id = "Skills")
    private WebElement skills;
    @FindBy (id = "yearbox")
    private WebElement anul;
    @FindBy (css = "div [placeholder='Month']")
    private WebElement luna;
    @FindBy (id = "daybox")
    private WebElement ziua;
    @FindBy (id = "msdd")
    private WebElement limba;
    @FindBy (className = "ui-corner-all")
    private List<WebElement> limbaobtiuni;
    @FindBy (className = "select2-selection--single")
    private WebElement tara;
    @FindBy (className = "select2-search__field")
    private WebElement tarainput;

    public void gotoAlertPage(){
        elementMetods.moveelement(switchto);
        elementMetods.clickelement(alerts);

        pageMetods.navigateUrl("https://demo.automationtesting.in/Alerts.html");
    }
    public void gotoFramePage(){
        elementMetods.moveelement(switchto);
        elementMetods.clickelement(alerts);

        pageMetods.navigateUrl("https://demo.automationtesting.in/Frames.html");
    }
    public void gotoWindowPage(){
        elementMetods.moveelement(switchto);
        elementMetods.clickelement(alerts);

        pageMetods.navigateUrl("https://demo.automationtesting.in/Windows.html");
    }
    public void registerProsses(HashMap<String, String> testData){

        firstname.sendKeys(testData.get("firstnamevalue"));
        lastname.sendKeys(testData.get("lastnamevalue"));
        adress.sendKeys(testData.get("adressvalue"));
        emailadress.sendKeys(testData.get("emailadressvalue"));
        phone.sendKeys(testData.get("phonevalue"));
        gender.click();
        hobbiesmovies.click();
        hobbieshockey.click();
        password1.sendKeys(testData.get("passwordvalue"));
        password2.sendKeys(testData.get("passwordvalue"));

        elementMetods.dorpdownElement(skills, testData.get("skillsValue"));
        elementMetods.dorpdownElement(anul, testData.get("yearValue"));
        elementMetods.dorpdownElement(luna, testData.get("monthValue"));
        elementMetods.dorpdownElement(ziua, testData.get("dayValue"));

        limba.click();
        choseLanguge(testData.get("limbaValue1"), testData.get("limbaValue2"));
        gender.click();
        tara.click();
        tarainput.sendKeys(testData.get("taraValue"));
        tarainput.sendKeys(Keys.ENTER);
    }

    public void choseLanguge(String limbaValue1, String limbaValue2){
        for (Integer index=0; index<limbaobtiuni.size();index++){
            if (limbaobtiuni.get(index).getText().equals(limbaValue1) ||
                    limbaobtiuni.get(index).getText().equals(limbaValue2)){
                limbaobtiuni.get(index).click();
            }
        }
    }
}
