package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertTrue;

@Log4j2
public class ContactsPage extends HomePage {
    private SelenideElement headOfDepartmentPhoneNumbers = $x("//p[contains(text(),'. 0')]");
    private SelenideElement departmentAddress = $x("//div[@id='content']//p[4]");
    private SelenideElement departmentPhoneNumber = $x("//div[@id='content']//p[5]");
    private SelenideElement departmentEmail = $x("//div[@id='content']//p[6]");
    private SelenideElement headOfDepartmentFullName = $x("//p//span/a");
    private ElementsCollection phoneNumbers = $$x("//li/span[@style]");
    private SelenideElement addressImage = $x("//img[@class]");
    private SelenideElement headOfDepartmentFullNameContactUs = $x("//br/preceding-sibling::strong");

    public ContactsPage checkHeadOfDepartmentFullName(String fullName) {
        log.info("Check Head of Department full name.");
        headOfDepartmentFullName
                .shouldBe(visible)
                .shouldHave(text(fullName));
        return page(ContactsPage.class);
    }

    public ContactsPage checkHeadOfDepartmentFullNameContactUsPage(String fullName) {
        log.info("Check Head of Department full name.");
        headOfDepartmentFullNameContactUs
                .shouldBe(visible)
                .shouldHave(text(fullName));
        return page(ContactsPage.class);
    }

    public ContactsPage checkPhoneNumber(String contactNumberOne, String contactNumberTwo) {
        log.info("Check phone number on Contact page");
        phoneNumbers.get(0)
                .shouldBe(visible)
                .shouldHave(text(contactNumberOne));
        phoneNumbers.get(1)
                .shouldBe(visible)
                .shouldHave(text(contactNumberTwo));
        return page(ContactsPage.class);
    }

    public ContactsPage checkAddressOnTheMap(String expectedMap) {
        log.info("Check address on the map");
        assertTrue(addressImage.shouldBe(visible)
                .getAttribute("src")
                .equals(expectedMap));
        return page(ContactsPage.class);
    }

    public ContactsPage checkDepartmentAddress(String address) {
        log.info("Check Department address on Contact us page");
        departmentAddress.shouldBe(visible)
                .shouldHave(text(address));
        return page(ContactsPage.class);
    }

    public ContactsPage checkHeadOfDepartmentPhoneNumbers(String headOfDepartmentPhoneNumberOne,
                                                          String headOfDepartmentPhoneNumberTwo) {
        log.info("Check Head of Department phone number on Contact us page");
        headOfDepartmentPhoneNumbers.shouldBe(visible)
                .shouldHave(text(headOfDepartmentPhoneNumberOne));
        headOfDepartmentPhoneNumbers.shouldBe(visible)
                .shouldHave(text(headOfDepartmentPhoneNumberTwo));
        return page(ContactsPage.class);
    }

    public ContactsPage checkDepartmentPhoneNumber(String phoneNumber) {
        log.info("Check Department phone number on Contact us page");
        departmentPhoneNumber.shouldBe(visible)
                .shouldHave(text(phoneNumber));
        return page(ContactsPage.class);
    }

    public ContactsPage checkDepartmentEmail(String email) {
        log.info("Check Department email on Contact us page.");
        departmentEmail.shouldBe(visible)
                .shouldHave(text(email));
        return page(ContactsPage.class);
    }
}