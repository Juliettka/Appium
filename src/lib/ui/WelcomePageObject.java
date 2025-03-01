package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class WelcomePageObject extends MainPageObject{
    private static final String
    STEP_LEARN_MORE_LINK = "id:Learn more about Wikipedia",
    STEP_NEW_WAYS_TO_EXPLORE = "id:New ways to explore",
    STEP_ADD_OR_EDIT_PREF_LANG = "id:Add or edit preferred languages",
    STEP_LEARN_MORE_ABOUT_DATA_COLLECTED = "id:Learn more about data collected",
    GET_STARTED = "id:Get started",
    NEXT_BUTTON = "id:Next",
    SKIP = "id:Skip";
    public WelcomePageObject(AppiumDriver driver) {
        super(driver);
    }
    public void waitForLearnMoreLink(){
        this.waitForElementPresent(STEP_LEARN_MORE_LINK,
                "Cannot find Learn more element",
                10);
    }
    public void clickNextButton(){
        this.waitForElementAndClick(NEXT_BUTTON,
                "Cannot find Next button",
                10);
    }
    public void clickGetStartedButton(){
        this.waitForElementAndClick(GET_STARTED,
                "Cannot find Get Started button",
                10);
    }
    public void waitForNewWayToExploreText(){
        this.waitForElementPresent(STEP_NEW_WAYS_TO_EXPLORE,
                "Cannot find New ways to explore",
                10);
    }
    public void waitForAddOrEditLangText(){
        this.waitForElementPresent(STEP_ADD_OR_EDIT_PREF_LANG,
                "Cannot find Add or edit preferred languages",
                10);
    }
    public void waitForLearnMoreDataCollectedText(){
        this.waitForElementPresent(STEP_LEARN_MORE_ABOUT_DATA_COLLECTED,
                "Cannot find Learn more about data collected element",
                10);
    }
    public void clickSkip(){
        this.waitForElementAndClick(SKIP, "Cannot find Skip Button", 15);
    }
}
