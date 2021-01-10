package tests.kpi.otp;

import app.core.elements.kpi.otp.pages.HomePage;
import app.core.test_data.KpiDataProvider;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class SearchResultTest extends BaseTest {

    @Test(description = "Check Search Result page shows result after data is entered.",
            dataProvider = "search_result",
            dataProviderClass = KpiDataProvider.class)
    public void checkSearchResultPageShowsResultForValidInput(String validData,
                                                              String resultText,
                                                              String invalidSearchData,
                                                              String errorMessage) {
        page(HomePage.class)
                .openPage()
                .enterValidDataToSearchFragment(validData)
                .checkValidResultOnSearchResultPage(resultText)
                .enterInvalidDataToSearchFragment(invalidSearchData)
                .checkInvalidResultOnSearchResultPage(errorMessage);
    }
}
