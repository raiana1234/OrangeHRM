package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='HTML']")).click();
        driver.findElement(By.xpath("//input[@value='CSS']")).click();
        List <WebElement> listofdropdown = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//label"));

        Thread.sleep(2000);

        System.out.println(listofdropdown.size());
        //Selecting all the checkbox using enhance loop
        for(WebElement clickallcheckbox : listofdropdown){
            clickallcheckbox.click();

            System.out.println(clickallcheckbox.getText());
        }

        for(WebElement clickallcheckbox : listofdropdown){
            clickallcheckbox.click();

            System.out.println(clickallcheckbox.getText());
        }
//        driver.findElement(By.xpath("//input[@value='Angular']")).click();
        Thread.sleep(3000);
        driver.quit();
    }



}
