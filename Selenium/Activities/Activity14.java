import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        List<WebElement> rows= driver.findElements(By.xpath("//div[text()='Sortable Table']/following-sibling::div/table/tbody/tr"));
        System.out.println("Number of rows in second table: "+rows.size());
        List<WebElement> columns= driver.findElements(By.xpath("//div[text()='Sortable Table']/following-sibling::div/table/tbody/tr[1]/td"));
        System.out.println("Number of columns in second table: "+columns.size());
        String secondRowCellValue= driver.findElement(By.xpath("//div[text()='Sortable Table']/following-sibling::div/table/tbody/tr[2]/td[2]")).getText();
        System.out.println("Second row second column value: "+secondRowCellValue);
        driver.findElement(By.xpath("//div[text()='Sortable Table']/following-sibling::div/table/thead/tr/th[1]")).click();
        secondRowCellValue= driver.findElement(By.xpath("//div[text()='Sortable Table']/following-sibling::div/table/tbody/tr[2]/td[2]")).getText();
        System.out.println("Second row second column value after sorting: "+secondRowCellValue);
        List<WebElement> footerCellValues= driver.findElements(By.xpath("//div[text()='Sortable Table']/following-sibling::div/table/tfoot/tr/th"));
        for(WebElement cellValue:footerCellValues){
            System.out.println(cellValue.getText());
        }
        driver.close();
    }
}
