import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_PublishPostTest extends BaseTest {

    @Test
    public void publishPostTest() {
        LoginPage loginPage = new LoginPage(driver)
                .inputPhoneOrEmailField(username)
                .inputPasswordField(password)
                .clickLoginButton();
        FeedPage feedPage = new FeedPage(driver)
                .inputPostTextArea("Hello World")
                .setFriendsOnlyPostVisibility()
                .muteNotificationsInPostSettings()
                .publishPost();

        driver.navigate().refresh(); // need to refresh page in order to see my new post /shrug

        Assert.assertEquals(feedPage.getNewlyPublishedPostText(), "Hello World");
    }

}
