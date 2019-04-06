import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver)
                .inputPhoneOrEmailField(username)
                .inputPasswordField(password)
                .clickLoginButton();
        WebElement profileLink = driver.findElement(By.id("top_profile_link"));
        Assert.assertTrue(profileLink.isDisplayed());
    }

}
