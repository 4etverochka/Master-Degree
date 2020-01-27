package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class EmploymentPage {
    private SelenideElement partnersTitle = $x("//p[contains(@style,'text-align')]/strong");
    private SelenideElement roomsInfo = $x("(//p[contains(@style,'text-align: center')]/span)[1]");
    private ElementsCollection images = $$x("//p//img");
    private HeaderFragment headerFragment;

    public EmploymentPage() {
        headerFragment = new HeaderFragment();
    }
}
