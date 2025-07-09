



              //Footer elements title in RahulSetty



package codes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TenthAssignment {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test(priority=1)
	public void TestCaseOne() {
		Actions action = new Actions(driver);
		WebElement RestAPIOption = driver.findElement(By.linkText("REST API"));
		action.keyDown(Keys.CONTROL).click(RestAPIOption).keyUp(Keys.CONTROL).build().perform();	
		String ParentWindow = driver.getWindowHandle();
		Set<String> AllWindows = driver.getWindowHandles();
		for(String windowHandle:AllWindows) {
			if(!windowHandle.equals(ParentWindow)) {
				driver.switchTo().window(windowHandle);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.titleIs("Learn REST API Design - REST API Tutorial"));
				//System.out.println("The title for RestAPIOption is: "+driver.getTitle());
			}
		}
		System.out.println("The title for RestAPIOption is: "+driver.getTitle());

		driver.close();
		//String title = driver.getTitle();
		driver.switchTo().window(ParentWindow);
	}
	
	@Test(priority=2)
	public void TestCaseTwo() {
		//driver.navigate().back();
		Actions action = new Actions(driver);
		WebElement SoapUIOption = driver.findElement(By.linkText("SoapUI"));
		action.keyDown(Keys.CONTROL).click(SoapUIOption).keyUp(Keys.CONTROL).build().perform();
		
		String ParentWindow = driver.getWindowHandle();
		Set <String> AllWindows = driver.getWindowHandles();
		for(String windowHandle:AllWindows) {
			if(!windowHandle.equals(ParentWindow)) {
				driver.switchTo().window(windowHandle);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.titleIs("The World's Most Popular API Testing Tool | SoapUI"));
				System.out.println("The title for SOAPUI is: "+driver.getTitle());
			}
		}
		driver.close();
		driver.switchTo().window(ParentWindow);

	}
	
	@Test(priority=3)
	public void TestCaseThree() {
		Actions action = new Actions(driver);
		WebElement AppiumOption = driver.findElement(By.linkText("Appium"));
		action.keyDown(Keys.SHIFT).click(AppiumOption).keyUp(Keys.SHIFT).build().perform();
		
		String ParentWindow = driver.getWindowHandle();
		Set <String> AllWindows = driver.getWindowHandles();
		for(String windowHandle:AllWindows) {
			if(!windowHandle.equals(ParentWindow)) {
				driver.switchTo().window(windowHandle);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.titleIs("Appium Mobile Automation Testing from Scratch + Frameworks Tutorial | Udemy"));
				System.out.println("The title for AppiumOption is: "+driver.getTitle());
			}
		}
		driver.close();
		driver.switchTo().window(ParentWindow);
	}
	@Test(priority=4)
	public void TestCaseFour() {
		Actions action = new Actions(driver);
		WebElement JMeterOption = driver.findElement(By.linkText("JMeter"));
		action.keyDown(Keys.SHIFT).click(JMeterOption).keyUp(Keys.SHIFT).build().perform();
		
		String ParentWindow = driver.getWindowHandle();
		Set <String> AllWindows = driver.getWindowHandles();
		for(String windowHandle:AllWindows) {
			if(!windowHandle.equals(ParentWindow)) {
				driver.switchTo().window(windowHandle);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.titleIs("Apache JMeter - Apache JMeter™"));
				System.out.println("The title for JMeterOption is: "+driver.getTitle());
			}
	}
		driver.close();
		driver.switchTo().window(ParentWindow);
	}
	
	@AfterTest
	public void CloseURL() {
		driver.quit();
	}
}
