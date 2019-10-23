package ScreenshottestingAuto;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Scanner;

import net.bytebuddy.implementation.bind.annotation.Super;
import net.bytebuddy.implementation.bind.annotation.SuperMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.SessionId;

import java.sql.Timestamp;
import java.util.Date;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import static org.openqa.grid.common.SeleniumProtocol.Selenium;

public class App {
   public String username = "prateeks";
    public String accesskey = "utDW23FJGmZgmgmMu1eoF7sZvobSn7Cmdjwbyqbp5qkJd3EYDo";
    public RemoteWebDriver driver;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;

    @BeforeTest
    @org.testng.annotations.Parameters(value = {"browser", "version", "platform", "fixedIp"})
    public void setUp(String browser, String version, String platform, String fixedIp) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("version", version);
       capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "Debugging screenshot testing");
        capabilities.setCapability("name", browser);
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs
        capabilities.setCapability("resolution", "1680x1050");
   //     capabilities.setCapability("fixedIP", fixedIp);


        try {

                driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);

        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void Creden() {


        ScreenshottestingAuto.Credentials screen = new ScreenshottestingAuto.Credentials();
        screen.crden(driver);
        System.out.println("Credentails run successfully");
    }

    @Test(priority = 1)
    public void screenshotlist() {
        ScreenshottestingAuto.ScreenshotList Creden = new ScreenshottestingAuto.ScreenshotList();
        Creden.list3(driver);
        System.out.println("List run successfully");
    }

    @Test(priority = 2)
    public void markasbug() {
        ScreenshottestingAuto.MarkAsBug markAsBug = new ScreenshottestingAuto.MarkAsBug();
        markAsBug.mark(driver);
        System.out.println("Mark as bug run successfully");
    }


    /*@Test(priority = 3)
    public void win10chrome() {

        ScreenshottestingAuto.basicAuth screen = new ScreenshottestingAuto.basicAuth();
        screen.basicAuthTest(driver);

    }

    @Test(priority = 4)
    public void win10firfox() {
        ScreenshottestingAuto.winTenFirefox firefoxtest = new ScreenshottestingAuto.winTenFirefox();
        firefoxtest.win10firefox(driver);
    }

    @Test(priority = 5)
    public void win10Opera() {
        ScreenshottestingAuto.wintenopera operatest = new ScreenshottestingAuto.wintenopera();
        operatest.win10Opera(driver);

    }

    @Test(priority = 6)

    public void win8_1Chrome() {
        ScreenshottestingAuto.winEight_one operatest = new ScreenshottestingAuto.winEight_one();
        operatest.win8_chrome(driver);

    }

    @Test(priority = 7)
    public void win8_1Firefox() {
        ScreenshottestingAuto.WinEight_one_firefox operatest = new ScreenshottestingAuto.WinEight_one_firefox();
        operatest.Win8_1Firefox(driver);

    }

    @Test(priority = 8)
    public void win8_1Opera() {
        ScreenshottestingAuto.winEight_one operatest = new ScreenshottestingAuto.winEight_one();
        operatest.win8_chrome(driver);

    }

    @Test(priority = 9)
    public void win8Chrome() {
        ScreenshottestingAuto.WinEight_Chrome operatest = new ScreenshottestingAuto.WinEight_Chrome();
        operatest.win8Chrome(driver);

    }

    @Test(priority = 10)
    public void win8Firefox() {
        ScreenshottestingAuto.WinEight_firefox operatest = new ScreenshottestingAuto.WinEight_firefox();
        operatest.win8firefox(driver);

    }

    @Test(priority = 11)
    public void win8Opera() {
        ScreenshottestingAuto.WinEight_Opera operatest = new ScreenshottestingAuto.WinEight_Opera();
        operatest.win8Opera(driver);

    }

    @Test(priority = 12)
    public void Win7Chrome() {
        ScreenshottestingAuto.WinSeven_Chrome operatest = new ScreenshottestingAuto.WinSeven_Chrome();
        operatest.win7Chromw(driver);

    }

    @Test(priority = 13)
    public void win7Firefox() {
        ScreenshottestingAuto.WinSeven_firefox operatest = new ScreenshottestingAuto.WinSeven_firefox();
        operatest.win7Firefox(driver);

    }

    @Test(priority = 14)
    public void win7Opera() {
        ScreenshottestingAuto.WinSeven_Opera operatest = new ScreenshottestingAuto.WinSeven_Opera();
        operatest.win7Opera(driver);

    }

    @Test(priority = 15)
    public void winXpChrome() {
        ScreenshottestingAuto.WinXp_Chrome operatest = new ScreenshottestingAuto.WinXp_Chrome();
        operatest.winXpChrome(driver);

    }

    @Test(priority = 16)
    public void winXpFirefox() {
        ScreenshottestingAuto.WinXp_firefox operatest = new ScreenshottestingAuto.WinXp_firefox();
        operatest.winXpFirefox(driver);

    }

    @Test(priority = 17)
    public void WinXpOpera() {
        ScreenshottestingAuto.WinXp_Opera operatest = new ScreenshottestingAuto.WinXp_Opera();
        operatest.winXpOpera(driver);

    }

    @Test(priority = 18)
    public void macMojavechrome() {
        ScreenshottestingAuto.MacMojaveChrome operatest = new ScreenshottestingAuto.MacMojaveChrome();
        operatest.macMoChrome(driver);

    }

    @Test(priority = 19)
    public void macMojaveFirefox() {
        ScreenshottestingAuto.MacMojaveFirefox operatest = new ScreenshottestingAuto.MacMojaveFirefox();
        operatest.macmoFirefox(driver);

    }

    @Test(priority = 20)
    public void macMojaveopera() {
        ScreenshottestingAuto.MacMojaveOpera operatest = new ScreenshottestingAuto.MacMojaveOpera();
        operatest.macMoOpera(driver);

    }

    @Test(priority = 21)
    public void macHSchrome() {
        ScreenshottestingAuto.MacHighSierraChrome operatest = new ScreenshottestingAuto.MacHighSierraChrome();
        operatest.macHSchrome(driver);

    }

    @Test(priority = 22)
    public void macHSFirefox() {
        ScreenshottestingAuto.MacHighSierraFirefox operatest = new ScreenshottestingAuto.MacHighSierraFirefox();
        operatest.macHSFirefox(driver);

    }

    @Test(priority = 23)
    public void macHSOpera() {
        ScreenshottestingAuto.MacHighSierraOpera operatest = new ScreenshottestingAuto.MacHighSierraOpera();
        operatest.macHSOera(driver);

    }



    @Test(priority = 24)
    public void macSierrachrome() {
        ScreenshottestingAuto.MacSierraChrome operatest = new ScreenshottestingAuto.MacSierraChrome();
        operatest.macSrChrome(driver);

    }

    @Test(priority = 25)
    public void macSierraFirefox() {
        ScreenshottestingAuto.MacSierraFirefox operatest = new ScreenshottestingAuto.MacSierraFirefox();
        operatest.macSrFirefox(driver);

    }

    @Test(priority = 26)
    public void macSierraopera() {
        ScreenshottestingAuto.MacSierraOpera operatest = new ScreenshottestingAuto.MacSierraOpera();
        operatest.macSrOpera(driver);


    }

    @Test(priority = 27)
    public void elcapitanchrome() {
        ScreenshottestingAuto.XElCapitanChrome operatest = new ScreenshottestingAuto.XElCapitanChrome();
        operatest.elCapitanChrome(driver);

    }

    @Test(priority = 28)
    public void elcapitanfirefox() {
        ScreenshottestingAuto.XElCapitanFirefox operatest = new ScreenshottestingAuto.XElCapitanFirefox();
        operatest.elCapitanFirefox(driver);

    }

    @Test(priority = 29)
    public void elcapitanopera() {
        ScreenshottestingAuto.XElCapitanOpera operatest = new ScreenshottestingAuto.XElCapitanOpera();
        operatest.elCapitanOpera(driver);

    }

    @Test(priority = 30)
    public void lionchrome() {
        ScreenshottestingAuto.XLionChrome operatest = new ScreenshottestingAuto.XLionChrome();
        operatest.lionChrome(driver);

    }

    @Test(priority = 31)
    public void lionfirefox() {
        ScreenshottestingAuto.XLionFirefox operatest = new ScreenshottestingAuto.XLionFirefox();
        operatest.lionFirefox(driver);

    }

    @Test(priority = 32)
    public void lionopera() {
        ScreenshottestingAuto.XLionOpera operatest = new ScreenshottestingAuto.XLionOpera();
        operatest.lionOpera(driver);

    }

    @Test(priority = 33)
    public void mavericksChrome() {
        ScreenshottestingAuto.XMavericksChrome operatest = new ScreenshottestingAuto.XMavericksChrome();
        operatest.MavericksChrome(driver);

    }

    @Test(priority = 34)
    public void mavericksfirefox() {
        ScreenshottestingAuto.XMavericksFirefox operatest = new ScreenshottestingAuto.XMavericksFirefox();
        operatest.MavericksFirefox(driver);

    }

    @Test(priority = 35)
    public void mavericksopera() {
        ScreenshottestingAuto.XMavericksOpera operatest = new ScreenshottestingAuto.XMavericksOpera();
        operatest.MavericksOpera(driver);

    }

    @Test(priority = 36)
    public void XMlionChrome() {
        ScreenshottestingAuto.XMountainLionChrome operatest = new ScreenshottestingAuto.XMountainLionChrome();
        operatest.MlionChrome(driver);

    }

    @Test(priority = 37)
    public void XMlionFirefox() {
        ScreenshottestingAuto.XMountainLionFirefox operatest = new ScreenshottestingAuto.XMountainLionFirefox();
        operatest.MlionFirefox(driver);

    }

    @Test(priority = 38)
    public void XMlionOpera() {
        ScreenshottestingAuto.XMountainLionOpera operatest = new ScreenshottestingAuto.XMountainLionOpera();
        operatest.MlionOpera(driver);

    }

    @Test(priority = 39)
    public void yosemiteChrome() {
        ScreenshottestingAuto.XYosemiteChrome operatest = new ScreenshottestingAuto.XYosemiteChrome();
        operatest.yosemiteChrome(driver);

    }

    @Test(priority = 40)
    public void XyosemiteFirefox() {
        ScreenshottestingAuto.XYosemiteFirefox operatest = new ScreenshottestingAuto.XYosemiteFirefox();
        operatest.yosemiteFirefox(driver);

    }

    @Test(priority = 41)
    public void XyosemiteOpera() {
        ScreenshottestingAuto.XYosemiteOpera operatest = new ScreenshottestingAuto.XYosemiteOpera();
        operatest.yosemiteOpera(driver);

    }

    @Test(priority = 42)
    public void ScreenshotDevices() {
        ScreenshottestingAuto.ScreenshotListDevices operatest = new ScreenshottestingAuto.ScreenshotListDevices();
        operatest.list2(driver);

    }

    @Test(priority = 43)
    public void ScreenshotlistMac() {
        ScreenshottestingAuto.ScreenshotListMac operatest = new ScreenshottestingAuto.ScreenshotListMac();
        operatest.list1(driver);

    }
*/
    /* *//* @BeforeTest
    public void getinput()
    {
        int casenumber;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the class you want to run");
        casenumber= s.nextInt();
switch (casenumber)
{
    case 1: screenshotSequenceRunner();
    case 2:  ScreenshottestingAuto.winTenChrome  screen = new ScreenshottestingAuto.winTenChrome(driver);

}*//*
    }*/

    @AfterTest
    public void tearDown() throws Exception {
        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
        }


    }
}

