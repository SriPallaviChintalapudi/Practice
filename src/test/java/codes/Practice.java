package codes;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class Practice {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OPenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void TestCase() {
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		dropDown.click();
		Select select = new Select(dropDown);
		select.selectByVisibleText("Option1");
		//select.getFirstSelectedOption();
		WebElement getOption = select.getFirstSelectedOption();
		System.out.println(getOption.getText());
	}
	@Test
	public void TestCase2() {
		WebElement DropDown = driver.findElement(By.id("autocomplete"));
		DropDown.click();
		DropDown.sendKeys("I");
		
		List<WebElement> dropdownOptions = driver.findElements(By.xpath("//li[contains(@class, 'ui-menu-item')]/div"));
		for(WebElement options:dropdownOptions) {
			if(options.getText().equalsIgnoreCase("India")) {
				options.click();
			}
		}
//		String GetText = DropDown.getText();
        String selectedValue = DropDown.getAttribute("value");
System.out.println(selectedValue);
//		System.out.println(GetText);
		DropDown.clear();
		DropDown.sendKeys("pa");
		for(WebElement options:dropdownOptions) {
			if(options.getText().equalsIgnoreCase("Japan")) {
				options.click();
			}
		}
		String selectedValue1 = DropDown.getAttribute("value");
		System.out.println(selectedValue1);

		
	}
	@AfterTest
	public void Close() {
		//driver.close();
	}
}
