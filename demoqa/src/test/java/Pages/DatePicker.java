package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DatePicker {

    @FindBy(id = "datepicker1")
    private WebElement datesearchbox;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")
    private WebElement chosendate;

    public void datePicking(WebDriver driver) {
        Actions pick = new Actions(driver);
        pick.moveToElement(datesearchbox).click().perform();

        pick.moveToElement(chosendate).click().perform();
    }
}
