import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssEquivilents {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/login.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Write the equivalent cssSelector for the forgotten password link by using the ID
    //      2. Write the equivalent cssSelector for the button by using the class name
    //      3. Write the equivalent cssSelector for the email input field by using the name
    //      4. Write the equivalent cssSelector for the forgotten password link by using the tag name      NOT

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/login.html");

    }

    @Test
    public void IDequivalent() {

        driver.findElement(By.cssSelector("a#change-password"));
    }

    @Test
    public void ClassEquivalent() {

        driver.findElement(By.cssSelector(".btn-primary"));
    }

    @Test
    public void NameEquiv() {

        driver.findElement(By.cssSelector("input[name=email]"));
    }

    @Test
    public void TagEquiv() {

        driver.findElement(By.cssSelector("")); //?????
    }
}
