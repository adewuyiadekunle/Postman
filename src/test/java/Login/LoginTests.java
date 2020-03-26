package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests{
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://identity.getpostman.com/login?addAccount=1");
        Thread.sleep(7000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.findElement(By.name("username")).sendKeys("adewuyi.adekunle@gmail.com");
        driver.findElement(By.id("password")).sendKeys("arikemi4171");
        driver.findElement(By.xpath("//button[@id='sign-in-btn']")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
















    }


}
