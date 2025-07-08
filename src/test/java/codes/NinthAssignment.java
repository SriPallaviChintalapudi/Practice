



                  //WindowHandle in new tabs in RahulShetty


package codes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NinthAssignment {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	@Test
	public void Testcase1() {
		String BackToParentWindow = driver.getWindowHandle();
		
		
//		for(String ChildWindowHandle:driver.getWindowHandles()) {
//			driver.switchTo().window(ChildWindowHandle);
//		}
		WebElement OpenTab = driver.findElement(By.id("opentab"));
		OpenTab.click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			 if (!windowHandle.equals(BackToParentWindow)) {
			 driver.switchTo().window(windowHandle);
			 break;
			 }
		}
		
		
		WebElement CoursesOption = driver.findElement(By.linkText("Courses"));
		CoursesOption.click();
		
		driver.switchTo().window(BackToParentWindow);
	}
}
