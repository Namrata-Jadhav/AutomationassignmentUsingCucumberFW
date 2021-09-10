package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SignInPageObjects {
    //step 1: declare a driver
    WebDriver driver;

    //step 2: parameterised constructor
    public SignInPageObjects(WebDriver driver){
        this.driver=driver;
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
    public void Click_on_Sign_In_link(){
        driver.findElement(signInbutton).click();
    }
    public void enterEmail_create_account(String arg){
        driver.findElement(email_id).sendKeys(arg);
    }
    public void Click_on_Create_account_button(){
        driver.findElement(create_account).click();
    }

    public void select_title(){
        driver.findElement(title).click();
    }
    public void enter_First_name(String arg){
        driver.findElement(First_name).sendKeys(arg);
    }
    public void enter_lat_name(String arg){
        driver.findElement(Last_name).sendKeys(arg);
    }
    public void enter_password(String arg){
        driver.findElement(Password).sendKeys(arg);
    }
    public void SelectDateOfBirth(){
        Select days = new Select(driver.findElement(day));
        days.selectByValue("19");
        Select Month = new Select(driver.findElement(month));
        Month.selectByIndex(5);
        Select Year = new Select(driver.findElement(year));
        Year.selectByValue("1994");
    }
    public void EnterCompanyName(String arg){
        driver.findElement((companyName)).sendKeys(arg);
    }
    public void EnterAddress1(String arg){
        driver.findElement(addressLine1).sendKeys(arg);
    }
    public void EnterAddress2(String arg){
        driver.findElement(addressLine2).sendKeys(arg);
    }
    public void EnterCity(String arg){
        driver.findElement(city).sendKeys(arg);
    }
    public void SelectState(){
        WebElement dropdownState = driver.findElement(state);
        Select selectState = new Select(dropdownState);
        selectState.selectByVisibleText("California");
    }
    public void EnterZipCode(String arg){
        driver.findElement(zipCode).sendKeys(arg);
    }
    public void SelectCountry(){
        WebElement dropdownCountry = driver.findElement(country);
        Select selectCountry = new Select(dropdownCountry);
        selectCountry.selectByVisibleText("United States");
    }
    public void EnterPhoneNumber(String arg){
        driver.findElement(PhoneNumber).sendKeys(arg);
    }
    public void ClickSubmitAccount(){
        driver.findElement(SubmitAccountButton).click();
    }
    public void ValidateTitle(String expected){
        Assert.assertEquals(expected, driver.getTitle());
    }
}

