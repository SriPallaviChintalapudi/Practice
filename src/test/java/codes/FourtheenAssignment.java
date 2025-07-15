package codes;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class FourtheenAssignment {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void openURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLocations");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test(priority = 1)
    //login scenario
    public void TestCaseOne() throws InterruptedException {
        WebElement UserNameTextBox = driver.findElement(By.name("username"));
        //UserNameTextBox.click();
        UserNameTextBox.sendKeys("Admin");

        WebElement PasswordTextBox = driver.findElement(By.name("password"));
        PasswordTextBox.click();
        PasswordTextBox.sendKeys("admin123");

        WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]"));
        
        LoginBtn.submit();
    }
	@Test(priority = 2)
	
	//navigate to the admin page from the dashboard
	public void TestCaseTwoAdminPAge() {
		WebElement AdminPageLink = driver.findElement(By.xpath("//a[contains(@class,'main-menu-item')]//span[text()='Admin']"));
		
		
		//WebElement AdminPageLink = driver.findElement(By.xpath("//span[text()='Admin']/ancestor::a"));
		AdminPageLink.click();
	}
	
	@Test(priority = 3)
	public void TestCaseThree() {
		
		//To Select organization option
		WebElement OrganizationOption = driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and text()='Organization ']"));
		OrganizationOption.click();
		
		//To select Locations in dropdown
		WebElement LocationsItem = driver.findElement(By.linkText("Locations"));
		LocationsItem.click();
		WebElement ScrollDownBtn = driver.findElement(By.xpath("//div[text()='City']/div"));
		ScrollDownBtn.click();
		
		
		WebElement DescendingOption = driver.findElement(By.xpath("//div[text()='City']/following::span[text()='Descending'][1]"));
//		JavascriptExecutor Js = (JavascriptExecutor)driver;
//		Js.executeScript("arguments[0].scrollIntoView();",DescendingOption);
		
		Actions action =new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).click(DescendingOption).build().perform();
		//DescendingOption.click();
	}
}
