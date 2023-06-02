package HomePage;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Auto_DropDown3 {

    public static void main(String[] args) throws InterruptedException {

        //1. User Launch Browser - Chrome-Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //2. User Open URL
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("candle" );
        Thread.sleep(3000);
        List<WebElement> listofitems = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        System.out.println("Total number of items: "+ listofitems.size());

        for(int i=0; i<listofitems.size(); i++){

            String items=listofitems.get(i).getText();
            System.out.println(items);

            if(items.equals("Candle Warmer")){


                listofitems.get(i).click();
                break;
            }

        }
        Thread.sleep(3000);
        driver.quit();
    }
}
