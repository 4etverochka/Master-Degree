package tests.ebay.com;

import app.core.test_data.EbayDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.ebay.com.steps.HomePageSteps;

public class SearchTest extends BaseTest {
    private HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Search with empty search field and chosen item category.",
            dataProvider = "search_data", dataProviderClass = EbayDataProvider.class)
    public void emptySearchFieldTest(int categoryNumber, String errorMessage) {
        homePageSteps.openPage()
                .chooseCategory(categoryNumber)
                .clickOnSearchButton()
                .checkEmptySearchFieldErrorText(errorMessage);
    }
}
