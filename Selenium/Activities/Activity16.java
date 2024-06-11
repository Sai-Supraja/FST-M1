import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        driver.findElement(By.xpath("//div[text()='Sign Up!']/parent::h2/following-sibling::div//input[@placeholder='Username']")).sendKeys("adminuser");
        driver.findElement(By.cssSelector("input[class$='password']")).sendKeys("password");
        driver.findElement(By.xpath("(//label[text()='Confirm Password']/following::input[@placeholder='Password'])[1]")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("adminuser@gmail.com");
        driver.findElement(By.xpath("//div[text()='Sign Up!']/parent::h2/following-sibling::button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        String loginConfirm= driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login confirmation message: " + loginConfirm);

        driver.close();
    }
}
