package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class SearchResultPage {
    private HeaderFragment headerFragment;
    private SelenideElement validResult = $x("//h1/a[text()='Преподаватели']");
    private SelenideElement invalidResultMessage = $x("//p");

    public SearchResultPage() {
        headerFragment = new HeaderFragment();
    }
}
