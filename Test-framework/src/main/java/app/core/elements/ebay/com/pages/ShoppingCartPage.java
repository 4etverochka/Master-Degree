package app.core.elements.ebay.com.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ShoppingCartPage {
    private SelenideElement startShoppingButton = $x("//a[@href='https://www.ebay.com']");

    private ElementsCollection removeButton = $$x("//button[@data-test-id='cart-remove-item']");
    private SelenideElement itemsCounter = $x("//h1[@class='main-title']");

    private ElementsCollection saveForLaterButton = $$x("//button[@data-test-id='cart-to-sfl']");
    private ElementsCollection removeFromSaveForLaterListButton = $$x("//button[@data-test-id='sfl-remove-item']");
    private SelenideElement savedForLaterCounter = $x("//h2[@class='sfl-title faux-h1']");

    private SelenideElement confirmationMessage = $x("//div[@class='page-alert page-alert--confirmation']");
}
