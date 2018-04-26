import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorComposition {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/registration-form.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Find the password field by using ID or name
    //      2. Complete the chained locator in order to find the email field (id, xpath and tagName)
    //      3. Find the password element by writing an AllBy locator                                     NO IDEA
    //      4. Find the email input field element by writing an AnyBy locator                            NO IDEA


    private WebDriver driver;


    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/registration-form.html");
    }

    @Test
    public void findPassword() {

        driver.findElement(By.id("password"));
    }

    @Test
    public void chained() {

        WebElement form = driver.findElement(By.id("registration-form")).findElements(By.className("form-group")).get(1);
        form.findElement(By.id("password")).sendKeys("some text"); // WHYYYYY ISN'T IT WORKINGGGG????

    }

    @Test
    public void allBy() {


    }
}
