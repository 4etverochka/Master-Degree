package app.core.test_data;

import org.testng.annotations.DataProvider;

public class KpiDataProvider {
    private static final int TEACHERS_LINK_NUMBER=4;
    private static final int TEACHERS_LINK_NUMBER_ON_ENG_LOCALE=3;
    private static final int CHANGE_LANGUAGE_LINK_NUMBER=8;
    private static final int COUNT_OF_TEACHERS=35;
    private static final int TEACHER_FROM_LIST_NUMBER =14;

    private static final String TEACHER_FIO="КУЧУК ГЕОРГИЙ АНАТОЛЬЕВИЧ";

    @DataProvider(name = "teacher_fio")
    public static Object[][] teacherFioData() {
        return new Object[][]{{TEACHERS_LINK_NUMBER, TEACHER_FROM_LIST_NUMBER, TEACHER_FIO}};
    }

    @DataProvider(name = "teachers_count")
    public static Object[][] teachersCountData() {
        return new Object[][]{{TEACHERS_LINK_NUMBER, COUNT_OF_TEACHERS, CHANGE_LANGUAGE_LINK_NUMBER, TEACHERS_LINK_NUMBER_ON_ENG_LOCALE}};
    }
}
