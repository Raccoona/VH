import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_NavigateToMenuButtonsTest extends BaseTest {

    @Test
    public void navigateToMenuButtonsTest() {

        LoginPage loginPage = new LoginPage(driver)
                .inputPhoneOrEmailField(username)
                .inputPasswordField(password)
                .clickLoginButton();

        MainPage mainPage = new MainPage(driver)
                .navigateToMyProfilePage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"id539279699");

        mainPage.navigateToNewsPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"feed");

        mainPage.navigateToMessagesPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"im");

        mainPage.navigateToFriendsPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"friends?act=find");

        mainPage.navigateToCommunitiesPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"groups");

        mainPage.navigateToPhotosPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"albums539279699");

        mainPage.navigateToMusicPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"audios539279699?section=recoms");

        mainPage.navigateToVideosPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"video");

        mainPage.navigateToGamesPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"apps");

        mainPage.navigateToVkpayPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"vkpay");

        mainPage.navigateToMarketPage();
        Assert.assertEquals(driver.getCurrentUrl(), baseURL+"market");
    }

}
