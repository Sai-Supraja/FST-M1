import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        WebElement toggleButton= driver.findElement(By.id("toggleCheckbox"));
        toggleButton.click();
        WebElement dynamicCheckbox= driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(dynamicCheckbox));
        toggleButton.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicCheckbox));
        driver.findElement(By.name("toggled")).click();
        driver.close();
    }
}
