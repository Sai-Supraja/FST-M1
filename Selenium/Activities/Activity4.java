import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        driver.manage().window().maximize();
        System.out.println("The title of the page: "+driver.getTitle());
        String thirdHeader= driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header text: "+thirdHeader);
        String fifthHeaderColor= driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println("Color of fifth header: "+fifthHeaderColor);
        String violetButtonClasses= driver.findElement(By.cssSelector(".ui.violet.button")).getAttribute("class");
        System.out.println("Classes of violet button: "+violetButtonClasses);
        String greyButtonText= driver.findElement(By.cssSelector(".ui.grey.button")).getText();
        System.out.println("Grey button text: "+greyButtonText);
        driver.close();
    }
}
