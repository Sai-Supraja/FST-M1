import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions builder= new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        driver.manage().window().maximize();
        System.out.println("The title of the page: "+driver.getTitle());
        //Drop in dropzone1
        WebElement source= driver.findElement(By.xpath("//img[contains(@src,'ball')]"));
        WebElement dropzone1Target= driver.findElement(By.xpath("//div[text()='Dropzone 1']"));
        builder.clickAndHold(source).dragAndDrop(source, dropzone1Target).release(source).build().perform();
        String droppedText=driver.findElement(By.xpath("//div[text()='Dropzone 1']/p")).getText();
        if(droppedText.equals("Dropped!")){
            System.out.println("Ball dropped in dropzone1");
        }
        //Drop in dropzone2
        WebElement dropzone1source= driver.findElement(By.xpath("//div[text()='Dropzone 1']"));
        WebElement dropzone2Target= driver.findElement(By.xpath("//div[text()='Dropzone 2']"));
        builder.clickAndHold(dropzone1source).dragAndDrop(dropzone1source, dropzone2Target).release(dropzone1source).build().perform();
        droppedText=driver.findElement(By.xpath("//div[text()='Dropzone 2']/p")).getText();
        if(droppedText.equals("Dropped!")){
            System.out.println("Ball dropped in dropzone2");
        }

        driver.close();
    }
}
