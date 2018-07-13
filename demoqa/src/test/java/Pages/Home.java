package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

    @FindBy(xpath = "//*[@id='menu-item-374']/a")
    private WebElement registrationlink;

    @FindBy(xpath = "//*[@id='menu-item-140']/a")
    private WebElement draggableLink;

    @FindBy(xpath = "//*[@id='menu-item-141']/a")
    private WebElement droppableLink;

    @FindBy(xpath = "//*[@id='menu-item-143']/a")
    private WebElement resizableLink;

    @FindBy(xpath = "//*[@id='menu-item-142']/a")
    private WebElement selectableLink;

    @FindBy(xpath = "//*[@id='menu-item-151']/a")
    private WebElement sortableLink;

    @FindBy(xpath = "//*[@id='menu-item-144']/a")
    private WebElement accordionLink;

    @FindBy(xpath = "//*[@id='menu-item-145']/a")
    private WebElement autocompLink;

    @FindBy(xpath = "//*[@id='menu-item-146']/a")
    private WebElement datepickerLink;

    @FindBy(xpath = "//*[@id='menu-item-147']/a")
    private WebElement menuLink;

    @FindBy(xpath = "//*[@id='menu-item-97']/a")
    private WebElement sliderLink;

    @FindBy(xpath = "//*[@id='menu-item-98']/a")
    private WebElement tabLink;

    @FindBy(xpath = "//*[@id='menu-item-99']/a")
    private WebElement toolTipLink;

    public void clickRegistration() { registrationlink.click();}
    public void clickDragLink() {
        draggableLink.click();
    }
    public void clickDropLink() {
        droppableLink.click();
    }
    public void resizeLink() {
        resizableLink.click();
    }
    public void clickSLink() {
        selectableLink.click();
    }
    public void clickSortLink() {
        sortableLink.click();
    }
    public void clickAccordion() {
        accordionLink.click();
    }
    public void clickAutoComp() {
        autocompLink.click();
    }
    public void clickDatePicker() {
        datepickerLink.click();
    }
    public void clickMenu() {
        menuLink.click();
    }
    public void clickSlider() {
        sliderLink.click();
    }
    public void clickTab() {
        tabLink.click();
    }
    public void clickToolTip() {
        toolTipLink.click();
    }
}
