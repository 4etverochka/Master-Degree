package app.core.elements.ebay.com.pages;

import app.core.elements.ebay.com.fragments.HeaderFragment;
import app.core.elements.ebay.com.fragments.SearchFragment;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HomePage {
    public static final String PAGE_URL = "https://www.ebay.com";

    private SelenideElement signInLink = $x("//span[@id='gh-ug']/a");

    private SearchFragment searchFragment;
    private HeaderFragment headerFragment;

    public HomePage() {
        searchFragment = new SearchFragment();
        headerFragment = new HeaderFragment();
    }

}
