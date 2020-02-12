package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ContactsUsPage {
    private HeaderFragment headerFragment;
    private SelenideElement headOfDepartmentFullName = $x("//strong[contains(text(),'Семенов')]");
    private SelenideElement headOfDepartmentPhoneNumbers = $x("//p[contains(text(),'. 0')]");
    private SelenideElement departmentAddress = $x("//div[@id='content']//p[4]");
    private SelenideElement departmentPhoneNumber = $x("//div[@id='content']//p[5]");
    private SelenideElement departmentEmail = $x("//div[@id='content']//p[6]");

    public ContactsUsPage() {
        headerFragment = new HeaderFragment();
    }
}