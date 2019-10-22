package tests.kyivstar.ua;

import app.core.test_data.KyivstarDataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kyivstar.ua.steps.HomePageSteps;

public class ShopTest extends BaseTest {
    private HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Check shop page counter with before and after select checkbox.", dataProvider = "checkbox_data", dataProviderClass = KyivstarDataProvider.class)
    public void shopPageCounterValidValue(int countBeforeSelectCheckbox, int countAfterSelectCheckbox) {
        homePageSteps.openHomePage()
                .clickOnStoreLink()
                .clickOnTariffPlanLink()
                .clickOnContractsIcon()
                .checkCountOfRecords(countBeforeSelectCheckbox)
                .selectThreeThousandCheckbox()
                .clickOnSeeButton()
                .checkCountOfRecords(countAfterSelectCheckbox);
    }
}
