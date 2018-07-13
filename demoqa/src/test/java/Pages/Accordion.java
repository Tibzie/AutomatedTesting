package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Accordion {
    @FindBy(id = "ui-id-6")
    private WebElement accordion;

    public void clickAcc(WebDriver driver) {
        Actions acc = new Actions(driver);
        acc.moveToElement(accordion).click().perform();
    }


}
