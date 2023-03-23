package appiumTests;

import basetest.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.emulator.ApiDemo;

import java.io.IOException;
import java.time.Duration;

public class ApiDemoTest extends BaseTest {
    ApiDemo apiDemo;

    @BeforeClass
    public void login() throws IOException {
        apiDemo = new ApiDemo(initialize());
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void validateclickOnProfile() throws InterruptedException {
        apiDemo.clickOnProfile();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void validateclickOnEmail() throws InterruptedException {
        apiDemo.clickOnEmail();
    }

    @Test(priority = 3)
    public void validateclickOnPhoneNum() throws InterruptedException {
        apiDemo.clickOnPhoneNum();
    }

    @Test(priority = 4)
    public void validateclickOnAddress() throws InterruptedException {
        apiDemo.clickOnAddress();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void validaterecentPageWorking() throws InterruptedException {
        apiDemo.recentPageWorking();
        Thread.sleep(4000);
    }

    // @Test(priority = 6)
    public void validatescrollElement() throws InterruptedException {
        apiDemo.scrollElement(apiDemo.getMiniPanda());
    }

    //    @Test(priority = 6)
//    public void validateverticalScroll()throws InterruptedException{
//        apiDemo.verticalScroll(apiDemo.getWatch());
//    }
    @Test(priority = 7)
    public void validateclickOnProduct() throws InterruptedException {
        Thread.sleep(4000);
        apiDemo.clickOnProduct("2");
    }

    @Test(priority = 8)
    public void validatecategorySectionWorking() throws InterruptedException {
        apiDemo. categorySectionWorking();
    }


}
