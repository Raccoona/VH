import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSoftForScreenshotsLinkTest extends BaseTest {

    @Test
    public void checkSoftLinkTest() {
        ResponsibilitiesPage responsibilitiesPage = new ResponsibilitiesPage(driver)
                .clickFindDefectsButton()
                .checkFindDefectsDetailsBlockIsPresent();
        String link = responsibilitiesPage.getSoftForScreenshotsLinkValue();
        Assert.assertEquals(link, "http://monosnap.com/ ");
    }

}
