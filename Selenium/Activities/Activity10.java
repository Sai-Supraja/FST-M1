import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        WebElement checkbox= driver.findElement(By.name("toggled"));
        System.out.println("Checkbox is displayed: "+checkbox.isDisplayed());
        driver.findElement(By.xpath("//button[text()='Remove checkbox']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("toggled")));
        System.out.println("Checkbox is displayed: "+checkbox.isDisplayed());
        driver.close();
    }
}
