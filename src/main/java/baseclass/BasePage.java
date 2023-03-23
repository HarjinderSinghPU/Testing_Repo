package baseclass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public AppiumDriver driver;
    //protected WebDriver driver;

    protected BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}


