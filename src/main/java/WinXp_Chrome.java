package ScreenshottestingAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WinXp_Chrome {
    public void winXpChrome(RemoteWebDriver driver) {
        try {
            ScreenshottestingAuto.screenShotNavigation chromeWinEight = new ScreenshottestingAuto.screenShotNavigation();
            chromeWinEight.navigation(driver);
            driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[1]/div")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[3]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[4]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[5]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[6]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[7]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[8]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[9]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908611\"]/div[2]/div[1]/div/div[10]")).click();

            ScreenshottestingAuto.launchButton hitlaunch = new ScreenshottestingAuto.launchButton();
            hitlaunch.launch(driver);
            ScreenshottestingAuto.MarkAsBug chromeeightpoint = new ScreenshottestingAuto.MarkAsBug();
            chromeeightpoint.mark(driver);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
