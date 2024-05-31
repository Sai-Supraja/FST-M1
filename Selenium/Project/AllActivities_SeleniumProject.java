package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AllActivities_SeleniumProject {
    public static void main(String[] args){
        List<String> accountNamesList= new ArrayList<String>();
        List<String> usersList= new ArrayList<String>();
        WebDriver driver= new ChromeDriver();

        //Activity1
        driver.get("https://alchemy.hguy.co/crm/");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println("The title of the page: "+title);
        Assert.assertEquals(title, "SuiteCRM");

        //Activity2
        String urlHeaderImage= driver.findElement(By.cssSelector("img[alt='SuiteCRM']")).getAttribute("src");
        System.out.println("Url of the header image: "+urlHeaderImage);

        //Activity3
        String firstCopyrightText= driver.findElement(By.id("admin_options")).getText();
        System.out.println("Copyright text in the footer: "+firstCopyrightText);

        //Activity4
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.cssSelector("input[title='Log In']")).click();
        String currentURL= driver.getCurrentUrl();
        if(currentURL.contains("Home")){
            System.out.println("Home page is opened");
        }
        else{
            System.out.println("User is not logged in");
        }

        //Activity5
        String navMenuColor= driver.findElement(By.cssSelector("nav[role='navigation'] .container-fluid")).getCssValue("color");
        System.out.println("Color of the navigation Menu: "+navMenuColor);

        //Activity6
        driver.findElement(By.xpath("//a[text()='Activities']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Activities']")).isEnabled();

        //Activity7
        driver.findElement(By.xpath("//a[text()='Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Sales']/following-sibling::ul//a[text()='Leads']")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]//span[@title='Additional Details']")));
        driver.findElement(By.xpath("//tr[1]//span[@title='Additional Details']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role='dialog'] .phone")));
        String leadInformationPhoneNumber= driver.findElement(By.cssSelector("div[role='dialog'] .phone")).getText();
        System.out.println("Lead information phone number: "+leadInformationPhoneNumber);

        //Activity8
        driver.findElement(By.xpath("//a[text()='Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Sales']/following-sibling::ul//a[text()='Accounts']")).click();
        WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr[@class='oddListRowS1']//td[@type='name']//a)[1]")));
        List<WebElement> accountNames= driver.findElements(By.xpath("//tr[contains(@class,'ListRowS1')]//td[@type='name']//a"));
        for (int i=0; i<5; i++) {
            String accountNameText = accountNames.get(i).getText();
            accountNamesList.add(accountNameText);
        }
        System.out.println("Account names of first 5 odd-numbered rows: " + accountNamesList);

        //Activity9
        driver.findElement(By.xpath("//a[text()='Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Sales']/following-sibling::ul//a[text()='Leads']")).click();
        WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tr[@class='oddListRowS1']//td[@type='name']//a)[1]")));
        //First 10 values in the 'name' column
        List<WebElement> accountNames1= driver.findElements(By.xpath("//tr[contains(@class,'ListRowS1')]//td[@type='name']//a"));
        for (int i=0; i<10; i++) {
            String accountNameText = accountNames.get(i).getText();
            accountNamesList.add(accountNameText);
        }
        System.out.println("First 10 values in the 'Name' column: " + accountNamesList);

        //First 10 values in the 'user' column
        List<WebElement> users= driver.findElements(By.xpath("//tr[contains(@class,'ListRowS1')]//td[@field='assigned_user_name']//a"));
        for (int i=0; i<10; i++) {
            String usersText = users.get(i).getText();
            usersList.add(usersText);
        }
        System.out.println("First 10 values in the 'User' column: " + usersList);
        driver.quit();
    }
}
