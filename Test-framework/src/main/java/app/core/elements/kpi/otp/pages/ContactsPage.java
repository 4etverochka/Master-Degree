package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class ContactsPage {
    private HeaderFragment headerFragment;
    private SelenideElement headOfDepartmentFullName = $x("//p//span/a");
    private ElementsCollection phoneNumbers = $$x("//li/span[@style]");
    private SelenideElement addressImage = $x("//img[@class]");

    public ContactsPage() {
        headerFragment = new HeaderFragment();
    }
}
