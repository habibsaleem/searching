package Browser;

import Browser.Site;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertest {

        public static WebDriver driver;

        public static WebDriver getdriver () {
            Site.browser.equalsIgnoreCase("chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            return driver ;
        }

    }

