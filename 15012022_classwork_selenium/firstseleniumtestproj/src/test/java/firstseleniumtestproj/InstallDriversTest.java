package firstseleniumtestproj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstallDriversTest {
	
	@Test
	public void chromeSession() {
		//Setting up the session to chrome browser
		WebDriverManager.chromedriver().setup();
		
		//Initializing the Chrome Driver
		WebDriver driver = new ChromeDriver();
		//Passing the url to be tested or opened
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		//Using driver trying to get title of the web page opened above
		String title = driver.getTitle();
		//Assert actual title with the expected title
        assertEquals("Web form", title);
        //System.out.println("Assertion passed");
        //Timeout for 1500 ms implicitily wait 
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));

        //Using driver's findElement method or function we are trying to find my-text element by name
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        
        //Using webelement sendkeys method we are sending text "Selenium" and then submitting the button
        //Sending text means we are testing the Input text box element of html page
        textBox.sendKeys("Selenium");
        submitButton.click();
        
        //After submitting we are getting response Received! which will be referred by html element id "message"
        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!!!!", value);
		
        driver.quit();
	}
}
