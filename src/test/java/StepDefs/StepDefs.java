package StepDefs;

import PageObjects.AddToCartPageObjects;
import PageObjects.ProductLinkPageObjects;
import PageObjects.SignInPageObjects;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Log4j2
public class StepDefs {

    WebDriver driver;
    String url = "http://automationpractice.com/";
    Scenario scenario;
    String Usercred;
    String email_address = "signup@example.com";
    String password = "26April@2015";

    @Given("user opened the browser")
    public void user_opened_the_browser() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        log.debug("browser is maximised");

        driver.manage().deleteAllCookies(); //delete all cookies
        log.debug("deleted cookies");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Given("user Navigated to the application url")
    public void user_navigated_to_the_application_url() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        log.debug("url navigated");
    }

    @When("user clicks the link sign in")
    public void user_clicks_the_link_sign_in() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // driver.findElement(By.linkText("Sign in")).click();
        SignInPageObjects PageObjects = new SignInPageObjects(driver);
        PageObjects.Click_on_Sign_In_link();
        log.debug("clicked on sign in link");
    }

    @When("user enters email id as {string} and clicks on Create an account button to fill up the form")
    public void user_enters_and_clicks_on_create_an_account_button_to_fill_up_the_form(String email_id) {
        SignInPageObjects PageObjects = new SignInPageObjects(driver);
        PageObjects.enterEmail_create_account(email_id);
        PageObjects.Click_on_Create_account_button();
        log.debug("email id is entered: " + email_id);
    }

    @When("user enters the personal information as follows and clicks on Register button:")
    public void user_enters_the_personal_information_as_follows(Map<String, String> user_info) {
        SignInPageObjects PageObjects = new SignInPageObjects(driver);
        PageObjects.select_title();
        log.debug("Title is selected as mrs");
        PageObjects.enter_First_name(user_info.get("First_name"));
        log.debug("First name is entered: " + user_info.get("First_name"));
        PageObjects.enter_lat_name(user_info.get("Last_name"));
        log.debug("Last name is entered: " + user_info.get("Last_name"));
        PageObjects.enter_password(user_info.get("Password"));
        log.debug("password is entered: " + user_info.get("Password"));
        PageObjects.SelectDateOfBirth();
        log.debug("date of birth is selected");
        PageObjects.EnterCompanyName(user_info.get("company"));
        log.debug("company name is entered:" + user_info.get("Company"));
        PageObjects.EnterAddress1(user_info.get("Address"));
        log.debug("address is entered:" + user_info.get("Address"));
        PageObjects.EnterAddress2(user_info.get("Address_Line2"));
        PageObjects.EnterCity(user_info.get("city"));
        log.debug("city is entered");
        PageObjects.SelectState();
        log.debug("state is selected");
        PageObjects.EnterZipCode(user_info.get("zip_code"));
        log.debug("postcode is entered:" + user_info.get("zip_code"));
        PageObjects.SelectCountry();
        log.debug("day is selected");
        PageObjects.EnterPhoneNumber(user_info.get("mobile_number"));
        log.debug("m0bile number is entered:" + user_info.get("mobile_number"));
        PageObjects.ClickSubmitAccount();

    }

    @Then("new account is created")
    public void new_account_is_created() {
        SignInPageObjects PageObjects = new SignInPageObjects(driver);
        PageObjects.ValidateTitle("My account - My Store");
    }

    @Given("User is Signed in")
    public void user_is_signed_in() {
        user_opened_the_browser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        user_navigated_to_the_application_url();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        user_clicks_the_link_sign_in();
    }

    @When("user enters email id as {string} and password as {string} and clicks on sign In button:\"")
    public void user_enters_email_id_as_and_password_as_and_clicks_on_sign_in_button(String email_address, String password) {
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        PageObjects.EnterEmailId(email_address);
        log.debug("email address is entered:" + email_address);
        PageObjects.EnterPassword(password);
        log.debug("password is entered: " + password);
        PageObjects.ClickSignInButton();
        log.debug("clicked button");
    }

    @When("User Selects  T-shirts link")
    public void User_Selects_T_shirts_link() {
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageObjects.ClickOnT_shirtLink();
        log.debug("clicked on t-shirt link");
    }

    @When("User clicks on the checkbox of product as Short sleeves and clicks on more button")
    public void user_clicks_on_the_checkbox_of_product_as_short_sleeves_and_clicks_on_more_button() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        PageObjects.ClickCheckBox();
        log.debug("clicked on checkbox");
        PageObjects.ClickImage();
        log.debug("clicked on image");
    }

    @When("user clicks on the send to a friend link")
    public void user_clicks_on_the_send_to_a_friend_link() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        PageObjects.ClickOnSendFriendLink();
        log.debug("clicked on send friend  link");
    }

    @When("user enter following details and click on send button:")
    public void user_enter_following_details_and_click_on_send_button(Map<String, String> frnd_info) {
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        PageObjects.EnterFriendName(frnd_info.get("Name of your friend"));
        log.debug("Name of friend is entered:" + frnd_info.get("Name of your friend"));
        PageObjects.EnterFriendEmail(frnd_info.get("Email address of your friend"));
        log.debug("email id of friend is entered:" + frnd_info.get("Email address of your friend"));
        PageObjects.ClickOnSendEmailButton();
        log.debug("clicked on send button");
    }
    @Then("message will be as email sent to your friend successfully")
    public void message_will_be_as_email_sent_to_your_friend_successfully() {
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        PageObjects.EmailSentmsg("Faded Short Sleeve T-shirts - My store");
    }

    @Given("user selected the category as T-shirts")
    public void user_selected_the_category_as_t_shirts() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        user_enters_email_id_as_and_password_as_and_clicks_on_sign_in_button(email_address, password);
        User_Selects_T_shirts_link();
        log.debug("category T-shirt is selected");
    }
    @Given("user clicked on product")
    public void user_clicked_on_product() {
        user_clicks_on_the_checkbox_of_product_as_short_sleeves_and_clicks_on_more_button();
        log.debug("product is selected");
    }
    @When("user clicks on write a review link")
    public void user_clicks_on_write_a_review_link() {
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        PageObjects.WriteReview();
        log.debug("clicked link");
    }
    @When("user writes tile and comment, and clicks on send button")
    public void user_writes_tile_and_comment_and_clicks_on_send_button() {
        ProductLinkPageObjects PageObjects= new ProductLinkPageObjects(driver);
        PageObjects.EnterReviewTitle();
        log.debug("title is entered");
       PageObjects.EnterReviewComment();
        log.debug("content is entered");
        PageObjects.ClickSubmitReview();
        log.debug("clicked on link");
    }
    @Then("New comment message is displayed")
    public void new_comment_message_is_displayed() {
        ProductLinkPageObjects PageObjects = new ProductLinkPageObjects(driver);
        PageObjects.ReviewSuccessMsg("Faded Short Sleeve T-shirts - My Store");
    }
    @When("user clicks on blue colour link")
    public void user_clicks_on_blue_colour_link() {
        AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
      PageObjects.ClickToChangeColour();
        log.debug("blue colour link clicked");
    }
    @Then("image will changed")
    public void image_will_changed() {
        AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
        PageObjects.ValidateImageIsDisplayed();
        log.debug("colour changed");
    }
    @When("user will fetch the amount of product")
    public void user_will_fetch_the_amount_of_product() {
        AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
        PageObjects.ValidateAmount();
        log.debug("amount fetched");
    }
    @When("user will increase quantity by 2 and size by L and,clicks on add to Cart button")
    public void user_will_increase_quantity_by_2_and_size_by_l_and_clicks_on_add_to_cart_button() {
        user_clicks_on_blue_colour_link();
       AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
       PageObjects.ClickToIncreaseQuantity();
        log.debug("quantity is increased by 2");
        PageObjects.ClickToSelectSize();
        log.debug("size L is selected");
    PageObjects.ClickToAddToCart();
        log.debug("added to cart");
    }
    @When("User sees the Pop Up: Product Successfully Added to Cart")
    public void user_sees_the_pop_up_product_successfully_added_to_cart() {
        AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
     PageObjects.ValidateProduct();
     PageObjects.ValidateProductQuantity();
     PageObjects.ValidatePrice();
    }
    @When("clicks on proceed to checkout button and check the validations")
    public void clicks_on_proceed_to_checkout_button_and_check_the_validations() throws InterruptedException {
        Thread.sleep(5000);
        AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
      PageObjects.ClickToProceedButton();
      PageObjects.ValidateImage();
      PageObjects.ValidateAvailability();
      PageObjects.ValidateProductPrice();
      PageObjects.ValidateProductCount();
      PageObjects.ValidateTotalPrice();
      PageObjects.ValidateShipping();
      PageObjects.ValidateTotalBill();
        log.debug("order summary is displayed");
    }
    @When("clicks on button")
    public void clicks_on_button() throws InterruptedException {
        Thread.sleep(5000);
       AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
       PageObjects.ClickToProceedToCheckout();
        log.debug("button clicked");
    }
    @When("clicks on proceed to checkout again and reach till payment and click on Terms and condition check box")
    public void clicks_on_proceed_to_checkout_again_and_reach_till_payment_and_click_on_terms_and_condition_check_box() {
        AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
        PageObjects.ClickOnProceedAddress();
        PageObjects.ClickToAgreeTermsAndConditions();
        PageObjects.ClickToOrder();
        log.debug("clicked proceed to checkout");
    }
    @When("On Payment Page click on Pay by bank wire and Click on I confirm my Order")
    public void on_payment_page_click_on_by_bank_wire_and_Click_on_I_confirm_my_order() {
        AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
        PageObjects.ClickOnPaymentOption();
        log.debug("payment option is selected");
        PageObjects.ClickOnCompleteProcessButton();
        log.debug("button clicked");
    }
    @Then("message {string} is displayed")
    public void message_is_displayed(String string) {
       AddToCartPageObjects PageObjects = new AddToCartPageObjects(driver);
       PageObjects.DisplayOrderCompleteMsg();
        log.debug("order completed");
    }

}