import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity20 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("Text in the alert: " + promptAlertText);
        promptAlert.sendKeys("Awesome!");
        promptAlert.accept();
        driver.quit();
    }
}
