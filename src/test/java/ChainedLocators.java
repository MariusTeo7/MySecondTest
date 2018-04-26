import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChainedLocators {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/login.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Chain two locators to find the a tag inside the forgotten password field
    //      2. ADVANCED : write the chained stream locator in order to find the a which contains the "Forgotten password" text
    //      3. Find each element of the login form starting from finding the form


    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/login.html");

    }

    @Test
    public void chained1() {


        System.out.println(driver.findElement(By.id("login")).findElement(By.id("change-password")).getTagName());

        String forgotten = driver.findElements(By.className("form-group")).get(3).findElement(By.id("change-password")).getTagName();
        System.out.println(forgotten);
    }

    @Test
    public void chained3() {

        WebElement form = driver.findElement(By.className("form-inline")); //the form

        for (int i=0; i<=3; i++){ //itereaza prin toate elementele incluse in form (inclusiv child-urile fiecaruia din ele) si le printeaza anumite atribute for the sake of verification :D
            Assert.assertTrue(form.findElements(By.className("form-group")).get(i).getAttribute("class").contains("form-group"));

            if(form.findElements(By.className("form-group")).get(i).getAttribute("class").contains("forgotten-password")) {
               Assert.assertEquals(form.findElements(By.className("form-group")).get(i).findElement(By.tagName("a")).getAttribute("id"), "change-password");
            } else {
                System.out.println(form.findElements(By.className("form-group")).get(i).findElement(By.tagName("input")).getAttribute("class"));
            }
        }

    }
}
