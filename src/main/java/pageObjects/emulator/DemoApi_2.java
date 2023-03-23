package pageObjects.emulator;

import baseclass.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

public class DemoApi_2 extends BasePage {
    public DemoApi_2(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getGraphics() {
        return graphics;
    }

    public void setGraphics(WebElement graphics) {
        this.graphics = graphics;
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Graphics\"]")
    private WebElement graphics;

    public WebElement getDrawable() {
        return drawable;
    }

    public void setDrawable(WebElement drawable) {
        this.drawable = drawable;
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Drawable\"]")
    private WebElement drawable;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    private WebElement views;

    public WebElement getViews() {
        return views;
    }

    public void setViews(WebElement views) {
        this.views = views;
    }

    public WebElement getTextclock() {
        return textclock;
    }

    public void setTextclock(WebElement textclock) {
        this.textclock = textclock;
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc='System UI Visibility']")
    private WebElement textclock;

//        @FindBy(xpath = "//android.widget.TextView[@content-desc="Secure View"]")
//        private WebElement drawable;
//        @FindBy(xpath = "")
//        private WebElement drawable;
//        @FindBy(xpath = "")
//        private WebElement drawable;
//        @FindBy(xpath = "")
//        private WebElement drawable;
//        @FindBy(xpath = "")
//        private WebElement drawable;


    public void clickOnGraphics()throws InterruptedException{
       // getGraphics().click();
        views.click();
    }
    public void verticalScroll(WebElement element) throws InterruptedException{
        Thread.sleep(5000);

        int centerx = element.getRect().x + (element.getSize().width / 2);
        double starty = element.getRect().y + (element.getSize().height * 0.9);
        double endy = element.getRect().y + (element.getSize().height * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerx,(int)starty));
        swipe.addAction(finger.createPointerDown(0));

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(),centerx, (int)endy));
        swipe.addAction(finger.createPointerUp(0));
        driver.perform(Arrays.asList(swipe));

    }
    public  void scrollElement(WebElement element)throws InterruptedException{
        try {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true). instance(0)).scrollIntoView( new UiSelector()" + ".textMatches(\"" + "%s" + "\").instance(0)), element"));

        }catch (Exception e) {
            e.printStackTrace();
        }
      element.click();

    }


    }






