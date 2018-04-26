import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElementExample {

/////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/index.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Find the heading element of the page by using tagName
    //      2. Find all paragraph elements on the page by using tagName

    private WebDriver driver;


    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/index.html");
    }

    @Test
    public void findHeading() {

        driver.findElement(By.tagName("head"));
    }

    @Test
    public void findParagraphElems() {

        WebElement body = driver.findElement(By.tagName("body"));
        body.findElement(By.tagName("div")).findElement(By.tagName("p"));
        int divCount = driver.findElements(By.tagName("div")).size();

        for(int i = 0; i < divCount-1; i++) { //Printeaza valoarea atributului clasa al tuturor div-urilor din cadrul container-ului, inclusiv child-urile acestora ...just for verification :D

            System.out.println(body.findElement(By.tagName("div")).findElements(By.tagName("div")).get(i).getAttribute("class"));

        }
    }
}
