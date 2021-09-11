package PageObjects;

import Utils.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SignInPageObjects {
    //step 1: declare a driver
    TestContext testContext;
    //step 2: parameterised constructor
    public SignInPageObjects(TestContext testContext){
        this.testContext=testContext;
    }

    //step 3: locators definition
    By signInbutton = By.linkText("Sign in");

    By email_id = By.id("email_create");
    By create_account = By.xpath("//button[@id='SubmitCreate']");

    By title = By.id("id_gender2");
    By First_name = By.id("customer_firstname");
    By Last_name = By.id("customer_lastname");
    By Password = By.id("passwd");
    By day = By.xpath("//select[@id='days']");
    By month = By.xpath("//select[@id='months']");
    By year = By.xpath("//select[@id='years']");
    By companyName = By.id("company");
    By addressLine1 = By.id("address1");
    By addressLine2 = By.id("address2");
    By city = By.id("city");
    By state = By.xpath("//select[@id='id_state']");
    By zipCode=By.id("postcode");
    By country = By.xpath("//select[@id='id_country']");
    By PhoneNumber = By.id("phone_mobile");
    By SubmitAccountButton = By.xpath("//button[@id='submitAccount']");


    //step 4: Methods to perform operations
    public void Click_on_Sign_In_link(){testContext.getDriver().findElement(signInbutton).click();
    }
    public void enterEmail_create_account(String arg){
        testContext.getDriver().findElement(email_id).sendKeys(arg);
    }
    public void Click_on_Create_account_button(){
        testContext.getDriver().findElement(create_account).click();
    }

    public void select_title(){
        testContext.getDriver().findElement(title).click();
    }
    public void enter_First_name(String arg){
        testContext.getDriver().findElement(First_name).sendKeys(arg);
    }
    public void enter_lat_name(String arg){
        testContext.getDriver().findElement(Last_name).sendKeys(arg);
    }
    public void enter_password(String arg){
        testContext.getDriver().findElement(Password).sendKeys(arg);
    }
    public void SelectDateOfBirth(){
        Select days = new Select(testContext.getDriver().findElement(day));
        days.selectByValue("19");
        Select Month = new Select(testContext.getDriver().findElement(month));
        Month.selectByIndex(5);
        Select Year = new Select(testContext.getDriver().findElement(year));
        Year.selectByValue("1994");
    }
    public void EnterCompanyName(String arg){
        testContext.getDriver().findElement((companyName)).sendKeys(arg);
    }
    public void EnterAddress1(String arg){
        testContext.getDriver().findElement(addressLine1).sendKeys(arg);
    }
    public void EnterAddress2(String arg){
        testContext.getDriver().findElement(addressLine2).sendKeys(arg);
    }
    public void EnterCity(String arg){
        testContext.getDriver().findElement(city).sendKeys(arg);
    }
    public void SelectState(){
        WebElement dropdownState = testContext.getDriver().findElement(state);
        Select selectState = new Select(dropdownState);
        selectState.selectByVisibleText("California");
    }
    public void EnterZipCode(String arg){
        testContext.getDriver().findElement(zipCode).sendKeys(arg);
    }
    public void SelectCountry(){
        WebElement dropdownCountry =testContext.getDriver().findElement(country);
        Select selectCountry = new Select(dropdownCountry);
        selectCountry.selectByVisibleText("United States");
    }
    public void EnterPhoneNumber(String arg){
        testContext.getDriver().findElement(PhoneNumber).sendKeys(arg);
    }
    public void ClickSubmitAccount(){
        testContext.getDriver().findElement(SubmitAccountButton).click();
    }
    public void ValidateTitle(String expected){
        Assert.assertEquals(expected, testContext.getDriver().getTitle());
    }
}

