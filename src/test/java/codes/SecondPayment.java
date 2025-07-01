package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class SecondPayment {
	
	WebDriver driver = new EdgeDriver();
	
	@BeforeTest
	public void BeforeTest() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	 @Test(priority =  0)
	    public void TestCase5() throws InterruptedException {
	    	WebElement Signup = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/a"));
	    	Signup.click();
	    	
	    	WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]"));
	    	TextBox.click();
	    	TextBox.sendKeys("6309497735");
	    	
	    	
	    	WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input"));
	    	btn1.submit();
	    	
	    	
	    	WebElement PasswordTxtBox = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	    	PasswordTxtBox.click();
	    	PasswordTxtBox.sendKeys("Pallavi.28");
	    	
	    	
	    	WebElement Btn2 = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
	    	Btn2.submit();
	    	
	    	WebElement Cart = driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
	    	Cart.click();
	    	
	    	WebElement ProceedToBuyBtn = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
	    	ProceedToBuyBtn.click();
	    	Thread.sleep(3000);
	    	
//	    	WebElement AddressSelectionBtn = driver.findElement(By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]/span/input"));
//	    	AddressSelectionBtn.click();
//	    	
//	    	driver.switchTo().frame(0);
	    	WebElement PaymentMethodSelection = driver.findElement(By.name("ppw-instrumentRowSelection"));
	    	PaymentMethodSelection.click();
	    	Thread.sleep(5000);
	    	
//	    	WebElement UPITextBox = driver.findElement(By.name("__sif_encryptedVPA_collect"));
//	    	Thread.sleep(2000);
//	    	UPITextBox.click();
//	    	UPITextBox.sendKeys("6309497735@ybl");
//	    	
//	    	WebElement VerifyBtn = driver.findElement(By.xpath("//*[@id=\"pp-2JosDq-130\"]/span/input"));
//	    	VerifyBtn.click();
//	    	Thread.sleep(5000);
//	    	
	    	WebElement ConfirmPayment = driver.findElement(By.xpath("//*[@id=\"checkout-primary-continue-button-id\"]/span/input"));
	    	ConfirmPayment.click();
	    	Thread.sleep(3000);
	    	WebElement PayNowBtn = driver.findElement(By.xpath("//*[@id=\"placeOrder\"]"));
	    	PayNowBtn.click();
}

@AfterTest
public void AfterTest() {
	driver.close();
	
}
}