package ScreenshottestingAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.rmi.server.RemoteObjectInvocationHandler;

public class wintenopera {

    public  void win10Opera(RemoteWebDriver driver)
    {
try {
    ScreenshottestingAuto.screenShotNavigation opera = new ScreenshottestingAuto.screenShotNavigation();
    opera.navigation(driver);
    ScreenshottestingAuto.DriverMethods winres = new ScreenshottestingAuto.DriverMethods();
    winres.WinResolutoin(driver);
    driver.findElement(By.xpath("//*[@id=\"simple-screenshot\"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[1]/div")).click();

    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[3]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[4]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[5]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[6]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[7]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[8]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[9]")).click();
    driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607\"]/div[2]/div[3]/div/div[10]")).click();
    ScreenshottestingAuto.launchButton hitlaunch = new ScreenshottestingAuto.launchButton();
    hitlaunch.launch(driver);

    ScreenshottestingAuto.MarkAsBug OperaMark = new ScreenshottestingAuto.MarkAsBug();
    OperaMark.mark(driver);

}
    catch(Exception o)
    {
        System.out.println(o.getMessage());

    }
    }
}
