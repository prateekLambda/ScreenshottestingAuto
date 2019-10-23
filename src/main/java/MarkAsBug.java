package ScreenshottestingAuto;

//import org.apache.commons.logging.Log;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.TestHTMLReporter;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class MarkAsBug {

    public void mark(RemoteWebDriver driver) {
        System.out.println(driver);
        try {
            System.out.println("class start Mark as bug");
            WebDriverWait wait3 = new WebDriverWait(driver, 15);
            wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > app-console > app-header > section > app-screenshot-testing > app-screenshot-result > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > div:nth-child(2) > div.ResultImg > img")));
            driver.findElement(By.cssSelector("body > app-root > app-console > app-header > section > app-screenshot-testing > app-screenshot-result > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > div:nth-child(2) > div.ResultImg > img")).click();
            driver.findElement(By.cssSelector("body > app-root > app-console > app-header > section > app-screenshot-testing > app-screenshot-result > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > div:nth-child(2) > div.ResultImg > img")).click();




            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sketch\"]")));
            Actions builder = new Actions(driver);
            WebElement canvas = driver.findElement(By.xpath("//*[@id=\"sketch\"]"));  // Marking a Bug on Screenshot
            builder.build();
            Thread.sleep(Long.parseLong("20000"));
            builder.moveToElement(canvas, 100, 100)
                    .clickAndHold()
                    .moveByOffset(140, 160)
                    .release();
            builder.perform();

            driver.findElement(By.xpath("//*[@id=\'default-menu\']/div/div[2]/ul/li[3]/a")).click();
            Thread.sleep(12000);  //Mark As Bug Button On screenshot

            driver.switchTo().frame("nuisanceFrame");


            WebElement Project = driver.findElement(By.cssSelector("#lambda_project > div > p"));
            Actions actions = new Actions(driver);
            actions.moveToElement(Project);
            actions.click();
            actions.sendKeys("demo");
            WebElement projectName = driver.findElement(By.xpath("//*[@id=\"lambda_project\"]/div/div/ul/li[3]/label"));
            actions.moveToElement(projectName);
            actions.click().build().perform();
            Thread.sleep(1200); //Select Project

            WebElement AssignedTo = driver.findElement(By.xpath("//*[@id=\"lambda_project_children\"]/div[1]/div[1]/p"));
            actions.moveToElement(AssignedTo);
            actions.click();
            actions.sendKeys("prateek");
            WebElement AssineeName = driver.findElement(By.xpath("//*[@id=\"lambda_project_children\"]/div[1]/div[1]/div/ul/li[29]/label"));
            actions.moveToElement(AssineeName);
            actions.click().build().perform();

            Thread.sleep(2000);  //Select AssignedTo

            WebElement Issue = driver.findElement(By.xpath("//*[@id=\"lambda_project_children\"]/div[2]/div[1]/p/span"));
            actions.moveToElement(Issue);
            actions.click();
            actions.sendKeys("story");
            WebElement IssueType = driver.findElement(By.xpath("//*[@id=\"lambda_project_children\"]/div[2]/div[1]/div/ul/li[2]/label"));
            actions.moveToElement(IssueType);

            actions.click().build().perform();
            Thread.sleep(2000);  //Select Priority

            WebElement summary = driver.findElement(By.xpath("//*[@id=\"lambda_summary\"]/input"));
            summary.sendKeys("Here is the Story of my bug");
            StopWatch creatingIssue = new StopWatch();
            creatingIssue.start();

            driver.findElement(By.xpath("//*[@id=\"nuisance_js_submitBtn\"]")).click();
            creatingIssue.stop();
            long creatingIssuems = creatingIssue.getTime() / 1000;
            long c = 10;
            if (creatingIssuems < c) {
                System.out.println("Creating issue did not work till 10 sec");
            } else {
                System.out.println("Creating issue sucessful");
            }
            System.out.println("Logging Bug time"+"   " + creatingIssuems);

           //   TestHTMLReporter.generateTable("Logging Bug time" +creatingIssuems);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"default-menu\"]/div/div[2]/ul/li[5]/a")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ScreenshottestingAuto.DriverMethods scorllDownMHSC= new ScreenshottestingAuto.DriverMethods();
            scorllDownMHSC.scrolldown(driver);
            Thread.sleep(5000);
            ScreenshottestingAuto.DriverMethods scorllup= new ScreenshottestingAuto.DriverMethods();
            scorllup.Scrollup(driver);
            ScreenshottestingAuto.DriverMethods Share = new ScreenshottestingAuto.DriverMethods();
            Share.ShareBox(driver);

            ScreenshottestingAuto.DriverMethods screenshot = new ScreenshottestingAuto.DriverMethods();
            screenshot.TakeSCreenshot(driver);

            driver.findElement(By.xpath("/html/body/app-root/app-console/app-header/section/app-screenshot-testing/app-screenshot-result/div[2]/div/table/tbody/tr/td[2]/div[7]/div[1]/div[2]/i")).click();

            WebDriverWait wait1 = new WebDriverWait(driver, 2000);
            ((JavascriptExecutor) driver).executeScript("window.open()");
            ArrayList<String> tabss = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabss.get(1));
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"drog-nav\"]/div[2]/ul/li[8]/a"))));
            String RealtimeTestid = driver.getCurrentUrl();
            System.out.println(RealtimeTestid);
            Thread.sleep(10000);
            driver.findElement(By.xpath("//*[@id=\"drog-nav\"]/div[2]/ul/li[8]/a")).click();
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "w");
driver.switchTo().window(tabss.get(0));

        } catch (Exception m) {
            System.out.println(m.getMessage());
        }
        System.out.println("Class Ended Mark");
    }
}
