package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
        driver.findElement(username_id).sendKeys("swmsomie@gmail.com");
    }

    public void enterPassword() {
        driver.findElement(password_id).sendKeys("Siya@MsM87");
    }
}
