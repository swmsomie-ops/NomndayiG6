package Utils;

import ExtentReports.Listener;
import Pages.Dashboard;
import Pages.HomePage;
import Pages.LogInPage;
import com.aventstack.extentreports.model.Test;
import org.openqa.selenium.WebDriver;

public class Base {

    static final WebDriver driver = BrowserFactory.startBrowser("Chrome", "//https://ndosisimplifiedautomation.vercel.app");
    public HomePage HomePage = new HomePage(driver);
    public LogInPage logInPage = new LogInPage(driver);
    public Dashboard dashboard = new Dashboard(driver);
    public Listener listener = new Listener();

}
