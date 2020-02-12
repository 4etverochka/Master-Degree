package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.HomePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.interactions.Actions;

import static app.core.elements.kpi.otp.pages.HomePage.HOME_PAGE;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

@Log4j2
public class HomePageSteps {
    private HomePage homePage;


    public HomePageSteps() {
        homePage = new HomePage();
    }

    @Step("Open home page.")
    public HomePageSteps openPage() {
        log.info("Open home page.");
        open(HOME_PAGE);
        homePage = new HomePage();
        return this;
    }

    @Step("Click on 'Teachers' link.")
    public TeachersPageSteps clickOnTeachersLink(int linkNumber) {
        log.info("Click on 'Teachers' link.");
        homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return new TeachersPageSteps();
    }

    @Step("Click on 'Employment' link.")
    public EmploymentPageSteps clickOnEmploymentLink(int linkNumber) {
        log.info("Click on 'Employment' link.");
        homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return new EmploymentPageSteps();
    }

    @Step("CLick on 'Contacts' link.")
    public ContactsPageSteps clickOnContactsLink(int linkNumber) {
        log.info("CLick on 'Contacts' link.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        homePage.getAboutUsSubMenus()
                .get(3)
                .shouldBe(visible)
                .click();
        return new ContactsPageSteps();
    }

    @Step("Click on 'Department today' link.")
    public DepartmentTodaySteps clickOnDepartmentTodayLink(int linkNumber) {
        log.info("Click on 'Department today' link.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        homePage.getAboutUsSubMenus()
                .get(1)
                .shouldBe(visible)
                .click();
        return new DepartmentTodaySteps();
    }

    @Step("Click on 'Department today' link in En version.")
    public DepartmentTodaySteps clickOnDepartmentTodayLinkInEnVersion(int linkNumber) {
        log.info("Click on 'Department today' link in En version.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        homePage.getDepartmentTodayEn()
                .shouldBe(visible)
                .click();
        return new DepartmentTodaySteps();
    }

    @Step("Return to home page.")
    public HomePageSteps returnToHomePage() {
        log.info("Return to home page.");
        homePage.getLogo()
                .shouldBe(visible)
                .click();
        return new HomePageSteps();
    }

    @Step("Change language to English.")
    public HomePageSteps changeLanguageToEnglish(int linkNumber) {
        log.info("Change language to English.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        homePage.getHeaderFragment()
                .getEnglishLanguage()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step("Change language to Ukrainian.")
    public HomePageSteps changeLanguageToUkrainian(int linkNumber) {
        log.info("Change language to Ukrainian.");
        Actions action = new Actions(WebDriverRunner.getWebDriver());
        action.moveToElement(homePage.getHeaderLinks()
                .get(linkNumber))
                .perform();
        homePage.getHeaderFragment()
                .getUkrainianLanguage()
                .shouldBe(visible)
                .click();
        return this;
    }

    @Step("Enter valid data to search fragment.")
    public SearchResultSteps enterValidDataToSearchFragment(String validData) {
        log.info("Enter valid data to search fragment.");
        homePage.getHeaderFragment()
                .getSearch()
                .shouldBe(visible)
                .setValue(validData)
                .pressEnter();
        return new SearchResultSteps();
    }

    @Step("Enter invalid data to search fragment.")
    public SearchResultSteps enterInvalidDataToSearchFragment(String invalidData) {
        log.info("Enter invalid data to search fragment.");
        homePage.getHeaderFragment()
                .getSearch()
                .shouldBe(visible)
                .setValue(invalidData)
                .pressEnter();
        return new SearchResultSteps();
    }

    @Step("Check copyright info.")
    public HomePageSteps checkCopyrightInfo(String copyright) {
        log.info("Check copyright info.");
        homePage.getCopyright()
                .shouldBe(visible)
                .shouldHave(text(copyright));
        return this;
    }

    @Step("Click on Contact us button.")
    public ContactUsPageSteps clickOnContactUsButton() {
        log.info("Click on Contact us button.");
        homePage.getContactUs()
                .shouldBe(visible)
                .click();
        return new ContactUsPageSteps();
    }

    @Step("Click on Facebook button.")
    public HomePageSteps clickOnFacebookButton() {
        log.info("Click on Facebook button.");
        homePage.getHeaderFragment()
                .getFacebookButton()
                .shouldBe(visible)
                .click();
        return new HomePageSteps();
    }

    @Step("Check Facebook page is opened.")
    public HomePageSteps checkFacebookPageIsOpened(String facebook) {
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
        return new HomePageSteps();
    }

    @Step("Click on Twitter button.")
    public HomePageSteps clickOnTwitterButton() {
        log.info("Click on Twitter button.");
        homePage.getHeaderFragment()
                .getTwitterButton()
                .shouldBe(visible)
                .click();
        return new HomePageSteps();
    }

    @Step("Check Twitter page is opened.")
    public HomePageSteps checkTwitterPageIsOpened(String twitter) {
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
        return new HomePageSteps();
    }

    @Step("Click on Link KPI button.")
    public HomePageSteps clickOnLinkKPIButton() {
        log.info("Click on Link KPI button.");
        homePage.getHeaderFragment()
                .getLinkKPIButton()
                .shouldBe(visible)
                .click();
        return new HomePageSteps();
    }

    @Step("Check Official KPI page is opened.")
    public HomePageSteps checkLinkKPIPageIsOpened(String kpi) {
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
        return new HomePageSteps();
    }

    @Step("Click on Instagram button.")
    public HomePageSteps clickOnInstagramButton() {
        log.info("Click on Instagram button.");
        homePage.getHeaderFragment()
                .getInstagramButton()
                .shouldBe(visible)
                .click();
        return new HomePageSteps();
    }

    @Step("Check Instagram page is opened.")
    public HomePageSteps checkInstagramPageIsOpened(String instagram) {
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
        return new HomePageSteps();
    }

    @Step("Click on YouTube button.")
    public HomePageSteps clickOnYouTubeButton() {
        log.info("Click on YouTube button.");
        homePage.getHeaderFragment()
                .getYouTubeButton()
                .shouldBe(visible)
                .click();
        return new HomePageSteps();
    }

    @Step("Check YouTube page is opened.")
    public HomePageSteps checkYouTubePageIsOpened(String youTube) {
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
        return new HomePageSteps();
    }
}
