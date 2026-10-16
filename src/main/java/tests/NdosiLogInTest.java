package tests;

import org.openqa.selenium.WebDriver;
import utils.Base;
import org.junit.AfterClass;
import org.testng.annotations.Test;

public class NdosiLogInTest extends Base {

    @Test
    public void LoginTest() {
        HomePage.checkIfNdosiWebsiteIsLoaded();
        HomePage.clickHomeLoginButton();
        logInPage.enterUsername();
        logInPage.enterPassword();
        dashboard.verifyLoginWasSuccessful();
        dashboard.clickMenu();
        dashboard.clickLogout();
        dashboard.AlertcloseWindow();
    }
    @AfterClass
    public void tearDown() {
        WebDriver driver = null;
    }
}
