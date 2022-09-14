import Browser.Browsertest;
import Browser.Searchtest;
import Browser.Site;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Beforemethod {

    WebDriver driver;

    @BeforeMethod
     public void setup () {
    driver = Browsertest.getdriver();
    driver.navigate().to(Site.url);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterMethod
    public void CloseBrowser () {
      //  driver.close();
        // driver.quit();
    }

    public Searchtest forTest() {
        return PageFactory.initElements(driver, Searchtest.class);
    }
}
