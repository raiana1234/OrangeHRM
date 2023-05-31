package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class CheckBox {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,document.body.scrollHeight/3)");

        // selecting single checkbox
//        driver.findElement(By.xpath("//input[@id='monday']")).click();
//        driver.findElement(By.xpath("//input[@id='tuesday']")).click();
        List<WebElement> allCheckboxItems = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println("Total number of days are: " + allCheckboxItems.size());

        //Select all the checkboxes
        for (int i = 0; i < allCheckboxItems.size(); i++) {
            allCheckboxItems.get(i).click();
        }

        Thread.sleep(2000);

        //Select single check box by x-path and click
        //driver.findElement(By.xpath("//input[@id='male']")).click();
//            In the provided code, the continue statement is used inside the for loop with the condition if (i==3 || i==4)
//        to skip the execution to the click() method for checkboxes at indexes 3 and 4
//        int a = 0;
//        if(a==3 || a==4){
//        }
        //allCheckboxItems.get(a).click();

        for (int x = 0; x < allCheckboxItems.size(); x++) {

            WebElement checkbox = allCheckboxItems.get(x);
            if (checkbox.isSelected() && (x != 3 && x != 6)) {
                checkbox.click();
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
