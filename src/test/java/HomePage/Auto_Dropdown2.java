package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Auto_Dropdown2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("candle");
        Thread.sleep(3000);
        List<WebElement> listofitems = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        System.out.println("Total number of items " + listofitems.size());

        int d;
        for (d = 0; d < listofitems.size(); d++) ;

        String items = listofitems.get(d).getText();
        System.out.println(items);

        if (items.equals("candle warmer")) {

            listofitems.get(d).click();


        }


    }


}
