package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;


public class ContactPageTest extends BaseTest {

    @Test(description = "Check contacts info on different site versions.",
            dataProvider = "contacts_info",
            dataProviderClass = KpiDataProvider.class)
    public void checkInfoOnContactsPage(int contactsLinkNumber,
                                        String headOfDepartmentFullName,
                                        String phoneNumberOne,
                                        String phoneNumberTwo,
                                        String addressImage) {
        page(HomePage.class)
                .openPage()
                .clickOnContactsLink(contactsLinkNumber)
                .checkHeadOfDepartmentFullName(headOfDepartmentFullName)
                .checkPhoneNumber(phoneNumberOne, phoneNumberTwo)
                .checkAddressOnTheMap(addressImage);
    }
}
