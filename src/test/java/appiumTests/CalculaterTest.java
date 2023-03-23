package appiumTests;


//import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;


public class CalculaterTest {
    //static AndroidDriver webdriver;
    static AppiumDriver driver;

    public static void main(String[] args) throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus Nord CE 2 Lite 5g");
        cap.setCapability("udid", "2e172498");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("autoAcceptAlerts", "true"); //to accept all alerts

        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
//        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options(cap);
        //URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Application Started....");
        Thread.sleep(5000);



    }
}