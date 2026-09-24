package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    By verifyHomePage_xpath = By.xpath("//div[@class='nav-items']/button/span[contains(text(),'Home'))");
    By mainLogInButton_xpath = By.xpath("//div[@class='nav-user-section')");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void confirmIfNdosiWebsiteIsLoaded() {
        new WebDriver(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(verifyHomePage_xpath));
        driver.findElement(verifyHomePage_xpath).isDisplayed();
    }

    public void clickHomeLogInButton() {
        driver.findElement(mainLogInButton_xpath).click();
    }

}
