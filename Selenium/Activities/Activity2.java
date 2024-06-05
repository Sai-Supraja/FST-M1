import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        driver.manage().window().maximize();
        System.out.println("The title of the page: "+driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String confirmationMessage=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login confirmation message: "+confirmationMessage);
        driver.close();
    }
}
