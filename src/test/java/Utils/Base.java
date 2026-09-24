package Utils;

import Pages.HomePage;
import Pages.LogInPage;
import org.openqa.selenium.WebDriver;

public class Base {

    static final WebDriver driver = BrowserFactory.startBrowser("Chrome", "//https://ndosisimplifiedautomation.vercel.app");
    public HomePage HomePage = new HomePage(driver);
    public LogInPage logInPage = new LogInPage(driver);
}
