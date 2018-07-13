package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class AutoComplete {

    @FindBy(xpath = "//*[@id='tagss']")
    private WebElement searchbox;

    @FindBy(css = "#ui-id-1 > li")
    private WebElement li;

    private String text = "hask";

    public void autoCompletion(WebDriver driver) {
        Actions auto = new Actions(driver);
        auto.moveToElement(searchbox).click().perform();
        auto.moveToElement(searchbox).sendKeys(text).perform();

        auto.sendKeys(Keys.DOWN).moveToElement(li).perform();
        auto.sendKeys(Keys.ENTER).click().perform();

    }
}
