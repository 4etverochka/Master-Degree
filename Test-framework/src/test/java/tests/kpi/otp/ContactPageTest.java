package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import org.testng.annotations.Test;
import tests.BaseTest;

import static app.core.test_data.KpiIntConstants.NUMBER_ZERO;
import static app.core.test_data.KpiStringConstants.*;
import static com.codeborne.selenide.Selenide.page;


public class ContactPageTest extends BaseTest {
    private static final int ZERO = NUMBER_ZERO.getValue();
    private static final String HEAD_OF_DEPARTMENT_NAME = HEAD_OF_DEPARTMENT_FULL_NAME.getValue();
    private static final String PHONE_NUMBER_1 = PHONE_NUMBER_ONE.getValue();
    private static final String PHONE_NUMBER_2 = PHONE_NUMBER_TWO.getValue();
    private static final String ADDRESS = ADDRESS_IMAGE.getValue();

    @Test(description = "Check contacts info on different site versions.")
    public void checkInfoOnContactsPage() {
        page(HomePage.class)
                .openPage()
                .clickOnContactsLink(ZERO)
                .checkHeadOfDepartmentFullName(HEAD_OF_DEPARTMENT_NAME)
                .checkPhoneNumber(PHONE_NUMBER_1, PHONE_NUMBER_2)
                .checkAddressOnTheMap(ADDRESS);
    }
}