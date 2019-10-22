package app.core.elements.kyivstar.ua.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ShopPage {
    private SelenideElement tariffPlanLink = $("a .category-icon--tariffplan");

    private SelenideElement contractsIcon = $("li .panel-collapse__link .category-acc-icon--" +
            "tariffplancontract");

    private SelenideElement productCount = $(".sort__count");

    private SelenideElement threeThousandCheckbox = $("a[data-url='570-dzvinky-na-inshi-merezhi-a-takozh-na-" +
            "nomery-italii-polshchi-rosii-3000-khv-5246']");

    private SelenideElement seeButton = $("a[class='btn btn-xs btn-primary']");
}
