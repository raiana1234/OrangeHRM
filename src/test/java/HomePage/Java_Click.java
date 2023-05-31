package HomePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Java_Click {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        // Clicking on JS Alert button
//        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//
//        //Clicking click for JS confirm button
//        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//
//       Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.dismiss();
//        Thread.sleep(3000);

        //Clicking on JS Prompt
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(2000);
        alert1.sendKeys("Welcome");


        driver.quit();


    }

}
