import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResponsibilitiesPage extends BasePage {

    @FindBy(css = ".graphs-details a")
    private WebElement studyProjectsDetailsButton;

    @FindBy(css = ".graphs-errors a")
    private WebElement findDefectsButton;

    @FindBy(css = ".info-errors article")
    private WebElement findDefectsDetailsBlock;

    @FindBy(css = ".info-errors aside a")
    private WebElement softForScreenshotsLink;

    @FindBy(css = ".graphs-support a")
    private WebElement supportProjectsButton;

    @FindBy(css = ".graphs-files a")
    private WebElement workWithProjectFilesButton;

    public ResponsibilitiesPage clickFindDefectsButton() {
        findDefectsButton.click();
        return this;
    }

    public ResponsibilitiesPage checkFindDefectsDetailsBlockIsPresent() {
        findDefectsDetailsBlock.isDisplayed();
        return this;
    }

    public String getSoftForScreenshotsLinkValue() {
        return softForScreenshotsLink.getAttribute("href");
    }

    public ResponsibilitiesPage(WebDriver driver) {
        super(driver);
    }
}
