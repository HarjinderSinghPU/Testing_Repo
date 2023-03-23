package basetest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public abstract class BaseTest {
    //public AppiumDriver driver;
    public AppiumDriver appiumDriver;
    protected Properties properties = new Properties();

    public AppiumDriver initialize() throws IOException {
        File f = new File("src");
         File fs=new File(f,"ApiDemos-debug.apk");
       // File fs = new File(f, "SolodroidApkpure.apk");
        //File fs = new File(f, "Automation Sample.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "6Pro");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        // cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability("avd", "6Pro");
        cap.setCapability("avdLaunchTimeout", "180000");
        // cap.setCapability("appium:uiautomator2ServerInstallTimeout","60000");

        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options(cap);
        appiumDriver = new  AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), uiAutomator2Options);

        return appiumDriver;

    }


}
