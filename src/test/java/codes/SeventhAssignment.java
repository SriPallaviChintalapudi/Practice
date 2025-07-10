

                      //Info : Assessment 7 - MouseOver in rahul shetty and Drag and drop using actions class in demo website



package codes;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeventhAssignment {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=1)
	public void TestCase1() {
		Actions actions = new Actions(driver);
		WebElement MouseOverButton = driver.findElement(By.id("mousehover"));
		actions.moveToElement(MouseOverButton).build().perform();
		
		WebElement TopOption = driver.findElement(By.linkText("Top"));
		TopOption.click();
		
	}
	@Test(priority=2)
	public void TestCase2() {
		driver.navigate().back();
		Actions actions = new Actions(driver);
		WebElement MouseOverButton = driver.findElement(By.id("mousehover"));
		actions.moveToElement(MouseOverButton).build().perform();
		
		WebElement reloadOption = driver.findElement(By.linkText("Reload"));
		reloadOption.click();
		//actions.dragAndDrop(MouseOverButton, reloadOption)
	}
	
	@Test(priority=3)
	public void TestCase3() {
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		Actions actions = new Actions(driver);
		WebElement Source = driver.findElement(By.xpath("//a[@class='button button-orange' and normalize-space(text())='5000']"));
		WebElement Target = driver.findElement(By.xpath("//ol[@id='amt7']/li[@class='placeholder']"));
		actions.dragAndDrop(Source, Target).perform();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}
	
	
	@AfterTest
	public void CloseURL() {
		driver.close();
	}
}
