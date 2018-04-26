import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedXPathExample {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/styled-elements.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Write the xpath to select the element which contains the text 'A paragraph with this text in bold'
    //      2. Write the xpath to select the form which is contained in the div that has the text 'A visible paragraph'

    private WebDriver driver;


    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/styled-elements.html");
    }

    @Test
    public void locateByXpath1() {

        //driver.findElement(By.xpath("//*[contains(text(), 'A paragraph with this text in bold')]")); //--anonymus element
        driver.findElement(By.xpath("//p[contains(text(), 'A paragraph with')]"));
    }

    @Test
    public void locateByXpath2() {

        //driver.findElement(By.xpath("//div[contains(text(), 'A visible paragraph')]/form")); //--anonymus element
        driver.findElement(By.xpath("//div[@class='container']/p[2]"));
    }
}
