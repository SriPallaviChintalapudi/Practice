package codes;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
public class ThirtheenAssignment {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void openURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		//Search for the country name
		WebElement SelectCountry = driver.findElement(By.xpath("//div[@class=\"oxd-select-text--after\"]"));
		SelectCountry.click();
		
		//Select the Country India
		WebElement OptionPAkistan = driver.findElement(By.xpath("//div[@role='option' ]/span[text()='Pakistan']"));
		OptionPAkistan.click();
		
		//Click on the Search btn
		WebElement SearchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		SearchBtn.click();
		
		//verify that the pakistan is not having any values
		WebElement SearchResult = driver.findElement(By.xpath("//span[text()='No Records Found']"));
		String ExpectedResultText = SearchResult.getText();
		String actualResultText = "No Records Found";
		Assert.assertEquals(actualResultText, ExpectedResultText,"Not matched");
		
		WebElement AddBtn = driver.findElement(By.xpath("//button[contains(@class,'oxd-button') and normalize-space()='Add']"));
		AddBtn.click();
		
	}
	
	@Test(priority=4)
	public void TestCaseFour() {
		
		WebElement NameTxt = driver.findElement(By.xpath("//label[contains(text(),'Name')]/ancestor::div[contains(@class,'oxd-input-group')]//input"));
		NameTxt.click();
		NameTxt.sendKeys("Pallavi");
		
		//Search for the country name
		WebElement SelectCountry = driver.findElement(By.xpath("//div[@class=\"oxd-select-text--after\"]"));
		SelectCountry.click();
				
		//Select the Country India
		WebElement OptionPakistan = driver.findElement(By.xpath("//div[@role='option' ]/span[text()='Pakistan']"));
		OptionPakistan.click();
		
		//SaveBtn
		WebElement SaveBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		SaveBtn.submit();
		
		
	}
	@Test(priority=5)
	public void TestCaseFive() {
		//driver.navigate().refresh();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	    //driver.navigate().refresh();

	    // Wait and click on the country dropdown
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    WebElement CheckCountry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oxd-select-text--after']")));
	    
	    //WebElement CheckCountry = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
	   //actions.moveToElement(CheckCountry).click().build().perform();
	    
	    js.executeScript("arguments[0].click();", CheckCountry);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']")));

	    
	    // Wait for the option "Pakistan" to appear and click it
	    WebElement optionPakistan2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='option']/span[text()='Pakistan']")));
	    
	    optionPakistan2.click();

	    // Wait for the search button and click it
	    WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	    searchBtn.click();
	    
	   // driver.close();
	}
	
}
