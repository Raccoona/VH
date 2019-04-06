import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedPage extends BasePage {

    @FindBy(id = "post_field")
    private WebElement postTextArea;

    @FindBy(id = "send_post")
    private WebElement sendPostButton;

    @FindBy(className = "post_action_btn_text")
    private WebElement postVisibilityDropDown;

    @FindBy(id = "friends_only")
    private WebElement friendsOnlyOption;

    @FindBy(id = "post_settings_btn")
    private WebElement postSettingsButton;

    @FindBy(id = "mute_notifications")
    private WebElement muteNotificationsCheckbox;

    @FindBy(css = ".wall_post_text.zoom_text")
    private WebElement publishedPostText;

    @FindBy(className = "like_button_icon")
    private WebElement likeButton;

    @FindBy(className = "like_button_count")
    private WebElement likeCount;

    @FindBy(css = ".like_btn.comment._comment._reply_wrap")
    private WebElement openReply;

    @FindBy(css = ".reply_field.submit_post_field")
    private WebElement replyField;

    @FindBy(className = "reply_send_button")
    private WebElement replyButton;

    @FindBy(className = "wall_reply_text")
    private WebElement wallReplyText;

    public FeedPage inputPostTextArea(String text) {
        postTextArea.sendKeys(text);
        return this;
    }

    public FeedPage setFriendsOnlyPostVisibility() {
        postVisibilityDropDown.click();
        friendsOnlyOption.click();
        return this;
    }

    public FeedPage muteNotificationsInPostSettings() {
        postSettingsButton.click();
        muteNotificationsCheckbox.click();
        return this;
    }

    public FeedPage publishPost() {
        sendPostButton.click();
        return this;
    }

    public String getNewlyPublishedPostText() {
        return publishedPostText.getText();
    }

    public FeedPage extendNewlyPublishedPost() {
        publishedPostText.click();
        return this;
    }

    public FeedPage likeNewlyPublishedPost() {
        likeButton.click();
        return this;
    }

    public int getLikeCount() {
        int numberOfLikes;
        if (likeCount.getText().isEmpty()) {
            numberOfLikes = 0;
        } else {
            numberOfLikes = Integer.parseInt(likeCount.getText());
        }
        return numberOfLikes;
    }

    public FeedPage openReplyToNewlyPublishedPost() {
        openReply.click();
        return this;
    }

    public FeedPage inputReplyToNewlyPublishedPost(String replyText) {
        replyField.sendKeys(replyText);
        return this;
    }

    public FeedPage clickReplyToNewlyPublishedPost() {
        replyButton.click();
        return this;
    }

    public String getFirstReplyText() {
        return wallReplyText.getText();
    }

    public FeedPage(WebDriver driver) {
        super(driver);
    }

}
