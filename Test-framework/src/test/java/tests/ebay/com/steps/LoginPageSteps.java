package tests.ebay.com.steps;

import app.core.elements.ebay.com.pages.LoginPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static com.codeborne.selenide.Condition.visible;

@Log4j2
public class LoginPageSteps {
    private LoginPage loginPage;

    public LoginPageSteps() {
        loginPage = new LoginPage();
    }

    @Step("Enter user name.")
    public LoginPageSteps enterUserName(String userName) {
        log.info("Enter user name");
        loginPage.getUserNameFeld()
                .shouldBe(visible)
                .sendKeys(userName);

        return this;
    }

    @Step("Enter password.")
    public LoginPageSteps enterPassword(String password) {
        log.info("Enter password.");
        loginPage.getPasswordField()
                .shouldBe(visible)
                .sendKeys(password);

        return this;
    }

    @Step("Click on 'Sign in' button after entering valid data.")
    public HomePageSteps clickOnSignInButtonAfterEnteringValidData() {
        log.info("Click on 'Sign in' button after entering valid data.");
        loginPage.getSignInButton()
                .click();

        return new HomePageSteps();
    }

    @Step("Click on 'Sign in' button after entering invalid data.")
    public LoginPageSteps clickOnSignInButtonAfterEnteringInvalidData() {
        log.info("Click on 'Sign in' button after entering invalid data.");
        loginPage.getSignInButton()
                .click();

        return this;
    }

    @Step("Click on 'Sign in' button after entering click on 'Save for later' button.")
    public ShoppingCartPageSteps clickOnSignInButtonAfterClickOnSaveForLaterButton() {
        log.info("Click on 'Sign in' button after entering click on 'Save for later' button.");
        loginPage.getSignInButton()
                .click();

        return new ShoppingCartPageSteps();
    }

    @Step("Check login warning text.")
    public LoginPageSteps checkLoginWarningText(String expectedWarningText) {
        log.info("Check login warning text.");
        assertThat("Invalid warning text!", loginPage.getLoginWarning().shouldBe(visible).getText(), equalTo(expectedWarningText));

        return this;
    }
}
