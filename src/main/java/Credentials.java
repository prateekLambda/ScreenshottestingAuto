package ScreenshottestingAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Credentials {

    public void crden(RemoteWebDriver driver) {
        // RemoteWebDriver driver
        // setDriver();

        System.out.println("Class strat Credentials");
        driver.get("https://www.lambdatest.com");
        System.out.println(driver);
        try {
            WebElement sign = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a"));
            sign.click();
            WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"app\"]/section/form/div/div/input[1]"));
            TextBox.sendKeys("prateeks@lambdatest.com");
            WebElement Password = driver.findElement(By.xpath("//*[@id=\"app\"]/section/form/div/div/input[2]"));
            Password.sendKeys("9582334806");
            WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/section/form/div/div/button"));
            login.click();


            Thread.sleep(5000);
            ////*[@id="simple-screenshot"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[1]/div
            ////*[@id="simple-screenshot"]/app-launcher-detail/section/div[1]/div[2]/div/div[2]/div[1]/div
            Reporter.log("Message", true);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        System.out.println("Class Ended Credentials");
        //End of Function
    }

}
