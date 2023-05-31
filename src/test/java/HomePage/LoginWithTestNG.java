package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginWithTestNG {
    WebDriver driver;

    @Test(priority = 0)
    void openApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }

    @Test(priority = 1)
    void logIn() {

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//        String actual = driver.getTitle();
//        String expected = "Practice Page";
//        Assert.assertEquals(actual, expected);


    }
    @Test(priority = 2)
    void browserClose() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();


    }
}
