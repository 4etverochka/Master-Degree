package app.core.elements.ebay.com.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ProductPage {
    private SelenideElement productTitle = $x("//h1[@class='it-ttl']");
    private SelenideElement addToCartButton = $x("//a[@id='isCartBtn_btn']");
}
