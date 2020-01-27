package app.core.test_data;

import org.testng.annotations.DataProvider;

public class KpiDataProvider {
    private static final int NUMBER_ZERO = 0;
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_THREE = 3;
    private static final int NUMBER_FOUR = 4;
    private static final int NUMBER_FIVE = 5;
    private static final int NUMBER_SIX = 6;
    private static final int NUMBER_SEVEN = 7;
    private static final int NUMBER_EIGHT = 8;
    private static final int NUMBER_NINE = 9;
    private static final int NUMBER_TEN = 10;

    private static final int CHANGE_LANGUAGE_LINK_NUMBER = NUMBER_EIGHT;
    private static final int COUNT_OF_TEACHERS = 35;
    private static final int TEACHER_FROM_LIST_NUMBER = 14;

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

    @DataProvider(name = "teacher_fio")
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
        return new Object[][]{{NUMBER_FOUR, COUNT_OF_TEACHERS, CHANGE_LANGUAGE_LINK_NUMBER, NUMBER_TWO}};
    }
}
