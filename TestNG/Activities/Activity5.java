package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeTest(alwaysRun= true)
    public void beforeMethod(){
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"HeaderTests", "ButtonTests"})
    public void pageTitle() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test(dependsOnMethods = {"pageTitle"}, groups = {"HeaderTests"})
    public void headerTests1(){
        WebElement thirdHeader =driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(thirdHeader.getText(), "Third header");
    }

    @Test(dependsOnMethods = {"pageTitle"}, groups = {"HeaderTests"})
    public void headerTests2(){
        WebElement fifthHeader = driver.findElement(By.cssSelector("h5.green"));
        Assert.assertEquals(fifthHeader.getCssValue("color"), "rgb(33, 186, 69)");
    }

    @Test(dependsOnMethods = {"pageTitle"}, groups = {"ButtonTests"})
    public void buttonTests1(){
        WebElement oliveButton = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(oliveButton.getText(), "Olive");
    }

    @Test(dependsOnMethods = {"pageTitle"}, groups = {"ButtonTests"})
    public void buttonTests2(){
        WebElement brownButton = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(brownButton.getCssValue("color"), "rgb(255, 255, 255)");
    }

    @AfterTest(alwaysRun= true)
    public void afterMethod() {
        driver.quit();
    }
}
