package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductLinkPageObjects {
    WebDriver driver;
    By emailId = By.xpath("//input[@id='email']");
    By password = By.id("passwd");
    By SignInButton = By.xpath("//button[@id='SubmitLogin']");
    By T_shirtLink = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");
    By CheckBox = By.xpath("//input[@id='layered_id_feature_17']");
    By imgClick = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
    By sendFriendLink = By.id("send_friend_button");
    By FriendName = By.id("friend_name");
    By FriendEmail = By.id("friend_email");
    By SendEmail = By.xpath("//button[@id='sendEmail']");
    By Review = By.xpath("//a[@class='open-comment-form']");
    By titleReview= By.id("comment_title");
    By commentReview= By.id("content");
    By submitReview= By.id("submitNewMessage");


    public ProductLinkPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterEmailId(String arg) { driver.findElement(emailId).sendKeys(arg); }
    public void EnterPassword(String arg) {driver.findElement(password).sendKeys(arg);}
    public void ClickSignInButton(){driver.findElement(SignInButton).click();}
    public void ClickOnT_shirtLink(){driver.findElement(T_shirtLink).click();}
    public void ClickCheckBox() {driver.findElement(CheckBox).click();}
    public void ClickImage(){ driver.findElement(imgClick).click();}
    public void ClickOnSendFriendLink(){driver.findElement(sendFriendLink).click();}
    public void EmailSentmsg(String expected) { Assert.assertEquals(expected, driver.getTitle());}
    public void EnterFriendName(String arg) { driver.findElement(FriendName).sendKeys(arg);}
    public void EnterFriendEmail(String arg) {driver.findElement(FriendEmail).sendKeys(arg);}
    public void ClickOnSendEmailButton() { driver.findElement(SendEmail).click();}
    public void WriteReview(){  driver.findElement(Review).click();}
    public void EnterReviewTitle(){driver.findElement(titleReview).sendKeys("about T-shirt");}
    public void EnterReviewComment(){ driver.findElement(commentReview).sendKeys("very nice");}
    public void ClickSubmitReview(){driver.findElement(submitReview).click(); }
    public void ReviewSuccessMsg(String expected){Assert.assertEquals(expected,driver.getTitle());}


}
