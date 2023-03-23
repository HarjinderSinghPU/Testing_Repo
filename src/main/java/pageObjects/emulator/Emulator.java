package pageObjects.emulator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Emulator {
    static AppiumDriver appiumDriver;
    public static void main(String[] args) throws MalformedURLException {
        File f=new File("src");
        File fs=new File(f,"ApiDemos-debug.apk");

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator001");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability("appium:uiautomator2ServerInstallTimeout","60000");

        UiAutomator2Options uiAutomator2Options=new UiAutomator2Options(cap);
        appiumDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),uiAutomator2Options);


    }
}
