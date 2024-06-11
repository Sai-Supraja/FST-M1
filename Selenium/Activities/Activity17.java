import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        driver.manage().window().maximize();
        System.out.println("The title of the page: " + driver.getTitle());
        WebElement dropdown= driver.findElement(By.id("single-select"));
        Select select= new Select(dropdown);
        select.selectByVisibleText("Option 2");
        System.out.println("Second option: "+select.getFirstSelectedOption().getText());
        select.selectByIndex(3);
        System.out.println("Third option: "+select.getFirstSelectedOption().getText());
        select.selectByValue("4");
        System.out.println("Fourth option: "+select.getFirstSelectedOption().getText());
        List<WebElement> allOptions= select.getOptions();
        System.out.println("List of options in the dropdown: ");
        for(WebElement option:allOptions){
            System.out.println(option.getText());
        }
        driver.close();
    }
}
