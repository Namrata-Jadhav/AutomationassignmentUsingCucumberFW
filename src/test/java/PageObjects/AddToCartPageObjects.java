package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPageObjects {

    WebDriver driver;

    public AddToCartPageObjects(WebDriver driver){
        this.driver= driver;
    }

    By ChangeColour= By.id("color_14");
    By Blueimg= By.xpath("//img[@id='bigpic']");
    By Fetchamount=By.xpath("//p[@class='our_price_display']");
    By quantity= By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
    By Size = By.id("group_1");
    By addToCart = By.xpath("//p[@id='add_to_cart']");
    By product = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    By productQuantity = By.xpath("//*[@id=\"layer_cart_product_quantity\"]");
    By price = By.xpath("//*[@id=\"layer_cart_product_price\"]");
    By ProceedButton= By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    By img = By.xpath("//img[@alt='Faded Short Sleeve T-shirts']");
    By availability = By.xpath("//*[@id=\"product_1_6_0_563385\"]/td[3]/span");
    By productPrice = By.id("product_price_1_6_563385");
    By productCount = By.xpath("//*[@id=\"product_1_6_0_563385\"]/td[5]/input[2]");
    By TotalPrice= By.id("total_product_price_1_6_563385");
    By shipping = By.xpath("//td[@id='total_shipping']");
    By TotalBill=By.xpath("//*[@id=\"total_price_container\"]");
    By proceedCheckout= By.xpath("//a[@class='button btn btn-default standard-checkout button-medium' and @title='Proceed to checkout']");
    By proceedAddress = By.xpath("//button[@name='processAddress' and @type='submit']");
    By TermsAndCondition =By.id("cgv");
    By ProcessCarrier=By.xpath("//button[@name='processCarrier']");
    By PaymentOption=By.xpath("//a[@class='bankwire' and @title='Pay by bank wire']");
    By CompleteAction=By.xpath("//button[@class='button btn btn-default button-medium']");
    By SuccessMsg=By.xpath("//strong[text()='Your order on My Store is complete.']");


    public void ClickToChangeColour(){ driver.findElement(ChangeColour).click();}
    public void ValidateImageIsDisplayed(){driver.findElement(Blueimg).isDisplayed();}
    public void ValidateAmount(){driver.findElement(Fetchamount).isDisplayed();}
    public void ClickToIncreaseQuantity(){ driver.findElement(quantity).click();}
    public void ClickToSelectSize(){
        Select size = new Select(driver.findElement(Size));
        size.selectByVisibleText("L");}
    public void ClickToAddToCart(){ driver.findElement(addToCart).click();}
    public void ValidateProduct(){  driver.findElement(product).isDisplayed();}
    public void ValidateProductQuantity(){  driver.findElement(productQuantity).isDisplayed();}
    public void ValidatePrice(){  driver.findElement(price).isDisplayed();}
    public void ClickToProceedButton(){ driver.findElement(ProceedButton).click();}
    public void ValidateImage(){driver.findElement(img).isDisplayed();}
    public void ValidateAvailability(){driver.findElement(availability).isDisplayed();}
    public void ValidateProductPrice(){driver.findElement(productPrice).isDisplayed();}
     public void ValidateProductCount(){   driver.findElement(productCount).isDisplayed();}
    public void ValidateTotalPrice(){driver.findElement(TotalPrice).isDisplayed();}
     public void ValidateShipping(){  driver.findElement(shipping).isDisplayed();}
      public void ValidateTotalBill(){  driver.findElement(TotalBill).isDisplayed();}
    public void ClickToProceedToCheckout(){ driver.findElement( proceedCheckout).click();}
    public void ClickOnProceedAddress(){ driver.findElement(proceedAddress).click();}
      public void ClickToAgreeTermsAndConditions(){ driver.findElement(TermsAndCondition).click();}
      public void ClickToOrder(){ driver.findElement(ProcessCarrier).click();}
    public void ClickOnPaymentOption(){driver.findElement(PaymentOption).click();}
    public void ClickOnCompleteProcessButton(){ driver.findElement(CompleteAction).click();}
    public void DisplayOrderCompleteMsg(){ driver.findElement(SuccessMsg).isDisplayed();}

}
