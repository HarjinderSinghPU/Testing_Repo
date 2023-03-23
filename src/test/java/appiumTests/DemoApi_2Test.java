package appiumTests;

import basetest.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.emulator.ApiDemo;
import pageObjects.emulator.DemoApi_2;

import java.io.IOException;

public class DemoApi_2Test extends BaseTest {
   DemoApi_2 demoApi_2;

    @BeforeClass
    public void login() throws IOException {
        demoApi_2=new DemoApi_2(initialize());
    }

    @Test(priority = 1)
    public void validateclickOnGraphics()throws InterruptedException{
        demoApi_2.clickOnGraphics();
        Thread.sleep(3000);
    }
   // @Test(priority = 2)
    public void validateverticalScroll()throws InterruptedException{
        demoApi_2.verticalScroll(demoApi_2.getDrawable());
    }
@Test(priority = 2)
    public void validatescrollElement()throws InterruptedException{
        demoApi_2.scrollElement(demoApi_2.getTextclock());
    }

}
