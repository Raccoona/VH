import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    @FindBy(id = "l_pr")
    private WebElement myProfileMenuButton;

    @FindBy(id = "profile_short")
    private WebElement shortProfileBlock;

    @FindBy(id = "l_nwsf")
    private WebElement newsMenuButton;

    @FindBy(id = "ui_rmenu_news")
    private WebElement newsSubMenu;

    @FindBy(id = "l_msg")
    private WebElement messagesMenuButton;

    @FindBy(id = "ui_rmenu_unread")
    private WebElement unreadMessagesButton;

    @FindBy(id = "l_fr")
    private WebElement friendsMenuButton;

    @FindBy(id = "ui_rmenu_requests")
    private WebElement friendsRequestsButton;

    @FindBy(id = "l_gr")
    private WebElement communitiesMenuButton;

    @FindBy(id = "ui_rmenu_events")
    private WebElement communitiesEventsButton;

    @FindBy(id = "l_ph")
    private WebElement photosMenuButton;

    @FindBy(id = "photos_albums_block")
    private WebElement photosAlbumsBlock;

    @FindBy(id = "l_aud")
    private WebElement musicMenuButton;

    @FindBy(css = ".audio_page__main_tabs_btn.audio_page__add_playlist_btn")
    private WebElement addPlaylistButton;

    @FindBy(id = "l_vid")
    private WebElement videosMenuButton;

    @FindBy(id = "video_main_tabs")
    private WebElement videoTabs;

    @FindBy(id = "l_ap")
    private WebElement gamesMenuButton;

    @FindBy(id = "apps_header_block")
    private WebElement appsHeaderBlock;

    @FindBy(id = "l_vkp")
    private WebElement vkpayMenuButton;

    @FindBy(css = ".page_block.apps_vkPayPageBlock")
    private WebElement vkpayPageBlock;

    @FindBy(id = "l_mk")
    private WebElement marketMenuButton;

    @FindBy(id = "ui_rmenu_my")
    private WebElement myProductsButton;

    @FindBy(id = "top_notify_btn")
    private WebElement notificationsButton;

    @FindBy(id = "top_audio")
    private WebElement audioButton;

    @FindBy(id = "top_profile_link")
    private WebElement profileButton;

    WebDriverWait wait = new WebDriverWait(driver,5);

    public MainPage navigateToMyProfilePage() {
        myProfileMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(shortProfileBlock));
        return this;
    }

    public MainPage navigateToNewsPage() {
        newsMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(newsSubMenu));
        return this;
    }

    public MainPage navigateToMessagesPage() {
        messagesMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(unreadMessagesButton));
        return this;
    }

    public MainPage navigateToFriendsPage() {
        friendsMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(friendsRequestsButton));
        return this;
    }

    public MainPage navigateToCommunitiesPage() {
        communitiesMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(communitiesEventsButton));
        return this;
    }

    public MainPage navigateToPhotosPage() {
        photosMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(photosAlbumsBlock));
        return this;
    }

    public MainPage navigateToMusicPage() {
        musicMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(addPlaylistButton));
        return this;
    }

    public MainPage navigateToVideosPage() {
        videosMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(videoTabs));
        return this;
    }

    public MainPage navigateToGamesPage() {
        gamesMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(appsHeaderBlock));
        return this;
    }

    public MainPage navigateToVkpayPage() {
        vkpayMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(vkpayPageBlock));
        return this;
    }

    public MainPage navigateToMarketPage() {
        marketMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(myProductsButton));
        return this;
    }

    public MainPage clickTopNotificationsButton() {
        notificationsButton.click();
        return this;
    }

    public MainPage clickTopAudioButton() {
        audioButton.click();
        return this;
    }

    public MainPage clickTopProfileButton() {
        profileButton.click();
        return this;
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
