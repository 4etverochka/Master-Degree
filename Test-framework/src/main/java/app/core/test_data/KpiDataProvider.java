package app.core.test_data;

import org.testng.annotations.DataProvider;

public class KpiDataProvider {
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_FOUR = 4;
    private static final int NUMBER_SIX = 6;
    private static final int NUMBER_EIGHT = 8;

    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_EIGHT;
    private static final int COUNT_OF_TEACHERS = 41;

    private static final String VALID_SEARCH_DATA = "Преподаватели";
    private static final String INVALID_SEARCH_DATA = "123D12";
    private static final String ERROR_MESSAGE = "Sorry, but nothing matched your search terms. Please try again with some different keywords.";

    private static final String COPYRIGHT = "© 2020 кафедра \"ВТП\" Разработка: Антонюк В.В.";

    private static final String FACEBOOK_KPI = "https://www.facebook.com/ntu.xpi/";
    private static final String TWITTER_KPI = "https://twitter.com/ntu_xpi";
    private static final String LINK_KPI = "http://www.kpi.kharkov.ua/ukr/";
    private static final String INSTAGRAM_KPI = "https://www.instagram.com/otp_ntu_khpi/";
    private static final String YOUTUBE_KPI = "youtube.com";

    @DataProvider(name = "search_result")
    public static Object[][] searchResultValidData() {
        return new Object[][]{{
                VALID_SEARCH_DATA,
                VALID_SEARCH_DATA,
                INVALID_SEARCH_DATA,
                ERROR_MESSAGE
        }};
    }

    @DataProvider(name = "copyright_info")
    public static Object[][] copyrightInfo() {
        return new Object[][]{{
                COPYRIGHT,
                CHANGE_LANGUAGE_LINK_NUMBER
        }};
    }

    @DataProvider(name = "social_networks_info")
    public static Object[][] socialNetworksInfo() {
        return new Object[][]{{
                FACEBOOK_KPI,
                TWITTER_KPI,
                LINK_KPI,
                INSTAGRAM_KPI,
                YOUTUBE_KPI
        }};
    }
}