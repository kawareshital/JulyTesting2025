package testngprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

public class FirstTest {
	@Test
	public void first() {
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://amazon.com");
		
	}

}
