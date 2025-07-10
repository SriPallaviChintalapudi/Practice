
                          ///Upload file in https://practice.expandtesting.com/upload

package codes;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
public class TwelvethAssignment {

	WebDriver driver = new ChromeDriver();
	//WebDriverWait wait = new WebDriverWait(driver,30);
	
	@BeforeTest
	public void OpenUrl() {
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test
	public void TestCase() {
		WebElement ChooseFile = driver.findElement(By.id("fileInput"));
		String FilePath = "C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\hi.png";
		ChooseFile.sendKeys(FilePath);
		
		WebElement UploadBtn = driver.findElement(By.id("fileSubmit"));
		UploadBtn.click();
	}
}
