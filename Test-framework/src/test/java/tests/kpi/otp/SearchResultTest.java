package tests.kpi.otp;

import app.core.test_data.KpiDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.kpi.otp.steps.HomePageSteps;

public class SearchResultTest extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Check Search Result page shows result after data is entered.",
            dataProvider = "search_result",
            dataProviderClass = KpiDataProvider.class)
    public void checkSearchResultPageShowsResultForValidInput(String validData,
                                                              String resultText,
                                                              String invalidSearchData,
                                                              String errorMessage) {
        homePageSteps.openPage()
                .enterValidDataToSearchFragment(validData)
                .checkValidResultOnSearchResultPage(resultText)
                .enterInvalidDataToSearchFragment(invalidSearchData)
                .checkInvalidResultOnSearchResultPage(errorMessage);
    }
}
