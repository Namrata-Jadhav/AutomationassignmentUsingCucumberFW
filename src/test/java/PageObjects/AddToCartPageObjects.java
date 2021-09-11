package PageObjects;

import Utils.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPageObjects {
    TestContext testContext;

    public AddToCartPageObjects(TestContext testContext){
        this.testContext= testContext;
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


    public void ClickToChangeColour(){ testContext.getDriver().findElement(ChangeColour).click();}
    public void ValidateImageIsDisplayed(){testContext.getDriver().findElement(Blueimg).isDisplayed();}
    public void ValidateAmount(){testContext.getDriver().findElement(Fetchamount).isDisplayed();}
    public void ClickToIncreaseQuantity(){testContext.getDriver().findElement(quantity).click();}
    public void ClickToSelectSize(){
        Select size = new Select(testContext.getDriver().findElement(Size));
        size.selectByVisibleText("L");}
    public void ClickToAddToCart(){ testContext.getDriver().findElement(addToCart).click();}
    public void ValidateProduct(){  testContext.getDriver().findElement(product).isDisplayed();}
    public void ValidateProductQuantity(){  testContext.getDriver().findElement(productQuantity).isDisplayed();}
    public void ValidatePrice(){  testContext.getDriver().findElement(price).isDisplayed();}
    public void ClickToProceedButton(){ testContext.getDriver().findElement(ProceedButton).click();}
    public void ValidateImage(){testContext.getDriver().findElement(img).isDisplayed();}
    public void ValidateAvailability(){testContext.getDriver().findElement(availability).isDisplayed();}
    public void ValidateProductPrice(){testContext.getDriver().findElement(productPrice).isDisplayed();}
     public void ValidateProductCount(){   testContext.getDriver().findElement(productCount).isDisplayed();}
    public void ValidateTotalPrice(){testContext.getDriver().findElement(TotalPrice).isDisplayed();}
     public void ValidateShipping(){  testContext.getDriver().findElement(shipping).isDisplayed();}
      public void ValidateTotalBill(){  testContext.getDriver().findElement(TotalBill).isDisplayed();}
    public void ClickToProceedToCheckout(){testContext.getDriver().findElement( proceedCheckout).click();}
    public void ClickOnProceedAddress(){ testContext.getDriver().findElement(proceedAddress).click();}
      public void ClickToAgreeTermsAndConditions(){ testContext.getDriver().findElement(TermsAndCondition).click();}
      public void ClickToOrder(){ testContext.getDriver().findElement(ProcessCarrier).click();}
    public void ClickOnPaymentOption(){testContext.getDriver().findElement(PaymentOption).click();}
    public void ClickOnCompleteProcessButton(){ testContext.getDriver().findElement(CompleteAction).click();}
    public void DisplayOrderCompleteMsg(){testContext.getDriver().findElement(SuccessMsg).isDisplayed();}

}
