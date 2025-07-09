
                          //Info : Assessment3 - Test Pages X paths//


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

public class ThirdAssignmenet {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenURL() {
		driver.get("https://testpages.eviltester.com/styled/tag/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void TestCase1() {
	        List<WebElement> data = driver.findElements(By.xpath("//table[@id='mytable']//tr[position()>1]/td"));
	        List<String> completedata = new ArrayList<>();
	        System.out.println("Table1 Data is: ");
	        for (WebElement DATA : data) {
	        	completedata.add(DATA.getText());
	        } 
	        for (String COMPLETEDATA : completedata) {
	        	
	            System.out.println(COMPLETEDATA);
	        }
	    }
	
	

	@AfterTest
	public void CloseURL() {
		driver.close();
	}
}
