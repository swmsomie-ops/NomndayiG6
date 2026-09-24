package Utils;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class Base {

    static final WebDriver driver = BrowserFactory.startBrowser("Chrome", "//https://ndosisimplifiedautomation.vercel.app");
    public HomePage HomePage = new HomePage(driver);
}
