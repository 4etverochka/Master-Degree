package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class ContactPageTest extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Check contacts info on different site versions.",
            dataProvider = "contacts_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkInfoOnContactsPage(int contactsLinkNumber,
                                        String headOfDepartmentFullName,
                                        String phoneNumberOne,
                                        String phoneNumberTwo,
                                        String addressImage) {
        homePageSteps.openPage()
                .clickOnContactsLink(contactsLinkNumber)
                .checkHeadOfDepartmentFullName(headOfDepartmentFullName)
                .checkPhoneNumber(phoneNumberOne, phoneNumberTwo)
                .checkAddressOnTheMap(addressImage);
    }
}
