

                              //Info : Assessment 6 - Radio button & Check box//

package codes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SixthAssignment {
	WebDriver driver= new ChromeDriver();
	@BeforeTest
	public void OpenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=1)
	public void TestCase() {
		WebElement RadioButton = driver.findElement(By.xpath("//input[@class='radioButton' and @value = 'radio2']"));
		RadioButton.click();
		
		WebElement CheckBox = driver.findElement(By.id("checkBoxOption3"));
		CheckBox.click();
	}
}
