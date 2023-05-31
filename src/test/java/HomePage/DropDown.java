package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement iteamForDropdown = driver.findElement(By.className("col-lg-3"));
        Select select = new Select(iteamForDropdown);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//option[@value='Google']")).click();
        Thread.sleep(3000);

//        WebElement iteamForDropdown = driver.findElement(By.id("animals"));
//        Select select1 = new Select(iteamForDropdown);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//option[@value='avatar']")).click();
//        Thread.sleep(2000);

        driver.quit();


    }


}
