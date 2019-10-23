package ScreenshottestingAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class screenShotNavigation {

    public void navigation(RemoteWebDriver driver)

    {
        try{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.className("arrow-menu")).click(); // Visual UI Testing
            driver.findElement(By.linkText("Screenshot")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[1]/form/div[2]/input")).clear();
            driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-launcher/div/div/div/div/div/app-launcher-detail/section/div[1]/div[1]/form/div[2]/input")).sendKeys("https://www.tesla.com");
        }
        catch (Exception N)
        {
            System.out.println(N.getMessage());
        }


    }
}
