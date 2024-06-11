import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        driver.findElement(By.id("confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("Text in the alert: " + confirmAlertText);
        confirmAlert.accept();
        //confirmAlert.dismiss();
        driver.quit();
    }
}
