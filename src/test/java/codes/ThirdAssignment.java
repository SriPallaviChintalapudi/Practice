//package codes;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import org.testng.annotations.AfterTest;
//
//public class ThirdAssignment {
//	WebDriver driver = new ChromeDriver();
//	@BeforeTest
//	public void OpenURL() {
//		driver.get("https://testpages.eviltester.com/styled/tag/table.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//	}
//	@Test
//	public void TestCase1() {
//		List<WebElement> List1 = driver.findElements(By.xpath("By.xpath(\"//table[@id='mytable']/tbody/tr[position()>1]"));
//		List<List<String>> tableData = new ArrayList<>();
//		for(WebElement list1:List1) {
//			List<WebElement> List2 = driver.findElements(By.xpath("./td"));
//			List<String> data = new ArrayList<>();
//			for(WebElement list2:List2) {
//				data.add(list2.getText());
//			}
//			tableData.add(data);
//		}
//		for(List<String> list2: tableData) {
//			System.out.println(list2);
//		}
//	}
//	@AfterTest
//	public void Close() {
//		driver.close();
//	}
//}

package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ThirdAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.eviltester.com/styled/tag/table.html"); // Replace with actual URL

        // XPath to get all rows except the header (starts from row 2)
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='mytable']/tbody/tr[position()>1]"));

        List<List<String>> tableData = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            List<String> rowData = new ArrayList<>();

            for (WebElement cell : cells) {
                rowData.add(cell.getText());
            }

            tableData.add(rowData);
        }

        // Print the extracted table data
        for (List<String> row : tableData) {
            System.out.println(row);
        }

    }
}




























