import org.testng.Assert;
import org.testng.annotations.Test;

public class TC6_ReplyToNewlyPublishedPostTest extends BaseTest {

    // executable only after TC4
    @Test
    public void replyToNewlyPublishedPostTest() {
        LoginPage loginPage = new LoginPage(driver)
                .inputPhoneOrEmailField(username)
                .inputPasswordField(password)
                .clickLoginButton();

        FeedPage feedPage = new FeedPage(driver);
        driver.navigate().refresh();

        feedPage.openReplyToNewlyPublishedPost()
                .inputReplyToNewlyPublishedPost("Meow")
                .clickReplyToNewlyPublishedPost()
                .extendNewlyPublishedPost();

        Assert.assertEquals(feedPage.getFirstReplyText(), "Meow");
    }

}
