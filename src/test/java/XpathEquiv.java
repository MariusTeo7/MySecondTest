import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathEquiv {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/login.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Write the xpath for the forgotten password link by using the id ----------------
    //      2. Write the xpath for the button by using the class name -------------------------
    //      3. Write the xpath for the email input field by using the name --------------------
    //      4. Write the xpath for the forgotten password link by using the tag name


    private WebDriver driver;


    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/login.html");

    }

    @Test
    public void xpath1() {

        driver.findElement(By.xpath("//a[@id='change-password']")); //exista o forma mai profi de a scrie asta?
    }

    @Test
    public void xpath2() {

        driver.findElement(By.xpath("//input[@class='btn btn-primary']")); //exista o forma mai profi de a scrie asta?
    }

    @Test
    public void xpath3() {

        driver.findElement(By.xpath("//input[@name='email']")); //exista o forma mai profi de a scrie asta?
    }

    @Test
    public void xpath4() { //don't know

    }


}
