package PageObjects;

import Utils.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductLinkPageObjects {

    By emailId = By.id("email");
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

    TestContext testContext;
    public ProductLinkPageObjects(TestContext testContext) {
        this.testContext = testContext;
    }

    public void EnterEmailId(String arg) {testContext.getDriver().findElement(emailId).sendKeys(arg); }
    public void EnterPassword(String arg) {testContext.getDriver().findElement(password).sendKeys(arg);}
    public void ClickSignInButton(){testContext.getDriver().findElement(SignInButton).click();}
    public void ClickOnT_shirtLink(){testContext.getDriver().findElement(T_shirtLink).click();}
    public void ClickCheckBox() {testContext.getDriver().findElement(CheckBox).click();}
    public void ClickImage(){ testContext.getDriver().findElement(imgClick).click();}
    public void ClickOnSendFriendLink(){testContext.getDriver().findElement(sendFriendLink).click();}
    public void EmailSentmsg(String expected) { Assert.assertEquals(expected, testContext.getDriver().getTitle());}
    public void EnterFriendName(String arg) { testContext.getDriver().findElement(FriendName).sendKeys(arg);}
    public void EnterFriendEmail(String arg) {testContext.getDriver().findElement(FriendEmail).sendKeys(arg);}
    public void ClickOnSendEmailButton() { testContext.getDriver().findElement(SendEmail).click();}
    public void WriteReview(){  testContext.getDriver().findElement(Review).click();}
    public void EnterReviewTitle(){testContext.getDriver().findElement(titleReview).sendKeys("about T-shirt");}
    public void EnterReviewComment(){ testContext.getDriver().findElement(commentReview).sendKeys("very nice");}
    public void ClickSubmitReview(){testContext.getDriver().findElement(submitReview).click(); }
    public void ReviewSuccessMsg(String expected){Assert.assertEquals(expected,testContext.getDriver().getTitle());}


}
