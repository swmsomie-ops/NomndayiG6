package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

    WebDriver driver;


    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app");
        Thread.sleep(2000);
    }
    @Test
    public void clickLogInButton() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }
    public void enterUsername() {
        driver.findElement(By.id("login-email")).sendKeys("swmsomie@gmail.com");
    }

    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("Siya@MsM87");
    }

    public void submitButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
        Thread.sleep(2000);
    }

    public void verifyLogInSuccess() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[3]")).isDisplayed();
    }

    public void teaDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
