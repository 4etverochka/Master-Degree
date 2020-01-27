package app.core.elements.kpi.otp.pages;

import app.core.elements.kpi.otp.pages.fragments.HeaderFragment;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class ContactPage {
    private HeaderFragment headerFragment;

    public ContactPage(){
        headerFragment=new HeaderFragment();
    }
}
