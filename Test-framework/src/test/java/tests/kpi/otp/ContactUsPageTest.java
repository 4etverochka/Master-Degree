package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.NUMBER_SEVEN;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;

public class ContactUsPageTest extends BaseTest {
    private static final String HEAD_OF_DEPARTMENT_FULL_NAME = HEAD_OF_DEPARTMENT_FULL_NAME_ON_CONTACT_US_PAGE.getValue();
    private static final String HEAD_OF_DEPARTMENT_PHONE_NUMBER_ONE = HEAD_OF_DEPARTMENT_PHONE_NUMBER_ONE_ON_CONTACT_US_PAGE.getValue();
    private static final String HEAD_OF_DEPARTMENT_PHONE_NUMBER_TWO = HEAD_OF_DEPARTMENT_PHONE_NUMBER_TWO_ON_CONTACT_US_PAGE.getValue();
    private static final String DEPARTMENT_ADDRESS = DEPARTMENT_ADDRESS_ON_CONTACT_US_PAGE.getValue();
    private static final String DEPARTMENT_PHONE = DEPARTMENT_PHONE_NUMBER_ON_CONTACT_US_PAGE.getValue();
    private static final String DEPARTMENT_EMAIL = DEPARTMENT_EMAIL_ON_CONTACT_US_PAGE.getValue();
    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_SEVEN.getValue();

    @Test(description = "Check Contact us page on different languages.")
    public void checkInfoOnContactUsPageOnDifferentLanguages() {
        page(HomePage.class)
                .openPage()
                .clickOnContactUsButton()
                .checkHeadOfDepartmentFullNameContactUsPage(HEAD_OF_DEPARTMENT_FULL_NAME)
                .checkHeadOfDepartmentPhoneNumbers(HEAD_OF_DEPARTMENT_PHONE_NUMBER_ONE, HEAD_OF_DEPARTMENT_PHONE_NUMBER_TWO)
                .checkDepartmentAddress(DEPARTMENT_ADDRESS)
                .checkDepartmentPhoneNumber(DEPARTMENT_PHONE)
                .checkDepartmentEmail(DEPARTMENT_EMAIL)
                .returnToHomePage()
                .changeLanguageToUkrainian(CHANGE_LANGUAGE_LINK_NUMBER)
                .clickOnContactUsButton()
                .checkHeadOfDepartmentFullNameContactUsPage(HEAD_OF_DEPARTMENT_FULL_NAME)
                .checkDepartmentAddress(DEPARTMENT_ADDRESS)
                .checkDepartmentPhoneNumber(DEPARTMENT_PHONE)
                .checkDepartmentEmail(DEPARTMENT_EMAIL);
    }
}