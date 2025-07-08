



              //Footer elements title in RahulSetty



package codes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TenthAssignment {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test(priority=1)
	public void TestCaseOne() {
		WebElement RestAPIOption = driver.findElement(By.linkText("REST API"));
		RestAPIOption.click();
		//String title = driver.getTitle();
		System.out.println("The title for RestAPIOption is: "+driver.getTitle());
	}
	
	@Test(priority=2)
	public void TestCaseTwo() {
		driver.navigate().back();
		WebElement SoapUIOption = driver.findElement(By.linkText("SoapUI"));
		SoapUIOption.click();
		//String title = driver.getTitle();
		System.out.println("The title for RestAPIOption is: "+driver.getTitle());
	}
	
	@Test(priority=3)
	public void TestCaseThree() {
		driver.navigate().back();
		WebElement AppiumOption = driver.findElement(By.linkText("Appium"));
		AppiumOption.click();
		//String title = driver.getTitle();
		System.out.println("The title for RestAPIOption is: "+driver.getTitle());
	}
	@Test(priority=4)
	public void TestCaseFour() {
		driver.navigate().back();
		WebElement JMeterOption = driver.findElement(By.linkText("JMeter"));
		JMeterOption.click();
		//String title = driver.getTitle();
		System.out.println("The title for RestAPIOption is: "+driver.getTitle());
	}

}
