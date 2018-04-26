import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedCssExamples {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/login.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Locate the email input field by using only one attribute
    //      2. Locate the email input field by using only two attributes
    //      3. Locate the password input field by using the prefix of an attribute
    //      4. Locate the password input field by using the suffix of an attribute
    //      5. Locate the password input field by using the infix of an attribute
    //      6. Locate the email input field by using a direct descendant and one attribute
    //      7. Locate the email input field by using any descendant and one attribute                     NOT

    private WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.html");
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void locateByID() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))); // nu mi le recunostea deloc pana am pus wait-uri
    }

    @Test
    public void locateByNameandClass() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));
    }

    @Test
    public void locateByCssStarts(){

        driver.findElement(By.cssSelector("input[name^='pass']"));
    }

    @Test
    public void locateByCssIn(){

        driver.findElement(By.cssSelector("input[class*='contr']"));
    }

    @Test
    public void locateByCssEnds() {

        driver.findElement(By.cssSelector("input[name$='word']"));
    }

    @Test
    public void directDescendant() {

        //driver.findElement(By.cssSelector(".form-group > .form-control"));
        driver.findElement(By.cssSelector("div > input[id=email]"));

    }
}
