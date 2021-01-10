package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class ContactUsPageTest extends BaseTest {

    @Test(description = "Check Contact us page on different languages.",
            dataProvider = "contact_us_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkInfoOnContactUsPageOnDifferentLanguages(String headOfDepartmentFullName,
                                                             String headOfDepartmentPhoneNumberOne,
                                                             String headOfDepartmentPhoneNumberTwo,
                                                             String departmentAddress,
                                                             String departmentPhoneNumber,
                                                             String departmentEmail,
                                                             int changeLanguageLinkNumber) {
        page(HomePage.class)
                .openPage()
                .clickOnContactUsButton()
                .checkHeadOfDepartmentFullNameContactUsPage(headOfDepartmentFullName)
                .checkHeadOfDepartmentPhoneNumbers(headOfDepartmentPhoneNumberOne, headOfDepartmentPhoneNumberTwo)
                .checkDepartmentAddress(departmentAddress)
                .checkDepartmentPhoneNumber(departmentPhoneNumber)
                .checkDepartmentEmail(departmentEmail)
                .returnToHomePage()
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnContactUsButton()
                .checkHeadOfDepartmentFullNameContactUsPage(headOfDepartmentFullName)
                .checkDepartmentAddress(departmentAddress)
                .checkDepartmentPhoneNumber(departmentPhoneNumber)
                .checkDepartmentEmail(departmentEmail);
    }
}
