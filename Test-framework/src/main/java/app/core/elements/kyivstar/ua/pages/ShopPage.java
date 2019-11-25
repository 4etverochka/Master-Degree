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

    private SelenideElement threeThousandCheckbox = $("a[data-url='availableinstore']");

    private SelenideElement seeButton = $("a[class='btn btn-xs btn-primary']");
}
