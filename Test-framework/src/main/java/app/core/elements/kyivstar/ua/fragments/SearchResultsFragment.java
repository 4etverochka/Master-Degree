package app.core.elements.kyivstar.ua.fragments;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

@Getter
public class SearchResultsFragment {
    private ElementsCollection searchResults = $$x("//ol[@class='search-results google-search-results']/li");
}
