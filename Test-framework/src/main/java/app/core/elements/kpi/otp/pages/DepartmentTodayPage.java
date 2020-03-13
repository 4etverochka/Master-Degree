package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class DepartmentTodayPage {
    private HeaderFragment headerFragment;
    private SelenideElement departmentTodayHeadline = $x("//article/h2");
    private SelenideElement headOfDepartmentLink = $x("(//div[@id='content']//p//a)[2]");
    private SelenideElement headOfDepartmentLinkEn = $x("//div[@id='content']//a");

    public DepartmentTodayPage() {
        headerFragment = new HeaderFragment();
    }
}
