import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/ajax");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        driver.findElement(By.cssSelector("button.violet")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        String helloHeaderText=driver.findElement(By.tagName("h1")).getText();
        System.out.println("Header message: "+helloHeaderText);
        WebElement headerMessage=driver.findElement(By.tagName("h3"));
        System.out.println("Delayed text message: "+headerMessage.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"),"I'm late!"));
        String lateMessage=driver.findElement(By.tagName("h3")).getText();
        System.out.println("Late text message: "+lateMessage);
        driver.close();
    }
}
