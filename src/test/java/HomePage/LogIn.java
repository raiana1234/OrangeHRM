package HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
* 1. User Launch Browser - Chrome-browser
* 2. User Open URL - https://www.instagram.com/accounts/login/
* 3. User Provide username - azkaraeleah1234
* 4. User Provide password - Az78967123
* 5. User Click on login button
* 6. User Verify the title of dashboard page. Exp title: Instagram
* 7. User Close Browser
* */
public class LogIn {
    public static void main(String[] args) throws InterruptedException {



        // 1. User Launch Browser - Chrome-browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();

//       // 2. User Open URL - https://www.instagram.com/accounts/login/
//        driver.get("https://www.instagram.com/accounts/login/");
//        Thread.sleep(5000);

//        // 3. User Provide username - azkaraeleah1234
//        driver.findElement(By.name("username")).sendKeys("azkaraeleah1234");

//        // 4. User Provide password - Az78967123
//        driver.findElement(By.name("password")).sendKeys("Az78967123");

//        // 5. User Click on login button
//        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();

//        // 6. User Verify the title of dashboard page. Exp title: Instagram
//        String title= driver.getTitle();
//        System.out.println("This title is capture after login from the dashboard page:" +title);

//        // 7. User Close Browser
//        driver.quit();

        // 1. User Launch Browser - Chrome-browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // 2. User Open URL - https://www.instagram.com/accounts/login/
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

//        // 3. User Provide username - azkaraeleah1234
        driver.findElement(By.name("email")).sendKeys("raianarazzaq@hotmail.com");
//
        // 4. User Provide password - Az78967123
        driver.findElement(By.name("pass")).sendKeys("Rr78967123");

        // 5. User Click on login button
        driver.findElement(By.xpath("//button[@name='login']")).click();

        // 6. User Verify the title of dashboard page. Exp title: Instagram
        String title= driver.getTitle();
        System.out.println("This title is capture after login from the dashboard page:" +title);

        // 7. User Close Browser
        driver.quit();


        // 1. User Launch Browser - Chrome-browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();

        // 2. User Open URL - https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(3000);

        // 3. User Provide username - Admin
//        driver.findElement(By.name("username")).sendKeys("Admin");
        // driver.findElement(By.className("oxd-input oxd-input--active"));
        // Absolute Xpath/ Full Xpath /html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
        // Relative Xpath/Partial Xpath //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input

        // 4. User Provide password - admin123
//        driver.findElement(By.name("password")).sendKeys("admin123");

        // 5. User Click on login button
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        // 6. User Verify the title of dashboard page. Exp title: OrangeHRM
//        String title= driver.getTitle();
//        System.out.println("This title is capture after login from the dashboard page:" +title);

        // 7. User Close Browser
//        driver.quit();









    }


}
