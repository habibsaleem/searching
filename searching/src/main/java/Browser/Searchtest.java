package Browser;

import Browser.Browsertest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchtest extends Browsertest {

    @FindBy (xpath = "//input[@role='combobox']") private WebElement SearchButtonLink;


    public void ClicksearchButton () {
        SearchButtonLink.sendKeys("dhaka");
        SearchButtonLink.sendKeys(Keys.ENTER);
    }
}
