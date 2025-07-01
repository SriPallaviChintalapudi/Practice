package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterTest;

import java.util.List;

public class First {

    EdgeDriver driver = new EdgeDriver();

    @BeforeTest
    public void setup() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void testcase() {
    	driver.navigate().to("https://www.amazon.in/");
    	
    }
    @Test(priority = 1)
    public void TestCase1() {
    	SoftAssert softAssert = new SoftAssert();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        softAssert.assertEquals(actualTitle, expectedTitle, "This doesn't match");
    }

    @Test(priority = 2)
    public void TestCase2() throws InterruptedException {
        WebElement freshBtn = driver.findElement(By.xpath("//*[@id='nav-link-groceries']/button"));
        freshBtn.click();
        Thread.sleep(1000);
        WebElement dropDownOption = driver.findElement(By.xpath("//*[@id='nav-flyout-groceries']//a[contains(text(),'Shop all groceries on Amazon')]"));
        dropDownOption.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @Test(priority = 3)
    public void TestCase3() throws InterruptedException {
        WebElement freshBtn = driver.findElement(By.xpath("//*[@id='nav-link-groceries']/button"));
        freshBtn.click();
        Thread.sleep(1000);

        List<WebElement> options = driver.findElements(By.xpath("//*[@id='nav-flyout-groceries']//a"));
        System.out.println("Dropdown Options:");
        for (WebElement option : options) {
            System.out.println(option.getText().trim());
        }
    }
    @Test(priority = 4)
    public void TestCase4() throws InterruptedException {
    	WebElement AccountAndListsBtn = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
    	AccountAndListsBtn.click();
    	Thread.sleep(1000);
    	
    	List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"nav-al-wishlist\"]"));
    	for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
   @Test(priority = 5)
   public void TestCase5() {
	   List<WebElement> ParialLinks  = driver.findElements(By.partialLinkText("Amazon"));
	   for(WebElement Links:ParialLinks) {
	   }
	   System.out.println("Number of partialLinks: "+ParialLinks.size());
   }
    @AfterTest
    public void AfterTest() {
    	driver.close();
    }
}
