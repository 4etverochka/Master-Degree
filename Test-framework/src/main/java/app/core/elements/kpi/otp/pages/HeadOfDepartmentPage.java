package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HeadOfDepartmentPage {
    private HeaderFragment headerFragment;
    private SelenideElement headOfDepartmentHeadline = $x("//article/h2");
    private ElementsCollection headOfDepartmentInfo = $$x("//p/em");
    private ElementsCollection headOfDepartmentEnInfo = $$x("//span/em");

    public HeadOfDepartmentPage() {
        headerFragment = new HeaderFragment();
    }
}
