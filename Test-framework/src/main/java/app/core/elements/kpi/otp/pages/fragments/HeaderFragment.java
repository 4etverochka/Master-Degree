package app.core.elements.kpi.otp.pages.fragments;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HeaderFragment {
    private SelenideElement title = $x("//h2[@class='post-title']");
}
