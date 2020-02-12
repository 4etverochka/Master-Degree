package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.ContactsPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertTrue;

@Log4j2
public class ContactsPageSteps extends HomePageSteps {
    ContactsPage contactsPage;

    public ContactsPageSteps() {
        contactsPage = new ContactsPage();
    }

    @Step("Check Head of Department full name.")
    public ContactsPageSteps checkHeadOfDepartmentFullName (String fullName) {
        log.info("Check Head of Department full name.");
        contactsPage.getHeadOfDepartmentFullName()
                .shouldBe(visible)
                .shouldHave(text(fullName));
        return new ContactsPageSteps();
    }

    @Step("Check phone number on Contact page")
    public ContactsPageSteps checkPhoneNumber (String contactNumberOne, String contactNumberTwo) {
        log.info("Check phone number on Contact page");
        contactsPage.getPhoneNumbers()
                .get(0)
                .shouldBe(visible)
                .shouldHave(text(contactNumberOne));
        contactsPage.getPhoneNumbers()
                .get(1)
                .shouldBe(visible)
                .shouldHave(text(contactNumberTwo));
        return new ContactsPageSteps();
    }

    @Step("Check address on the map")
    public ContactsPageSteps checkAddressOnTheMap(String expectedMap) {
        log.info("Check address on the map");
        assertTrue(contactsPage.getAddressImage()
                .shouldBe(visible).getAttribute("src")
                .equals(expectedMap));
        return new ContactsPageSteps();
    }
}
