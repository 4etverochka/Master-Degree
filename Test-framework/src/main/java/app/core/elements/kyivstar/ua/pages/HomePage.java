package app.core.elements.kyivstar.ua.pages;

import app.core.elements.kyivstar.ua.fragments.SearchResultsFragment;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomePage {
    public static final String PAGE_URL = "https://kyivstar.ua/uk/mm";

    private SelenideElement searchIcon = $(".search-popup");
    private SelenideElement searchField = $("input[id='search']");
    private SelenideElement storeLink = $("li .internet-store");

    private SearchResultsFragment searchResultFragment;

    public HomePage(){
        searchResultFragment=new SearchResultsFragment();
    }
}
