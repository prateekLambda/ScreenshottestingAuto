package ScreenshottestingAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class basicAuth {


    public void basicAuthTest(RemoteWebDriver driver)

    {
        try {
            ScreenshottestingAuto.screenShotNavigation nav = new ScreenshottestingAuto.screenShotNavigation();
            nav.navigation(driver);
            driver.findElement(By.xpath("//*[@id=\'simple-screenshot\']/app-launcher-detail/section/div[1]/div[1]/div/div[2]/input")).clear();
            driver.findElement(By.xpath("//*[@id=\'simple-screenshot\']/app-launcher-detail/section/div[1]/div[1]/div/div[2]/input")).sendKeys("https://www.enwikuna.de");
            driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[1]/div")).click();

            driver.findElement(By.className("basic-auth")).click();
            Thread.sleep(2000);  //Basic Authentication
            driver.findElement(By.id("basic_username")).sendKeys("comingsoon");  //Username
            driver.findElement(By.id("basic_password")).sendKeys("123456789");   //Password
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\'auth-form\']/button")).click();
            Thread.sleep(2000);
            ScreenshottestingAuto.winTenChrome scree = new ScreenshottestingAuto.winTenChrome();
            scree.winTenChrom(driver);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        }

}
