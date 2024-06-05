import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions builder= new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/input-events");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        builder.sendKeys("S").build().perform();
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        driver.close();
    }
}
