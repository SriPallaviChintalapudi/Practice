

//shadow root element in https://practice.expandtesting.com/shadowdom and https://www.htmlelements.com/demos/menu/shadow-dom/index.htm


package codes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EleventhAssignment {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenURL() {
		driver.get("https://practice.expandtesting.com/shadowdom");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test(priority=1)
	public void TestCase1() {
		driver.switchTo().frame("aswift_2");
		
		//document.querySelector('#shadow-host').shadowRoot.querySelector('#my-btn')
		//document.querySelector('#shadow-host').shadowRoot.querySelector('button[id="my-btn"]')
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement FileBtn = (WebElement)
	}
	
	@Test
	public void Testcase2() {
		driver.navigate().to("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		//document.querySelector(".smart-ui-component").shadowRoot.querySelector("#menuItemsGroupd5cd")
		//document.querySelector(".smart-ui-component").shadowRoot.querySelector("[id='menuItemsGroupd5cd']")
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement FileBtn = (WebElement) (js).executeScript(null, null)
	}
}
