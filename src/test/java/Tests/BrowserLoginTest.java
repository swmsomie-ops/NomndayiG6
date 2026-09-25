package Tests;

import Utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserLoginTest {

    WebDriver driver;
    WebDriverWait wait;
    private static final String BASE_URL = "https://ndosisimplifiedautomation.vercel.app";
    private  static final String VALID_EMAIL = "swmsomie@gmail.com";
    private static final String VALID_PASSWORD = "Siya@MsM87";

    @BeforeTest
    public void setup() {
        driver = BrowserFactory.startBrowser("chrome", BASE_URL);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testLoginButtonVisible() {
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")));
    }
}
