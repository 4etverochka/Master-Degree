package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class DepartmentTodayPage {
    private HeaderFragment headerFragment;
    private SelenideElement departmentTodayHeadline = $x("//article/h2");
    private By headOfDepartmentLink = By.xpath("(//div[@id='content']//p//a)[2]");
    private By headOfDepartmentLinkEn = By.xpath("//div[@id='content']//a");

    public DepartmentTodayPage() {
        headerFragment = new HeaderFragment();
    }
}
