package Tests;

import Pages.Dashboard;
import Pages.LogInPage;
import Utils.Base;
import org.testng.annotations.Test;

public class NdosiLogInTest extends Base {

    @Test
    public void LoginTest() {
        HomePage.checkIfNdosiWebsiteIsLoaded();
        HomePage.clickHomeLoginButton();
        logInPage.enterUsername();
        logInPage.enterPassword();
        dashboard.verifyLoginWasSuccessful();
    }
}
