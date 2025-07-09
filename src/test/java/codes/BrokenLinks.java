package codes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BrokenLinks {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURl() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test
	public void TestCaseOne() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no of links: "+links.size());
		for(WebElement Link:links) {
			String url =Link.getAttribute("href"); 
			if(url== null || url.isEmpty()) {
				System.out.println("Empty or missing herf " +url);
			}
			try {
				URL urlLink = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();
				int ResponseCode = connection.getResponseCode();
				if(ResponseCode>=400) {
					System.out.println(ResponseCode + " Broken Link " +url);
				}
				else {
					System.out.println(ResponseCode + " Valid Code " +url);
				}
			}
			catch(Exception e){
				System.out.println("Exception : "+url);
			}
		}	
	}

}

