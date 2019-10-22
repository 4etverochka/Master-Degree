package app.core.elements.ebay.com.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class SearchResultsPage {
    private ElementsCollection searchResultsList = $$x("//h3[@class='s-item__title']");
    private SelenideElement buyItNowFilter = $x("//h2[text()='Buy It Now']");
    private SelenideElement emptySearchFieldError = $x("//p[@class='page-notice__cell']");
}
