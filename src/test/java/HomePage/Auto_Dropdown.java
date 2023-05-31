package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Auto_Dropdown {

    public static void main(String[] args) throws InterruptedException {

        //1.User Launch Browser - Chrome-browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //2. User Open URL
        driver.get("https://www.google.com/");

        driver.findElements(By.xpath("//textarea[@id='APjFqb']")).clear();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        Thread.sleep(3000);
        List<WebElement> listofitems = driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
        System.out.println("Total number of items " + listofitems.size());

        for (int a = 0; a < listofitems.size(); a++) {

            String items = listofitems.get(a).getText();
            System.out.println(items);

            if (items.equals("selenium benefits")) {

                listofitems.get(a).click();
                break;

            }

        }
        Thread.sleep(2000);
        driver.quit();

    }

}
