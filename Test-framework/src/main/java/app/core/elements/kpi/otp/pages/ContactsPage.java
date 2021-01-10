package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
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
        headOfDepartmentFullName.shouldBe(visible)
                .shouldHave(text(fullName));
        return page(ContactsPage.class);
    }

    public ContactsPage checkHeadOfDepartmentFullNameContactUsPage(String fullName) {
        headOfDepartmentFullNameContactUs.shouldBe(visible)
                .shouldHave(text(fullName));
        return page(ContactsPage.class);
    }

    public ContactsPage checkPhoneNumber(String contactNumberOne, String contactNumberTwo) {
        phoneNumbers.get(0)
                .shouldBe(visible)
                .shouldHave(text(contactNumberOne));
        phoneNumbers.get(1)
                .shouldBe(visible)
                .shouldHave(text(contactNumberTwo));
        return page(ContactsPage.class);
    }

    public ContactsPage checkAddressOnTheMap(String expectedMap) {
        assertTrue(addressImage.shouldBe(visible)
                .getAttribute("src")
                .equals(expectedMap));
        return page(ContactsPage.class);
    }

    public ContactsPage checkDepartmentAddress(String address) {
        departmentAddress.shouldBe(visible)
                .shouldHave(text(address));
        return page(ContactsPage.class);
    }

    public ContactsPage checkHeadOfDepartmentPhoneNumbers(String headOfDepartmentPhoneNumberOne,
                                                          String headOfDepartmentPhoneNumberTwo) {
        headOfDepartmentPhoneNumbers.shouldBe(visible)
                .shouldHave(text(headOfDepartmentPhoneNumberOne));
        headOfDepartmentPhoneNumbers.shouldBe(visible)
                .shouldHave(text(headOfDepartmentPhoneNumberTwo));
        return page(ContactsPage.class);
    }

    public ContactsPage checkDepartmentPhoneNumber(String phoneNumber) {
        departmentPhoneNumber.shouldBe(visible)
                .shouldHave(text(phoneNumber));
        return page(ContactsPage.class);
    }

    public ContactsPage checkDepartmentEmail(String email) {
        departmentEmail.shouldBe(visible)
                .shouldHave(text(email));
        return page(ContactsPage.class);
    }
}