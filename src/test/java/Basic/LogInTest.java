package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest {

    WebDriver driver;

    @BeforeTest
    public void Setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(2000);
    }

    @Test
    public  void clickLogInTest() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }

    @Test(dependsOnMethods = "clickLogInTest")
    public void enterUsername() {
        driver.findElement(By.id("login-email")).sendKeys("swmsomie@gmail.com");
    }

    @Test(dependsOnMethods = "enterUsername")
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("Siya@MsM87");
    }

    @Test(dependsOnMethods = "enterPassword")
    public void clickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickSubmitButton")
    public void verifyLogInSuccess() {
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[3]")).isDisplayed();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
