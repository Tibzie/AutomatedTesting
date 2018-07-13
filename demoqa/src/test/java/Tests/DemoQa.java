package Tests;


import Constants.Constants;
import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class DemoQa {

    ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", Constants.DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.HOME_URL);
    }

    @Test
    public void testRegistration() {

        FileInputStream file = new FileInputStream(Constants.EXCEL_PATH);
        XSSFWorkbook
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickRegistration();


    }

    // success
    @Ignore
    @Test
    public void testDraggable() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickDragLink();

        DragAndDrop drag = PageFactory.initElements(driver, DragAndDrop.class);
        drag.DragRect(driver);
    }

    // success
    @Ignore
    @Test
    public void testDroppable() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickDropLink();

        Droppable drop = PageFactory.initElements(driver, Droppable.class);
        drop.dragAndDrop(driver);
    }

    // success
    @Ignore
    @Test
    public void testResize() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.resizeLink();

        Resizable resize = PageFactory.initElements(driver, Resizable.class);
        resize.resizingArrow(driver);
    }
    // success
    @Ignore
    @Test
    public void testSelectable() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickSLink();

        Selectable select = PageFactory.initElements(driver, Selectable.class);
        select.clickLi(driver);
    }

    // success
    @Ignore
    @Test
    public void testSortable() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickSortLink();

        Sortable sort = PageFactory.initElements(driver, Sortable.class);
        sort.sortingStuff(driver);
    }

    // success
    @Ignore
    @Test
    public void testAccordion() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickAccordion();

        Accordion accord = PageFactory.initElements(driver, Accordion.class);
        accord.clickAcc(driver);
    }

    // success
    @Ignore
    @Test
    public void testAutoComplete() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickAutoComp();

        AutoComplete autocomp = PageFactory.initElements(driver, AutoComplete.class);
        autocomp.autoCompletion(driver);
    }

    // success
    @Ignore
    @Test
    public void testDatePicker() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickDatePicker();

        DatePicker datepick = PageFactory.initElements(driver, DatePicker.class);
        datepick.datePicking(driver);
    }

    // success
    @Ignore
    @Test
    public void testMenu() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickMenu();

        Menu menu = PageFactory.initElements(driver, Menu.class);
        menu.liClicking(driver);
    }

    // success
    @Ignore
    @Test
    public void testSlider() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickSlider();

        Slider sliding = PageFactory.initElements(driver, Slider.class);
        sliding.sliderSlidingOnASliderSlidingly(driver);
    }

    // success
    @Ignore
    @Test
    public void testTab() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickTab();

        Tab tabbing = PageFactory.initElements(driver, Tab.class);
        tabbing.TabTab(driver);
    }

    // success
    @Ignore
    @Test
    public void testToolTip() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickToolTip();

        ToolTip tooltipping = PageFactory.initElements(driver, ToolTip.class);
        tooltipping.clickBox(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
