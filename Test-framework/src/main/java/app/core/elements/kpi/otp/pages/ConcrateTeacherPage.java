package app.core.elements.kpi.otp.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ConcrateTeacherPage {
    private SelenideElement fio = $x("//h2[@class='post-title']");
}
