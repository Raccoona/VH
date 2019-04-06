import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "index_email")
    private WebElement phoneOrEmailField;

    @FindBy(id = "index_pass")
    private WebElement passwordField;

    @FindBy(id = "index_login_button")
    private WebElement loginButton;

    public boolean phoneOrEmailFieldIsPresent() {
        return phoneOrEmailField.isDisplayed();
    }

    public boolean passwordFieldIsPresent() {
        return passwordField.isDisplayed();
    }

    public boolean loginButtonIsPresent() {
        return loginButton.isDisplayed();
    }

    public LoginPage inputPhoneOrEmailField(String phone) {
        phoneOrEmailField.sendKeys(phone);
        return this;
    }

    public LoginPage inputPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
