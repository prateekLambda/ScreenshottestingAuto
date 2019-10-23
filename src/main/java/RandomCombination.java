import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RandomCombination {
    public void combScreenhot(RemoteWebDriver driver) {
        try {
            String i;
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607BRS100021498722190810BRV100021534225035107\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"OSV100021498719908607BRS100021498722190810BRV100021534225035106\"]")).click();











        }
        catch (Exception c)
        {
            System.out.println(c.getMessage());
        }
    }
}