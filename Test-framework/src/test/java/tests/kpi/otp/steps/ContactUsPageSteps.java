package tests.kpi.otp.steps;

import app.core.elements.kpi.otp.pages.ContactsUsPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

@Log4j2
public class ContactUsPageSteps extends HomePageSteps {
    ContactsUsPage contactUsPage;

    public ContactUsPageSteps() {
        contactUsPage = new ContactsUsPage();
    }

    @Step("Check Head of Department full name on Contact us page.")
    public ContactUsPageSteps checkHeadOfDepartmentFullName(String fullName) {
        log.info("Check Head of Department full name on Contact us page");
        contactUsPage.getHeadOfDepartmentFullName()
                .shouldBe(visible)
                .shouldHave(text(fullName));
        return new ContactUsPageSteps();
    }

    @Step("Check Department address on Contact us page.")
    public ContactUsPageSteps checkDepartmentAddress(String address) {
        log.info("Check Department address on Contact us page");
        contactUsPage.getDepartmentAddress()
                .shouldBe(visible)
                .shouldHave(text(address));
        return new ContactUsPageSteps();
    }

    @Step("Check Head of Department phone number on Contact us page.")
    public ContactUsPageSteps checkHeadOfDepartmentPhoneNumbers(String headOfDepartmentPhoneNumberOne,
                                                                String headOfDepartmentPhoneNumberTwo) {
        log.info("Check Head of Department phone number on Contact us page");
        contactUsPage.getHeadOfDepartmentPhoneNumbers()
                .shouldBe(visible)
                .shouldHave(text(headOfDepartmentPhoneNumberOne));
        contactUsPage.getHeadOfDepartmentPhoneNumbers()
                .shouldBe(visible)
                .shouldHave(text(headOfDepartmentPhoneNumberTwo));
        return new ContactUsPageSteps();
    }

    @Step("Check Department phone number on Contact us page.")
    public ContactUsPageSteps checkDepartmentPhoneNumber(String phoneNumber) {
        log.info("Check Department phone number on Contact us page");
        contactUsPage.getDepartmentPhoneNumber()
                .shouldBe(visible)
                .shouldHave(text(phoneNumber));
        return new ContactUsPageSteps();
    }

    @Step("Check Department email on Contact us page.")
    public ContactUsPageSteps checkDepartmentEmail(String email) {
        log.info("Check Department email on Contact us page.");
        contactUsPage.getDepartmentEmail()
                .shouldBe(visible)
                .shouldHave(text(email));
        return new ContactUsPageSteps();
    }
}
