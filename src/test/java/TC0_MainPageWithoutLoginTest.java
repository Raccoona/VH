import org.testng.Assert;
import org.testng.annotations.Test;

public class TC0_MainPageWithoutLoginTest extends BaseTest {

    @Test
    public void mainPageWithoutLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.phoneOrEmailFieldIsPresent());
        Assert.assertTrue(loginPage.passwordFieldIsPresent());
        Assert.assertTrue(loginPage.loginButtonIsPresent());
    }

}
