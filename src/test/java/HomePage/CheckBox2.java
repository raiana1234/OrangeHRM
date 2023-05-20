package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBox2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,document.body.scrollHeight/3)");

        List<WebElement> itemcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
        System.out.println("Total number of days are: "+ itemcheckbox.size());

        driver.findElement(By.id("female")).click();
        Thread.sleep(1000);

        // System.out.println(itemcheckbox.size());
        Thread.sleep(2000);
        for(WebElement checkbox : itemcheckbox){
            checkbox.click();
        }
        Thread.sleep(2000);
        for(WebElement checkbox : itemcheckbox){
            checkbox.click();
        }
        driver.quit();
    }
}
