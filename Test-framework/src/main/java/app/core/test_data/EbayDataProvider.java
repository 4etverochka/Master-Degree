package app.core.test_data;

import org.testng.annotations.DataProvider;

public class EbayDataProvider {
    private static final String VALID_EMAIL = "testing019238@gmail.com";
    private static final String VALID_PASSWORD = "Testing123!";
    private static final String USERNAME = "Oleksii";
    private static final String INVALID_PASSWORD_ERROR_MESSAGE = "Oops, that's not a match.";

    private static final String FIRST_SEARCH_ITEM = "sega";
    private static final String SECOND_SEARCH_ITEM = "iphone 7 jet black";
    private static final String THIRD_SEARCH_ITEM = "nexus 7 black";

    private static final int FIRST_NUMBER = 1;
    private static final int SECOND_NUMBER = 2;
    private static final int THIRD_NUMBER = 3;

    private static final String DELETE_MESSAGE = "was removed from your cart.";
    private static final String CATEGORY_ERROR_MESSAGE = "Top level category browsing is not allowed. " +
            "Please provide keywords or more filters for the applied top level category.";

    @DataProvider(name = "valid_credentials")
    public static Object[][] validCredentials() {
        return new Object[][]{{VALID_EMAIL, VALID_PASSWORD, USERNAME}};
    }

    @DataProvider(name = "invalid_credentials")
    public static Object[][] invalidCredentials() {
        return new Object[][]{{VALID_EMAIL, VALID_PASSWORD + "!", INVALID_PASSWORD_ERROR_MESSAGE}};
    }

    @DataProvider(name = "search_data")
    public static Object[][] searchData() {
        return new Object[][]{{FIRST_NUMBER, CATEGORY_ERROR_MESSAGE}};
    }

    @DataProvider(name = "shopping_cart_list_data")
    public static Object[][] shoppingCartListData() {
        return new Object[][]{{FIRST_SEARCH_ITEM, FIRST_NUMBER, SECOND_SEARCH_ITEM, SECOND_NUMBER,
                THIRD_SEARCH_ITEM, THIRD_NUMBER, DELETE_MESSAGE}};
    }

    @DataProvider(name = "save_for_later_list_data")
    public static Object[][] saveForLaterListData() {
        return new Object[][]{{SECOND_SEARCH_ITEM, FIRST_NUMBER, VALID_EMAIL, VALID_PASSWORD, DELETE_MESSAGE}};
    }
}
