import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        WebElement checkbox= driver.findElement(By.name("toggled"));
        System.out.println("Checkbox is selected: "+checkbox.isSelected());
        checkbox.click();
        System.out.println("Checkbox is selected: "+checkbox.isSelected());

        driver.close();
    }
}
