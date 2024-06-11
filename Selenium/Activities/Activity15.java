import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        driver.findElement(By.xpath("//div[text()='Sign in!']/parent::h2/following-sibling::div//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//div[text()='Sign in!']/parent::h2/following-sibling::div//input[@placeholder='Password']")).sendKeys("password");
        driver.findElement(By.xpath("//div[text()='Sign in!']/parent::h2/following-sibling::button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        String loginConfirm= driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login confirmation message: " + loginConfirm);
        driver.close();
    }
}
