import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public String baseURL = System.getProperty("baseURL");
    public WebDriver driver;

    @BeforeTest
    public void startSession() {
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }

}
