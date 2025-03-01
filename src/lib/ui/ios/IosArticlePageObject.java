package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class IosArticlePageObject extends ArticlePageObject {   static {
    TITLE = "id:JavaScript";
    TITLE_SECOND = "id:Java";
    FOOTER_ELEMENT = "id:View article in browser";
    OPTIONS_ADD_TO_MY_LIST_BUTTON = "id:Save for later";
    CLOSE_ARTICLE_BUTTON = "id:Back";
    EXISTING_FOLDER = "id:org.wikipedia:id/item_container";
}

    public IosArticlePageObject(AppiumDriver driver) {
        super(driver);
    }
}
