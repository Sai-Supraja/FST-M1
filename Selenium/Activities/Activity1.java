import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://v1.training-support.net/");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println("The title of the Home page: "+title);
        driver.findElement(By.cssSelector("#about-link")).click();
        WebElement header= driver.findElement(By.xpath("//h1[text()='About Us']"));
        if(header.isDisplayed())
        {
            System.out.println("The title of the about us page: "+driver.getTitle());
        }
        else{
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='About Us']")));
            System.out.println("The title of the about page: "+driver.getTitle());
        }
        driver.close();
    }
}
