package app.core.elements.ebay.com.fragments;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class SearchFragment {
    private SelenideElement logoPicture = $x("//a[@href='https://www.ebay.com/']");
    private SelenideElement searchField = $x("//input[@id='gh-ac']");

    private SelenideElement categoryDropdown = $x("//select[@name='_sacat']");
    private ElementsCollection categories = $$x("//select[@name='_sacat']/option");

    private SelenideElement searchButton = $x("//input[@value='Search']");
    private SelenideElement advancedLink = $x("//a[@href='https://www.ebay.com/sch/ebayadvsearch']");

}
