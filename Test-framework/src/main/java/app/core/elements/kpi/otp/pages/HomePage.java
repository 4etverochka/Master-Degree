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
    private ElementsCollection scientificActivitySubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[14]/li/a");
    private ElementsCollection olympiadsSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[17]/li/a");
    private ElementsCollection ukrainianOlympiadSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[18]/li");
    private ElementsCollection internationalOlympiadSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[19]/li");
    private ElementsCollection classesTimetableSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[4]/li/a");
    private ElementsCollection diplomaTopicsSubMenus = $$x("((//nav[@id='site-navigation']//ul[@class='menu']//ul)[2]/li/ul)[2]/li/a");
    private ElementsCollection springSemester20SubMenus = $$x("(//a[contains(text(),'2019/2020')])[2]/../ul/li");
    private ElementsCollection autumnSemester21SubMenus = $$x("(((//a[contains(text(),'2019/2020')])[2]/ancestor::li)[2]//ul)[3]/li");
    private ElementsCollection springSemester21SubMenus = $$x("(//a[contains(text(),'2020/2021')])[2]/../ul/li");
    private ElementsCollection educationalAndMethodologicalSupportSubMenus = $$x("((//nav[@id='site-navigation']//ul[@class='menu']//ul)[2]/li)[5]/ul/li");
    private ElementsCollection educationalDisciplinesSubMenus = $$x("((//nav[@id='site-navigation']//ul[@class='menu']//ul)[2]/li)[5]/ul/li[1]/ul/li");
    private ElementsCollection enrolleeSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[20]/li");
    private ElementsCollection eventsSubMenus = $$x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[21]/li");
    private SelenideElement eventSubMenuEng = $x("(//nav[@id='site-navigation']//ul[@class='menu']//ul)[3]/li/a");
    private SelenideElement departmentTodayEn = $x("(//nav[@id='site-navigation']//ul/li/a)[2]");
    private SelenideElement logo = $x("//a[@rel='home']");
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
        aboutUsSubMenus.get(4)
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

    public GalleryPage clickOnGalleryPageLink(int linkNumber) {
        headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible)
                .click();
        eventsSubMenus.get(0)
                .shouldHave(visible)
                .click();
        return page(GalleryPage.class);
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
        contactUs.scrollTo().shouldBe(visible)
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


    public ITSquareOfUniversityPage clickOnITSquareOfUniversityPageLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        eventsSubMenus.get(2)
                .shouldBe(visible)
                .click();
        return page(ITSquareOfUniversityPage.class);
    }

    public ITSquareOfUniversityPage clickOnITSquareOfUniversityPageLinkEng(int linkNumber) {
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

    public CuratorsPage clickOnCuratorsLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(3)
                .shouldBe(visible)
                .click();
        return page(CuratorsPage.class);
    }

    public HomePage checkDiplomaSpringSemester20(int linkNumber, int expectedSize) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(3)
                .shouldBe(visible)
                .hover();
        diplomaTopicsSubMenus.get(0)
                .shouldBe(visible)
                .hover();
        springSemester20SubMenus.shouldHaveSize(expectedSize);
        return page(HomePage.class);
    }

    public HomePage checkDiplomaAutumnSemester20(int linkNumber, int expectedSize) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(3)
                .shouldBe(visible)
                .hover();
        diplomaTopicsSubMenus.get(1)
                .shouldBe(visible)
                .hover();
        autumnSemester21SubMenus.shouldHaveSize(expectedSize);
        return page(HomePage.class);
    }

    public HomePage checkDiplomaSpringSemester21(int linkNumber, int expectedSize) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(3)
                .shouldBe(visible)
                .hover();
        diplomaTopicsSubMenus.get(2)
                .shouldBe(visible)
                .hover();
        springSemester21SubMenus.shouldHaveSize(expectedSize);
        return page(HomePage.class);
    }

    public HomePage checkEducationalDisciplines(int linkNumber, int expectedSize) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(4)
                .shouldBe(visible)
                .hover();
        educationalAndMethodologicalSupportSubMenus.get(0)
                .shouldBe(visible)
                .hover();
        educationalDisciplinesSubMenus.shouldHaveSize(expectedSize);
        return page(HomePage.class);
    }

    public HomePage clickMethodologicalMaterialsForDiplomaLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        educationalProcessSubMenus.get(4)
                .shouldBe(visible)
                .hover();
        educationalAndMethodologicalSupportSubMenus.get(1)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public ScientificSchoolsDepartmentsPage clickOnScientificSchoolsDepartmentsLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        scientificActivitySubMenus.get(0)
                .shouldBe(visible)
                .click();
        return page(ScientificSchoolsDepartmentsPage.class);
    }

    public ConferencesAndPublishingActivitiesPage clickOnConferencesAndPublishingActivitiesLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        scientificActivitySubMenus.get(1)
                .shouldBe(visible)
                .click();
        return page(ConferencesAndPublishingActivitiesPage.class);
    }

    public HomePage checkUkrainianStudentsProgrammingOlympiadArchive(int linkNumber, int expectedSize) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        olympiadsSubMenus.get(0)
                .shouldBe(visible)
                .hover();
        ukrainianOlympiadSubMenus.shouldHaveSize(expectedSize);
        return page(HomePage.class);
    }

    public HomePage checkInternationalOlympiadArchive(int linkNumber, int expectedSize) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        olympiadsSubMenus.get(1)
                .shouldBe(visible)
                .hover();
        internationalOlympiadSubMenus.shouldHaveSize(expectedSize);
        return page(HomePage.class);
    }

    public RoboFestPage clickOnRoboFestLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        olympiadsSubMenus.get(2)
                .shouldBe(visible)
                .click();
        return page(RoboFestPage.class);
    }

    public EnrolleePage clickOnEnrolleePageLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        enrolleeSubMenus.get(0)
                .shouldBe(visible)
                .click();
        return page(EnrolleePage.class);
    }

    public HomePage clickOnAdmissionRules21Link(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        enrolleeSubMenus.get(1)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public HomePage clickOnSelectionCommitteeLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        enrolleeSubMenus.get(2)
                .shouldBe(visible)
                .click();
        return page(HomePage.class);
    }

    public VirtualTourPage clickOnVirtualTourLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        enrolleeSubMenus.get(3)
                .shouldBe(visible)
                .click();
        return page(VirtualTourPage.class);
    }

    public EliteSchoolPage clickOnEliteSchoolPageLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        enrolleeSubMenus.get(4)
                .shouldBe(visible)
                .click();
        return page(EliteSchoolPage.class);
    }

    public ITKidsSchoolPage clickOnITKidsSchoolPageLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        enrolleeSubMenus.get(5)
                .shouldBe(visible)
                .click();
        return page(ITKidsSchoolPage.class);
    }

    public Games3DPage clickOnGames3DPageLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        enrolleeSubMenus.get(6)
                .shouldBe(visible)
                .click();
        return page(Games3DPage.class);
    }

    public ScotoLogicInnovativeLaboratoryPage clickOnScotoLogicInnovativeLaboratoryPageLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        eventsSubMenus.get(1)
                .shouldBe(visible)
                .click();
        return page(ScotoLogicInnovativeLaboratoryPage.class);
    }

    public GiulianiSecurityAndSafetyLLCPage clickOnGiulianiSecurityAndSafetyLLCPageLink(int linkNumber) {
        actions().moveToElement(headerFragment.getHeaderLinks()
                .get(linkNumber)
                .shouldBe(visible))
                .perform();
        eventsSubMenus.get(3)
                .shouldBe(visible)
                .click();
        return page(GiulianiSecurityAndSafetyLLCPage.class);
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