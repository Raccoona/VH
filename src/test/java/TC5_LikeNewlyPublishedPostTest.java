import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5_LikeNewlyPublishedPostTest extends BaseTest {

    // executable only after TC4
    @Test
    public void likeNewlyPublishedPostTest() {
        LoginPage loginPage = new LoginPage(driver)
                .inputPhoneOrEmailField(username)
                .inputPasswordField(password)
                .clickLoginButton();

        FeedPage feedPage = new FeedPage(driver);
        driver.navigate().refresh();

        int numberOfLikesBefore = feedPage.getLikeCount();
        feedPage.likeNewlyPublishedPost();
        int numberOfLikesAfter = feedPage.getLikeCount();

        Assert.assertTrue(numberOfLikesAfter == (numberOfLikesBefore + 1));
    }

}
