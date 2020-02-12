package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class ContactUsPageTest extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();

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

        homePageSteps.openPage()
                .clickOnContactUsButton()
                .checkHeadOfDepartmentFullName(headOfDepartmentFullName)
                .checkHeadOfDepartmentPhoneNumbers(headOfDepartmentPhoneNumberOne, headOfDepartmentPhoneNumberTwo)
                .checkDepartmentAddress(departmentAddress)
                .checkDepartmentPhoneNumber(departmentPhoneNumber)
                .checkDepartmentEmail(departmentEmail)
                .returnToHomePage()
                .changeLanguageToUkrainian(changeLanguageLinkNumber)
                .clickOnContactUsButton()
                .checkHeadOfDepartmentFullName(headOfDepartmentFullName)
                .checkDepartmentAddress(departmentAddress)
                .checkDepartmentPhoneNumber(departmentPhoneNumber)
                .checkDepartmentEmail(departmentEmail);
    }
}
