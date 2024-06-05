import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        List<WebElement> rows= driver.findElements(By.xpath("//div[text()='Static Table']/following-sibling::div/table/tbody/tr"));
        System.out.println("Number of rows in first table: "+rows.size());
        List<WebElement> columns= driver.findElements(By.xpath("//div[text()='Static Table']/following-sibling::div/table/tbody/tr[1]/td"));
        System.out.println("Number of columns in first table: "+columns.size());
        List<WebElement> thirdRow= driver.findElements(By.xpath("//div[text()='Static Table']/following-sibling::div/table/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cellValue:thirdRow){
            System.out.println(cellValue.getText());
        }
        String secondRowCellValue= driver.findElement(By.xpath("//div[text()='Static Table']/following-sibling::div/table/tbody/tr[2]/td[2]")).getText();
        System.out.println("Second row second cell value: "+secondRowCellValue);
        driver.close();
    }
}
