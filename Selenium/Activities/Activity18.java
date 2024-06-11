import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity18 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/selects");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        WebElement selectElement= driver.findElement(By.id("multi-select"));
        Select multiSelect= new Select(selectElement);
        multiSelect.selectByVisibleText("Javascript");
        for(int i=4;i<=6;i++) {
            multiSelect.selectByIndex(i);
        }
        multiSelect.selectByValue("node");
        List<WebElement> selectedOptions= multiSelect.getAllSelectedOptions();
        System.out.println("List of selected options before deselecting: ");
        for(WebElement option:selectedOptions){
            System.out.println(option.getText());
        }
        multiSelect.deselectByIndex(5);
        selectedOptions= multiSelect.getAllSelectedOptions();
        System.out.println("List of selected options after deselecting: ");
        for(WebElement option:selectedOptions){
            System.out.println(option.getText());
        }
        driver.close();
    }
}
