package ScreenshottestingAuto;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class DriverMethods {

    public void scrolldown(RemoteWebDriver driver) {

        JavascriptExecutor scrolld = (JavascriptExecutor) driver;
        scrolld.executeScript("window.scrollBy(0,500)");

    }

    public void Scrollup(RemoteWebDriver driver) {
        JavascriptExecutor scrollu = (JavascriptExecutor) driver;
        scrollu.executeScript("window.scrollBy(0,-500)");

    }

    public void deffertime(RemoteWebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[1]")).click(); //Settings
        driver.findElement(By.xpath("//*[@id=\"defer-time\"]")).click();

        Select deferValue = new Select(driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[4]/div/div[1]/select")));
        deferValue.selectByIndex(2); //defer time value
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[7]/button")).click(); //Apply settings

    }

    public void MacResolution(RemoteWebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[1]")).click(); //Settings
        driver.findElement(By.xpath("//*[@id=\"mac-res\"]")).click();
        Select MacResolutionVaule = new Select(driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[1]/div[1]/div/div[1]/select")));
        MacResolutionVaule.selectByIndex(1); //Mac Resolutions value
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[7]/button")).click(); //Apply settings

    }

    public void WinResolutoin(RemoteWebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[1]")).click(); //Settings
        driver.findElement(By.xpath("//*[@id=\"win-res\"]"));
        Select WinResolutionVaule = new Select(driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[1]/div[2]/div/div[1]/select")));
        WinResolutionVaule.selectByIndex(3); //Win Resolutions value
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[7]/button")).click(); //Apply settings

    }

    public void SmartScroll(RemoteWebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[1]")).click(); //Settings

        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[5]/div/div[1]/label/span")).click(); //smart Scroll
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[7]/button")).click(); //Apply settings

    }

    public void Emailconfirmation(RemoteWebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[1]")).click(); //Settings

        driver.findElement(By.xpath("//*[@id=\"send_email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[7]/button")).click(); //Apply settings


    }

    public void potraitMode(RemoteWebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[1]")).click(); //Settings

        driver.findElement(By.xpath("//*[@id=\"portrait\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[7]/button")).click(); //Apply settings


    }

    public void LanscapeMode(RemoteWebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[1]")).click(); //Settings

        driver.findElement(By.xpath("//*[@id=\"landscape\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[3]/div[3]/div[2]/div[7]/button")).click(); //Apply settings


    }

    public void ShareBox(RemoteWebDriver driver) {
        try {
            driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-result/div[1]/div[2]/div[3]/div[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div[3]/tags/div")).click();

            driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div[3]/tags/div")).sendKeys("prateek.delguy@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"add_note_@#$\"]")).sendKeys("FInd the bug");
            driver.findElement(By.id("generate_sharable_link@#$")).click();

            WebElement Sharablelink = driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div[2]/div/button/i"));
            Sharablelink.click();
            System.out.println(Sharablelink);

            WebElement GetSharabelelink = driver.findElement(By.xpath("//*[@id=\'sharable_link_@#$\']"));
            String link = GetSharabelelink.getAttribute("Sharable link value");

            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div[4]/textarea")).click();
            driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div[4]/textarea")).sendKeys("PLease find the bug accordingly");
            Thread.sleep(5000);
            Select Expirestime = new Select(driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div[5]/div[2]/select")));

            Expirestime.selectByIndex(3);
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div[5]/div[3]/button")).click();


        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void TakeSCreenshot(RemoteWebDriver driver) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\Desktop\\Testng report\\screenshot.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
