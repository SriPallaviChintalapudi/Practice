package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThirdRegistrationForm {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void BeforeTest() {
		driver.get("https://onecompiler.com/html/43mmygbsw");
		driver.manage().window().maximize();
	}
	@Test
	public void TestCase1() throws InterruptedException {
		WebElement RunBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[1]/div[3]/button[4]"));
		RunBtn.click();
		Thread.sleep(3000);
		driver.switchTo().frame("ResultBrowserIframe");
		Thread.sleep(2000);
		WebElement FirstName = driver.findElement(By.id("name"));
		FirstName.click();
		FirstName.sendKeys("Pallavi");
		
		WebElement LastNAme= driver.findElement(By.id("lastname"));
		LastNAme.click();
		LastNAme.sendKeys("Chintalapudi");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.click();
		Password.sendKeys("HI");
		
		WebElement confirmPassword = driver.findElement(By.id("confirm"));
		confirmPassword.click();
		confirmPassword.sendKeys("HI");
		
		WebElement email = driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("Hi@123");
		
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.click();
		mobile.sendKeys("969693692");
		
		WebElement Address = driver.findElement(By.xpath("/html/body/form/input[7]"));
		Address.click();
		Address.sendKeys("969693692");
		
		WebElement Gender = driver.findElement(By.id("female"));
		Gender.click();
		
		WebElement sports = driver.findElement(By.id("a"));
		sports.click();
		
		WebElement dob = driver.findElement(By.id("dob"));
		dob.sendKeys("2002-03-28");
		
		WebElement country = driver.findElement(By.id("country"));
		Select select = new Select(country);
		select.selectByVisibleText("India");
		
		WebElement fileupload = driver.findElement(By.id("fileupload"));
		String FilePath = "C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll\\img3.jpeg";
		fileupload.sendKeys(FilePath);
		
		WebElement RegisterBtn = driver.findElement(By.id("submit"));
		RegisterBtn.submit();
		
		System.out.println("Registed successfully");
		
		
	}
	@AfterTest
	public void AfterTest() {
		driver.close();
	}
}
