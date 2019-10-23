package ScreenshottestingAuto;

import org.openqa.selenium.*;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.testng.Reporter.clear;


public class ScreenshotList   {
//@Test(priority = 2)
    public void list3(RemoteWebDriver driver) {
        {
            //RemoteWebDriver driver = this.driver;
            System.out.println("Class start screenshotList " + driver);

            try {


                ScreenshottestingAuto.screenShotNavigation nav = new ScreenshottestingAuto.screenShotNavigation();
                nav.navigation(driver);
Thread.sleep(5000);
                driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[1]/form/div[2]/input")).clear();

                driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[1]/form/div[2]/input")).sendKeys("https://www.amazon.com");
                System.out.println("Credentails run successfully");
                driver.manage().window().maximize();

                Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/select")));

                dropdown.selectByIndex(3);

                ScreenshottestingAuto.launchButton hitlaunch = new ScreenshottestingAuto.launchButton();
                hitlaunch.launch(driver);
                Thread.sleep(5000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

}