import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorExamples {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/login.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Find the forgotten password link by using linkText
    //      2. Find forgotten password link by using partialLingText (3 ways)
    //      3. Find forgottem password link by using id
    //      4. Find the button by using his class name                                   Nu le-am mai facut pentru ca sunt easy :D
    //      5. Find the email input field by using the name                              Nu le-am mai facut pentru ca sunt easy :D
    //      6. Find the forgotten password link by using his tag name                    Nu le-am mai facut pentru ca sunt easy :D

    private WebDriver driver;


    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/login.html");

    }

    @Test
    public void linkText() {

        driver.findElement(By.linkText("Forgotten Password")).click();
    }

    @Test
    public void partiaLinkText() {

        driver.findElement(By.partialLinkText("Forgotten")).click();
    }

    @Test
    public void partialLink2() {

        driver.findElement(By.partialLinkText("Password")).click();
    }

    @Test
    public void partialLink3() {

        driver.findElement(By.partialLinkText("Forgott")).click();
    }

    @Test
    public void linkByID() {

        driver.findElement(By.id("password")).click();
    }
}
