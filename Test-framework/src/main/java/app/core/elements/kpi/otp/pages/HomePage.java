package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertTrue;

@Log4j2
public class HomePage extends BasePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
    private ElementsCollection aboutUsSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[1]/li/a");
    private SelenideElement departmentTodayEn = $x("(//nav[@id='site-navigation']//ul/li/a)[2]");
    private SelenideElement logo = $x("//img[@id='sc_logo']");
    private SelenideElement copyright = $x("//div[contains(@class,'left')]");
    private SelenideElement contactUs = $x("//div[@id='footer-callout']//a");

    @Step
    public TeachersPage clickOnTeachersLink(int linkNumber) {
        log.info("Click on 'Teachers' link.");
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return page(TeachersPage.class);
    }

    @Step
    public EmploymentPage clickOnEmploymentLink(int linkNumber) {
        log.info("Click on 'Employment' link.");
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return page(EmploymentPage.class);
    }

    @Step
    public ContactsPage clickOnContactsLink(int linkNumber) {
        log.info("CLick on 'Contacts' link.");

        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        aboutUsSubMenus.get(3)
                .shouldBe(visible)
                .click();
        return page(ContactsPage.class);
    }

    @Step
    public DepartmentTodayPage clickOnDepartmentTodayLink(int linkNumber) {
        log.info("Click on 'Department today' link.");
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        aboutUsSubMenus.get(1)
                .shouldBe(visible)
                .click();
        return page(DepartmentTodayPage.class);
    }

    @Step
    public DepartmentTodayPage clickOnDepartmentTodayLinkInEnVersion(int linkNumber) {
        log.info("Click on 'Department today' link in En version.");
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        departmentTodayEn.shouldBe(visible)
                .click();
        return page(DepartmentTodayPage.class);
    }

    @Step
    public HomePage returnToHomePage() {
        log.info("Return to home page.");
        logo.shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public HomePage changeLanguageToEnglish(int linkNumber) {
        log.info("Change language to English.");
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        headerFragment.getEnglishLanguage()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public HomePage changeLanguageToUkrainian(int linkNumber) {
        log.info("Change language to Ukrainian.");
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        headerFragment.getUkrainianLanguage()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public SearchResultPage enterValidDataToSearchFragment(String validData) {
        log.info("Enter valid data to search fragment.");
        headerFragment.getSearch()
                .shouldBe(visible)
                .setValue(validData)
                .pressEnter();
        return page(SearchResultPage.class);
    }

    @Step
    public SearchResultPage enterInvalidDataToSearchFragment(String invalidData) {
        log.info("Enter invalid data to search fragment.");
        headerFragment.getSearch()
                .shouldBe(visible)
                .setValue(invalidData)
                .pressEnter();
        return page(SearchResultPage.class);
    }

    @Step
    public HomePage checkCopyrightInfo(String expectedCopyright) {
        log.info("Check copyright info.");
        copyright.shouldBe(visible)
                .shouldHave(text(expectedCopyright));
        return page(HomePage.class);
    }

    @Step
    public ContactsPage clickOnContactUsButton() {
        log.info("Click on Contact us button.");
        contactUs.shouldBe(visible)
                .click();
        return page(ContactsPage.class);
    }

    @Step
    public HomePage clickOnFacebookButton() {
        log.info("Click on Facebook button.");
        headerFragment.getFacebookButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public HomePage clickOnTwitterButton() {
        log.info("Click on Twitter button.");
        headerFragment.getTwitterButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public HomePage clickOnLinkKPIButton() {
        log.info("Click on Link KPI button.");
        headerFragment.getLinkKPIButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public HomePage clickOnInstagramButton() {
        log.info("Click on Instagram button.");
        headerFragment.getInstagramButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public HomePage clickOnYouTubeButton() {
        log.info("Click on YouTube button.");
        headerFragment.getYouTubeButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    @Step
    public HomePage checkPageIsOpenedInNewTab(String expectedUrlPart) {
        log.info("Check page is opened.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        String currentUrl;
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);
                currentUrl = WebDriverRunner.url();
                assertTrue(expectedUrlPart + " page is not opened", currentUrl.contains(expectedUrlPart));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(HomePage.class);
    }
}
