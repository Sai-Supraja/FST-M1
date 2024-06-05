import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        WebElement inputField= driver.findElement(By.id("input-text"));
        System.out.println("Input field is enabled: "+inputField.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Input field is enabled: "+inputField.isEnabled());
        driver.close();
    }
}
