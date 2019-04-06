import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TC3_ClickTopButtonsTest extends BaseTest {

    @Test
    public void clickTopButtonsTest() {
        LoginPage loginPage = new LoginPage(driver)
                .inputPhoneOrEmailField(username)
                .inputPasswordField(password)
                .clickLoginButton();

        MainPage mainPage = new MainPage(driver)
                .clickTopNotificationsButton();
        WebElement notificationsBlock = driver.findElement(By.id("top_notify_wrap"));
        Assert.assertTrue(notificationsBlock.isDisplayed());

        mainPage.clickTopAudioButton();
        WebElement audioBlock = driver.findElement(By.id("audio_layer_tt"));
        Assert.assertTrue(audioBlock.isDisplayed());

        mainPage.clickTopProfileButton();
        WebElement profileMenuBlock = driver.findElement(By.id("top_profile_menu"));
        Assert.assertTrue(profileMenuBlock.isDisplayed());

    }

}
