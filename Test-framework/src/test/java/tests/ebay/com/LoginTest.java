package tests.ebay.com;

import app.core.test_data.EbayDataProvider;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.ebay.com.steps.HomePageSteps;

@Log4j2
public class LoginTest extends BaseTest {
    private HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Login with valid credentials.",
            dataProvider = "valid_credentials", dataProviderClass = EbayDataProvider.class)
    public void loginWithValidCredentialsTest(String email, String password, String username) {
        homePageSteps.openPage()
                .clickOnSignInLink()
                .enterUserName(email)
                .enterPassword(password)
                .clickOnSignInButtonAfterEnteringValidData()
                .checkLoggedUserName(username);
    }

    @Test(description = "Login with invalid password.",
            dataProvider = "invalid_credentials", dataProviderClass = EbayDataProvider.class)
    public void loginWithValidInvalidPasswordTest(String email, String password, String errorMessage) {
        homePageSteps.openPage()
                .clickOnSignInLink()
                .enterUserName(email)
                .enterPassword(password)
                .clickOnSignInButtonAfterEnteringInvalidData()
                .checkLoginWarningText(errorMessage);
    }

}
