package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Slider {

    @FindBy(className = "ui-slider-handle")
    private WebElement slider;

    public void sliderSlidingOnASliderSlidingly(WebDriver driver) {
        Actions slide = new Actions(driver);
        slide.moveToElement(slider).clickAndHold().moveByOffset(300, 0).perform();
    }

}
