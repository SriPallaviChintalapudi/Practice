

                                //Alerts in rahulshetty website


package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EightAssignment {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	@Test(priority=1)
	public void SimpleAlerts() {
		WebElement nameText = driver.findElement(By.id("name"));
		nameText.click();
		nameText.sendKeys("pallavi");
		
		WebElement AlertBtn = driver.findElement(By.id("alertbtn"));
		AlertBtn.click();
		String text = driver.switchTo().alert().getText();
		System.out.println("the text is: "+text);
		driver.switchTo().alert().accept();
	}
	
	@Test(priority=2)
	public void ConformationAlertsAcceptOption() {
		
		WebElement nameText = driver.findElement(By.id("name"));
		nameText.click();
		nameText.sendKeys("pallavi");
		
		WebElement ConfirmBtn = driver.findElement(By.id("confirmbtn"));
		ConfirmBtn.click();
		String text = driver.switchTo().alert().getText();
		System.out.println("The text is: "+text);
		driver.switchTo().alert().accept();
		
	}
	
	@Test(priority=3)
	public void ConformationAlertsRejectOption() {
		WebElement nameText = driver.findElement(By.id("name"));
		nameText.click();
		nameText.sendKeys("pallavi");
		
		WebElement ConfirmBtn = driver.findElement(By.id("confirmbtn"));
		ConfirmBtn.click();
		String text = driver.switchTo().alert().getText();
		System.out.println("The text is:"+text);
		driver.switchTo().alert().dismiss();
	}
	
}
