import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions builder= new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/input-events");
        driver.manage().window().maximize();
        System.out.println("The title of the page: "+driver.getTitle());
        builder.click().pause(1000).build().perform();
        String diceFrontText= driver.findElement(By.cssSelector("#D3Cube .active h1")).getText();
        System.out.println("Dice front side text: "+diceFrontText);
        builder.doubleClick().pause(1000).build().perform();
        diceFrontText= driver.findElement(By.cssSelector("#D3Cube .active h1")).getText();
        System.out.println("Dice front side text: "+diceFrontText);
        builder.contextClick().pause(1000).build().perform();
        diceFrontText= driver.findElement(By.cssSelector("#D3Cube .active h1")).getText();
        System.out.println("Dice front side text: "+diceFrontText);
        driver.close();
    }
}
