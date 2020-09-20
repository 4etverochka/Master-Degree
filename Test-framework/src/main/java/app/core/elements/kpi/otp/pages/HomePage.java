package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertTrue;

@Log4j2
@NoArgsConstructor
public class HomePage extends BasePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
    private ElementsCollection aboutUsSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[1]/li/a");
    private SelenideElement departmentTodayEn = $x("(//nav[@id='site-navigation']//ul/li/a)[2]");
    private SelenideElement logo = $x("//img[@id='sc_logo']");
    private SelenideElement copyright = $x("//div[contains(@class,'left')]");
    private SelenideElement contactUs = $x("//div[@id='footer-callout']//a");

    public TeachersPage clickOnTeachersLink(int linkNumber) {
        log.info("Click on 'Teachers' link.");
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return page(TeachersPage.class);
    }

    public EmploymentPage clickOnEmploymentLink(int linkNumber) {
        log.info("Click on 'Employment' link.");
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return page(EmploymentPage.class);
    }

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

    public HomePage returnToHomePage() {
        log.info("Return to home page.");
        logo.shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

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

    public SearchResultPage enterValidDataToSearchFragment(String validData) {
        log.info("Enter valid data to search fragment.");
        headerFragment.getSearch()
                .shouldBe(visible)
                .setValue(validData)
                .pressEnter();
        return page(SearchResultPage.class);
    }

    public SearchResultPage enterInvalidDataToSearchFragment(String invalidData) {
        log.info("Enter invalid data to search fragment.");
        headerFragment.getSearch()
                .shouldBe(visible)
                .setValue(invalidData)
                .pressEnter();
        return page(SearchResultPage.class);
    }

    public HomePage checkCopyrightInfo(String expectedCopyright) {
        log.info("Check copyright info.");
        copyright.shouldBe(visible)
                .shouldHave(text(expectedCopyright));
        return page(HomePage.class);
    }

    public ContactsPage clickOnContactUsButton() {
        log.info("Click on Contact us button.");
        contactUs.shouldBe(visible)
                .click();
        return page(ContactsPage.class);
    }

    public HomePage clickOnFacebookButton() {
        log.info("Click on Facebook button.");
        headerFragment.getFacebookButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage checkFacebookPageIsOpened(String facebook) {
        log.info("Check Twitter page is opened.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);
                facebook = WebDriverRunner.url();
                assertTrue("Facebook page is not opened", facebook.contains("facebook.com"));
                WebDriverRunner.getWebDriver().close(); //closing child window
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow); //cntrl to parent window
            }
        }
        return page(HomePage.class);
    }

    public HomePage clickOnTwitterButton() {
        log.info("Click on Twitter button.");
        headerFragment.getTwitterButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage checkTwitterPageIsOpened(String twitter) {
        log.info("Check Twitter page is opened.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);
                twitter = WebDriverRunner.url();
                assertTrue("Twitter page is not opened", twitter.contains("twitter.com"));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(HomePage.class);
    }

    public HomePage clickOnLinkKPIButton() {
        log.info("Click on Link KPI button.");
        headerFragment.getLinkKPIButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage checkLinkKPIPageIsOpened(String kpi) {
        log.info("Check Official KPI page is opened.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);
                kpi = WebDriverRunner.url();
                assertTrue("KPI page is not opened", kpi.contains("kpi.kharkov.ua"));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(HomePage.class);
    }

    public HomePage clickOnInstagramButton() {
        log.info("Click on Instagram button.");
        headerFragment.getInstagramButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage checkInstagramPageIsOpened(String instagram) {
        log.info("Check Instagram page is opened.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);
                instagram = WebDriverRunner.url();
                assertTrue("Instagram page is not opened", instagram.contains("instagram.com"));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(HomePage.class);
    }

    public HomePage clickOnYouTubeButton() {
        log.info("Click on YouTube button.");
        headerFragment.getYouTubeButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage checkYouTubePageIsOpened(String youTube) {
        log.info("Check YouTube page is opened.");
        String parentWindow = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String windowHandle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                WebDriverRunner.getWebDriver().switchTo().window(windowHandle);
                youTube = WebDriverRunner.url();
                assertTrue("Youtube page is not opened", youTube.contains("youtube.com"));
                WebDriverRunner.getWebDriver().close();
                WebDriverRunner.getWebDriver().switchTo().window(parentWindow);
            }
        }
        return page(HomePage.class);
    }
}
