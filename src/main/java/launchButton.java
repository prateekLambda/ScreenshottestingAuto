package ScreenshottestingAuto;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class launchButton {

    public void launch(RemoteWebDriver driver) {
        try {

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            driver.findElement(By.className("capture-btn")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            StopWatch ScreenshotLoad = new StopWatch();
            ScreenshotLoad.start();

            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"stop-test\"]"))));

            StopWatch ScreenshotLoadTime = new StopWatch();
            ScreenshotLoadTime.start();


            WebDriverWait wait1 = new WebDriverWait(driver, 180);
            wait1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id=\"stop-test\"]"))));


            ScreenshotLoadTime.stop();
            long ScreenshotLoadTimems = ScreenshotLoad.getTime() / 1000;
            long i = 120;
            if (ScreenshotLoadTimems < i) {

                String testid = driver.getCurrentUrl();
                System.out.println(testid);
                driver.get(testid + "?debug=true");
            } else {

                System.out.println("Screenshot generated in 2 minutes");

            }
            ScreenshotLoad.stop();
            long ScreenshotLoadms = ScreenshotLoad.getTime() / 1000;
            System.out.println("Total time to generate the screenshot"+"  " + ScreenshotLoadms);

            System.out.println("Time in which screenshot take more than expected " +"   "+ ScreenshotLoadTimems);
        } catch (Exception l) {
            System.out.println(l.getMessage());
        }

    }
}
