import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurFirstTest {

	private WebDriver driver;
	
	@Before
	
	public void setUp() {
		
		driver = new ChromeDriver();
	}
	
	@After
	
	public void tearDown() {
		
		//driver.quit();
	}
	
	@Test
	
	public void HelloWorld() {
		
		driver.get("http://localhost:8080/hello-webdriver.html");
		WebElement pageHeading = driver.findElement(By.tagName("h1"));
		assertEquals("Hello WebDriver!", pageHeading.getText());
		assertEquals("Welcome to the first example!", driver.findElement(By.tagName("p")).getText());
	}

}
