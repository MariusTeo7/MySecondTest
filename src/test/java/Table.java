import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table {

    /////////// Exercise  //////////////

    // Requirements:
    //      - use chrome browser
    //      - use the following exercise page: localhost:8080/users-table.html
    //      - create a before method for instantiating webdriver
    //      - for each exercise create a separate Test method

    // Exercises:
    //      1. Write the locators and implement the logic for the css selectors in order to find the column number that has the "Name" heading
    //        DO NOT USE FIND BY TEXT OR ANY METHOD BASED ON TEXT
    //      2. Write the css selector in order to find the position of the element that contains John Doe in the table (based on element position)
    //        DO NOT USE FIND BY TEXT OR ANY METHOD BASED ON TEXT
    //      3. Write the xpath selector in order to find the element that contains John Doe in the table (based on element position)
    //        DO NOT USE FIND BY TEXT OR ANY METHOD BASED ON TEXT


    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("localhost:8080/users-table.html");
    }

    @Test
    public void first() {

        driver.findElement(By.cssSelector("#users-table")).findElement(By.cssSelector("th:nth-child(3)")).getText();
    }

    @Test
    public void second() {

        driver.findElement(By.cssSelector("#users-table")).findElement(By.cssSelector("td:nth-child(3)"));
        driver.findElement(By.cssSelector("#users-table")).findElement(By.cssSelector("td:nth-child(1)")); //Asta am inteles prin pozitia Lui John Doe in table. Adica pozitia 1 care se gaseste pe coloana "#"
    }

    @Test
    public void third() {

        driver.findElement(By.cssSelector("#users-table")).findElement(By.xpath("//td[contains(text(), 'John Doe')]"));
        driver.findElement(By.cssSelector("#users-table")).findElement(By.xpath("//td[contains(text(), '1')]"));
    }
}
