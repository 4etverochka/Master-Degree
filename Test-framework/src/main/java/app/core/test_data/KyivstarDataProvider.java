package app.core.test_data;

import org.testng.annotations.DataProvider;

public class KyivstarDataProvider {
    private static final int COUNT_BEFORE_SELECT_CHECKBOX=5;
    private static final int COUNT_AFTER_SELECT_CHECKBOX=2;
    private static final int SEARCH_VALUES_COUNT=10;

    private static final String SEARCH_TEXT="магазин";

    @DataProvider(name = "checkbox_data")
    public static Object[][] checkboxData() {
        return new Object[][]{{COUNT_BEFORE_SELECT_CHECKBOX, COUNT_AFTER_SELECT_CHECKBOX}};
    }

    @DataProvider(name = "search_data")
    public static Object[][] searchData() {
        return new Object[][]{{SEARCH_TEXT, SEARCH_VALUES_COUNT}};
    }

}
