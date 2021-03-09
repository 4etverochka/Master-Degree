package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertTrue;

public class HomePage extends BasePage {
    protected HeaderFragment headerFragment = page(HeaderFragment.class);
    private ElementsCollection aboutUsSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[1]/li/a");
    private ElementsCollection educationalProcessSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[2]/li/a");
    private ElementsCollection classesTimetableSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[3]/li/a");
    private SelenideElement eventSubMenuEng = $x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[3]/li/a");
    private SelenideElement departmentTodayEn = $x("(//nav[@id='site-navigation']//ul/li/a)[2]");
    private SelenideElement galleryEn = $x("(//nav[@id='site-navigation']//ul/li/a)[2]");
    private SelenideElement logo = $x("//img[@id='sc_logo']");
    private SelenideElement copyright = $x("//div[contains(@class,'left')]");
    private SelenideElement contactUs = $x("//div[@id='footer-callout']//a");

    public TeachersPage clickOnTeachersLink(int linkNumber) {
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return page(TeachersPage.class);
    }

    public EmploymentPage clickOnEmploymentLink(int linkNumber) {
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return page(EmploymentPage.class);
    }

    public ContactsPage clickOnContactsLink(int linkNumber) {
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
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        departmentTodayEn.shouldBe(visible)
                .click();
        return page(DepartmentTodayPage.class);
    }

    public GalleryPage clickOnGalleryLinkInEnVersion(int linkNumber) {
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        return page(GalleryPage.class);
    }

    public HomePage returnToHomePage() {
        logo.shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage changeLanguageToEnglish(int linkNumber) {
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
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        headerFragment.getUkrainianLanguage()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public SearchResultPage enterValidDataToSearchFragment(String validData) {
        headerFragment.getSearch()
                .shouldBe(visible)
                .setValue(validData)
                .pressEnter();
        return page(SearchResultPage.class);
    }

    public SearchResultPage enterInvalidDataToSearchFragment(String invalidData) {
        headerFragment.getSearch()
                .shouldBe(visible)
                .setValue(invalidData)
                .pressEnter();
        return page(SearchResultPage.class);
    }

    public HomePage checkCopyrightInfo(String expectedCopyright) {
        copyright.shouldBe(visible)
                .shouldHave(text(expectedCopyright));
        return page(HomePage.class);
    }

    public ContactsPage clickOnContactUsButton() {
        contactUs.shouldBe(visible)
                .click();
        return page(ContactsPage.class);
    }

    public HomePage clickOnFacebookButton() {
        headerFragment.getFacebookButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnTwitterButton() {
        headerFragment.getTwitterButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnLinkKPIButton() {
        headerFragment.getLinkKPIButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnInstagramButton() {
        headerFragment.getInstagramButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnYouTubeButton() {
        headerFragment.getYouTubeButton()
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnEducationalAndProfessionalProgramLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        educationalProcessSubMenus
                .get(0)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnEducationalDisciplinesLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        educationalProcessSubMenus
                .get(1)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnTimetableOfStudentsLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        educationalProcessSubMenus
                .get(2)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnBachelorsWorkTopicsLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        educationalProcessSubMenus
                .get(3)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnGroupCuratorsLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        educationalProcessSubMenus
                .get(4)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnDisciplinesDuringTheQuarantineLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber))
                .perform();
        educationalProcessSubMenus
                .get(5)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public ITSquareOfUniversityPage clickOnITSquareOfUniversityLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        eventSubMenuEng
                .shouldBe(visible)
                .click();
        return page(ITSquareOfUniversityPage.class);
    }

    public DepartmentHistoryPage clickOnDepartmentHistoryLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        aboutUsSubMenus.get(0)
                .shouldBe(visible)
                .click();
        return page(DepartmentHistoryPage.class);
    }

    public HomePage clickOnFeedbackLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        aboutUsSubMenus.get(2)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public EducationalScheduleProcessPage clickOnEducationalScheduleProcessLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(0)
                .shouldBe(visible)
                .click();
        return page(EducationalScheduleProcessPage.class);
    }

    public StudentsSchedulePage clickOnStudentsScheduleLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(1)
                .shouldBe(visible)
                .hover();
        classesTimetableSubMenus.get(0)
                .shouldBe(visible)
                .click();
        return page(StudentsSchedulePage.class);
    }

    public TeachersSchedulePage clickOnTeachersScheduleLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(1)
                .shouldBe(visible)
                .hover();
        classesTimetableSubMenus.get(1)
                .shouldBe(visible)
                .click();
        return page(TeachersSchedulePage.class);
    }

    public HomePage checkPageIsOpenedInNewTab(String expectedUrlPart) {
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