package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage {

    WebDriver driver;

    By username = By.id("login-email");
    By password = By.id("login-password");
    By loginButton = By.id("login-submit");

    public LogInPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).sendKeys("swmsomie@gmail.com");
    }

    public void enterPassword() {
        driver.findElement(password).sendKeys("Siya@MsM87");
    }
}
