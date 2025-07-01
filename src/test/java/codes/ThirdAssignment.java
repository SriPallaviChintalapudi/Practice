
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

        driver.get("https://testpages.eviltester.com/styled/tag/table.html");

        // XPath to get all rows except the header (starts from row 2)
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='mytable']/tbody/tr[position()>1]"));

        List<List<String>> tableData = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath("./td"));
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




























