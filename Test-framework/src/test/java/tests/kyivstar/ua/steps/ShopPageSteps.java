package tests.kyivstar.ua.steps;

import app.core.elements.kyivstar.ua.pages.ShopPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Log4j2
public class ShopPageSteps {
    private ShopPage shopPage;

    public ShopPageSteps(){
        shopPage=new ShopPage();
    }

    @Step("Click on 'tariff plan' link.")
    public ShopPageSteps clickOnTariffPlanLink() {
        log.info("Click on 'tariff plan' link.");
        shopPage.getTariffPlanLink()
                .shouldBe(visible)
                .click();

        return this;
    }

    @Step("Click on 'Contracts' icon.")
    public ShopPageSteps clickOnContractsIcon() {
        log.info("Click on 'Contracts' icon.");
        shopPage.getContractsIcon()
                .shouldBe(visible)
                .click();

        return this;
    }

    private int getCountOfRecords() {
        String currentCount = shopPage.getProductCount().shouldBe(visible).getText();
        currentCount = currentCount.replaceAll("\\D", "");
        int integerCount = Integer.parseInt(currentCount);

        return integerCount;
    }

    @Step("Select 'Three Thousand' checkbox.")
    public ShopPageSteps selectThreeThousandCheckbox() {
        log.info("Select 'Three Thousand' checkbox.");
        shopPage.getThreeThousandCheckbox()
                .shouldBe(visible)
                .click();

        return this;
    }

    @Step("Click on 'See' button.")
    public ShopPageSteps clickOnSeeButton() {
        log.info("Click on 'See' button.");
        shopPage.getSeeButton()
                .shouldBe(visible)
                .click();

        return this;
    }

    @Step("Check count of records.")
    public ShopPageSteps checkCountOfRecords(int expectedCount){
        log.info("Check count of records.");
        assertThat("Invalid count of records!",getCountOfRecords(),equalTo(expectedCount));

        return this;
    }
}
