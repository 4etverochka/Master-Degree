package tests.kyivstar.ua;

import app.core.test_data.KyivstarDataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kyivstar.ua.steps.HomePageSteps;

public class SearchTest extends BaseTest {
    private HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Check valid search list size after searching.", dataProvider = "search_data", dataProviderClass = KyivstarDataProvider.class)
    public void validSearchListSize(String searchText) {
        homePageSteps.openHomePage()
                .clickOnSearchIcon()
                .enterSearch(searchText)
                .checkSearchResultsListSize(searchText);
    }

}
