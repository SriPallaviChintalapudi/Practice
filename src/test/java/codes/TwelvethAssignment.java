package codes;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
public class TwelvethAssignment {

	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenUrl() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test
	public void TestCase() {
		System.out.println(driver.getTitle());
	}
}
