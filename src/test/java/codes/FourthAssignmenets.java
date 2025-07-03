

                                //Info : Assessment 4 - Rahul Shetty Table Data//

package codes;
import java.util.ArrayList;
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

public class FourthAssignmenets {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenURL() {
		driver.get("https://testpages.eviltester.com/styled/tag/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void TestCase2() {
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		//table[@id='product']//tr[position()>1]//td"
		List <WebElement> List2 = driver.findElements(By.xpath("//table[@class = 'table-display']//tr[position()>1]//td"));
		List<String> AllData = new ArrayList<>();
		System.out.println("Table2 Data is: ");
		for(WebElement list2 : List2) {
			AllData.add(list2.getText());
		}
		for(String AllData2 : AllData) {
			
			System.out.println(AllData2);
		}
	}

	@AfterTest
	public void CloseURL() {
		driver.close();
	}
}
