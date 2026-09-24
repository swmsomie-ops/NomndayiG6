package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dashboard {

    WebDriver driver;

    By dashboard_xpath = By.xpath("//*[@id=\"app-main-content\"]");
    By menu_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]");
    By logout_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]/span[2]");

    public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyLoginWasSuccessful() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(dashboard_xpath));
        driver.findElement(dashboard_xpath).isDisplayed();
    }

    public void clickMenu() {
        driver.findElement(menu_xpath).click();
    }

    public void clickLogout() {
        driver.findElement(logout_xpath).click();
    }

    public void ArletcloseWindow() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        Arlet arlet = driver.switchTo().alert();
        arlet.accept();
    }
}
