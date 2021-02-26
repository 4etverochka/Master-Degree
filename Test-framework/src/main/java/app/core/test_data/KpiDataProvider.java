package app.core.test_data;

import org.testng.annotations.DataProvider;

public class KpiDataProvider {
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_FOUR = 4;
    private static final int NUMBER_SIX = 6;
    private static final int NUMBER_EIGHT = 8;

    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_EIGHT;
    private static final int COUNT_OF_TEACHERS = 36;
    private static final int TEACHER_FROM_LIST_NUMBER = 15;

    private static final String TEACHER_FIO_RUS = "КУЧУК ГЕОРГИЙ АНАТОЛЬЕВИЧ";
    private static final String TEACHER_FIO_UKR = "КУЧУК ГЕОРГІЙ АНАТОЛІЙОВИЧ";

    private static final String TITLE_UKR = "ПРАЦЕВЛАШТУВАННЯ";
    private static final String TITLE_RUS = "ТРУДОУСТРОЙСТВО";
    private static final String TITLE_ENG = "EMPLOYMENT";

    private static final String PARTNERS_UKR = "Наші партнери:";
    private static final String PARTNERS_RUS = "Наши партнеры:";
    private static final String PARTNERS_ENG = "Our partners:";

    private static final String INFO_UKR = "Фірми EPAM (аудиторія 313 вк) " +
            "та GlobalLogic (аудиторія 305 вк) проводять тренінги для наших студентів.";
    private static final String INFO_RUS = "Фирмы EPAM (аудитория 313 вк) " +
            "и  GlobalLogic (аудитория 305 вк) проводят тренинги для наших студентов.";

    private static final String EPAM_LOGO = "http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2015/12/epam1.jpg";
    private static final String NIX_LOGO = "http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2015/12/nix1-300x82.jpg";
    private static final String SOFT_SERVE_LOGO = "http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2019/11/soft-serve_logo_6.png";
    private static final String INSART_LOGO = "http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2015/12/insart1.jpg";
    private static final String GLOBAL_LOGIC_LOGO = "http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2019/11/logo_GlobalLogic-300x133.png";

    private static final String VALID_SEARCH_DATA = "Преподаватели";
    private static final String INVALID_SEARCH_DATA = "123D12";
    private static final String ERROR_MESSAGE = "Sorry, but nothing matched your search terms. Please try again with some different keywords.";

    private static final String COPYRIGHT = "© 2020 кафедра \"ВТП\" Разработка: Антонюк В.В.";

    private static final String FACEBOOK_KPI = "https://www.facebook.com/ntu.xpi/";
    private static final String TWITTER_KPI = "https://twitter.com/ntu_xpi";
    private static final String LINK_KPI = "http://www.kpi.kharkov.ua/ukr/";
    private static final String INSTAGRAM_KPI = "https://www.instagram.com/otp_ntu_khpi/";
    private static final String YOUTUBE_KPI = "youtube.com";

    @DataProvider(name = "teacher_full_name")
    public static Object[][] teacherFioData() {
        return new Object[][]{{
                NUMBER_FOUR,
                TEACHER_FROM_LIST_NUMBER,
                CHANGE_LANGUAGE_LINK_NUMBER,
                TEACHER_FIO_RUS,
                TEACHER_FIO_UKR
        }};
    }

    @DataProvider(name = "employment_info")
    public static Object[][] employmentInfo() {
        return new Object[][]{{
                TITLE_UKR,
                TITLE_RUS,
                TITLE_ENG,
                PARTNERS_UKR,
                PARTNERS_RUS,
                PARTNERS_ENG,
                INFO_UKR,
                INFO_RUS,
                EPAM_LOGO,
                NIX_LOGO,
                SOFT_SERVE_LOGO,
                INSART_LOGO,
                GLOBAL_LOGIC_LOGO,
                NUMBER_SIX,
                CHANGE_LANGUAGE_LINK_NUMBER
        }};
    }

    @DataProvider(name = "teachers_count")
    public static Object[][] teachersCountData() {
        return new Object[][]{{
                NUMBER_FOUR,
                COUNT_OF_TEACHERS,
                CHANGE_LANGUAGE_LINK_NUMBER,
                NUMBER_TWO
        }};
    }

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