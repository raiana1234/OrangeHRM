package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Auto_Drop_Down4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=589152046215&hvpos=&hvnetw=g&hvrand=14040786408225375129&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9060568&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_14580410");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
        Thread.sleep(3000);
        List <WebElement> listofitems = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
        System.out.println("Total number of items "+ listofitems.size());

        for(int a=0; a < listofitems.size(); a++){

            String items = listofitems.get(a).getText();
            System.out.println(items);

            if(items.equals("iphone 13 case")){

                listofitems.get(a).click();
                break;




            }

        }
        Thread.sleep(3000);
        driver.quit();

    }


}
