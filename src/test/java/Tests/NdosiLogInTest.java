package Tests;

import Pages.LogInPage;
import Utils.Base;
import org.testng.annotations.Test;

public class NdosiLogInTest extends Base {

    @Test
    public void LoginTest() {
        HomePage.checkIfNdosiWebsiteIsLoaded();
        HomePage.clickHomeLoginButton();
        LogInPage.enterUsername("swmsomie@gmail.com");
        LogInPage.enterPassword("Siya@MsM87");
        LogInPage.clickLogInButton();

    }
}
