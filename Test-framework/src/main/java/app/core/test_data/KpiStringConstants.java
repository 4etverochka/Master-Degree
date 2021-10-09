package app.core.test_data;

import lombok.Getter;

public enum KpiStringConstants {

    TEACHER_FIO_RUS("КУЧУК ГЕОРГИЙ АНАТОЛЬЕВИЧ"),
    TEACHER_FIO_UKR("КУЧУК ГЕОРГІЙ АНАТОЛІЙОВИЧ"),

    TITLE_UKR("ПРАЦЕВЛАШТУВАННЯ"),
    TITLE_RUS("ТРУДОУСТРОЙСТВО"),
    TITLE_ENG("EMPLOYMENT"),

    PARTNERS_UKR("Наші партнери:"),
    PARTNERS_RUS("Наши партнеры:"),
    PARTNERS_ENG("Our partners:") ,

    INFO_UKR("Фірми EPAM (аудиторія 313 вк) " +
            "та GlobalLogic (аудиторія 305 вк) проводять тренінги для наших студентів."),
    INFO_RUS("Фирмы EPAM (аудитория 313 вк) " +
            "и  GlobalLogic (аудитория 305 вк) проводят тренинги для наших студентов."),

    EPAM_LOGO ("http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2015/12/epam1.jpg"),
    NIX_LOGO("http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2015/12/nix1-300x82.jpg"),
    SOFT_SERVE_LOGO("http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2019/11/soft-serve_logo_6.png"),
    INSART_LOGO("http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2015/12/insart1.jpg"),
    GLOBAL_LOGIC_LOGO("http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2019/11/logo_GlobalLogic-300x133.png"),

    HEAD_OF_DEPARTMENT_FULL_NAME("Семенов Сергей Геннадьевич"),
    PHONE_NUMBER_ONE("067-579-30-82"),
    PHONE_NUMBER_TWO("050-300-76-47"),
    ADDRESS_IMAGE("http://web.kpi.kharkov.ua/otp/wp-content/uploads/sites/152/2021/04/Black.gif"),

    VALID_SEARCH_DATA("Преподаватели"),
    INVALID_SEARCH_DATA("123D12"),
    ERROR_MESSAGE("Sorry, but nothing matched your search terms. Please try again with some different keywords."),

    DEPARTMENT_TODAY_RU("кафедра сегодня"),
    DEPARTMENT_TODAY_UKR("кафедра сьогодні"),
    DEPARTMENT_TODAY_EN("DEPARTMENT TODAY"),

    COPYRIGHT("© 2020 кафедра \"ВТП\" Разработка: Антонюк В.В."),

    HEAD_OF_DEPARTMENT_FULL_NAME_ON_CONTACT_US_PAGE("д. т. н. Семенов Сергей Геннадьевич"),
    HEAD_OF_DEPARTMENT_PHONE_NUMBER_ONE_ON_CONTACT_US_PAGE("тел. 067-579-30-82"),
    HEAD_OF_DEPARTMENT_PHONE_NUMBER_TWO_ON_CONTACT_US_PAGE("тел. 050-300-76-47"),
    DEPARTMENT_PHONE_NUMBER_ON_CONTACT_US_PAGE("\n" +
            "тел. 707-61-65"),
    DEPARTMENT_ADDRESS_ON_CONTACT_US_PAGE("Вечерний корпус, к. 309"),
    DEPARTMENT_EMAIL_ON_CONTACT_US_PAGE("e-mail: kafedra_otp_2016@ukr.net"),

    FACEBOOK_KPI("https://www.facebook.com/ntu.xpi/"),
    TWITTER_KPI("https://twitter.com/ntu_xpi"),
    LINK_KPI("http://www.kpi.kharkov.ua/ukr/"),
    INSTAGRAM_KPI("https://www.instagram.com/otp_ntu_khpi/"),
    YOUTUBE_KPI("youtube.com"),

    HEAD_OF_DEPARTMENT_PAGE_TITLE_RU("СЕМЕНОВ СЕРГЕЙ ГЕННАДЬЕВИЧ"),
    POSITION_RU("Заведующий кафедрой"),
    SCIENTIFIC_DEGREE_RU("доктор технических наук"),
    SCIENTIFIC_TITLE_RU("профессор"),
    HEAD_OF_DEPARTMENT_PAGE_TITLE_UKR("СЕМЕНОВ СЕРГІЙ ГЕННАДІЙОВИЧ"),
    POSITION_UKR("Завідувач кафедри"),
    SCIENTIFIC_DEGREE_UKR("доктор технічних наук"),
    SCIENTIFIC_TITLE_UKR("професор"),
    HEAD_OF_DEPARTMENT_PAGE_TITLE_EN("SEMENOV SERHII GENNADIEVICH"),
    POSITION_EN("Head of Department of Computer Engineering and Programming"),
    SCIENTIFIC_DEGREE_EN("doctor of technical sciences"),
    SCIENTIFIC_TITLE_EN("Senior Researcher in the specialty 05.13.03 “Systems and Control Processes”"),

    EDUCATIONAL_AND_PROFESSIONAL_PROGRAM_URL("http://web.kpi.kharkov.ua/otp/wp-content/"),
    EDUCATIONAL_DISCIPLINES_URL("http://web.kpi.kharkov.ua/otp/en/educational-disciplines/"),
    STUDENTS_TIMETABLE_URL("http://web.kpi.kharkov.ua/otp/en/timetable-of-students/"),
    GROUP_CURATORS_URL("http://web.kpi.kharkov.ua/otp/en/surators/"),
    DISCIPLINES_DURING_THE_QUARANTINE_TIME_URL("https://drive.google.com/drive"),

    GALLERY_PAGE_TITLE("ГАЛЕРЕЯ"),
    GALLERY_PAGE_TITLE_ENG("Gallery"),
    GALLERY_PAGE_URL_RUS("galerry"),
    GALLERY_PAGE_URL_UKR("galereya"),
    GALLERY_PAGE_URL_ENG("gallery"),

    FEEDBACK_URL("Pismo-iz-Mongolii"),

    DEPARTMENT_HISTORY_PAGE_TITLE_RU("Краткая история кафедры"),
    DEPARTMENT_HISTORY_PAGE_TITLE_UKR("Коротка історія кафедри"),
    DEPARTMENT_HISTORY_PAGE_URL("istoriya"),

    IT_SQUARE_OF_UNIVERSITY_TITLE_RUS("IT-СКВЕР УНИВЕРСИТЕТА"),
    IT_SQUARE_OF_UNIVERSITY_TITLE_UKR("IT-СКВЕР УНІВЕРСИТЕТУ"),
    IT_SQUARE_OF_UNIVERSITY_TITLE_ENG("IT-SQUARE OF UNIVERSITY"),
    IT_SQUARE_OF_UNIVERSITY_URL_RUS("http://web.kpi.kharkov.ua/otp/ru/4725-2/"),
    IT_SQUARE_OF_UNIVERSITY_URL_UKR("it-skver-universitetu"),
    IT_SQUARE_OF_UNIVERSITY_URL_ENG("http://web.kpi.kharkov.ua/otp/en/it-square-of-university/"),

    EDUCATIONAL_PROCESS_SCHEDULE_RU("ГРАФИК УЧЕБНОГО ПРОЦЕССА"),
    EDUCATIONAL_PROCESS_SCHEDULE_UKR("ГРАФІК НАВЧАЛЬНОГО ПРОЦЕСУ"),
    EXTRAMURAL_STUDY_SCHEDULE_LINK_RU("grafik-uchebnogo-protsessa/"),
    EXTRAMURAL_STUDY_SCHEDULE_LINK_UA("grafik-navchalnogo-protsesa/"),

    STUDENTS_SCHEDULE_RUS("Расписание занятий студентов"),
    STUDENTS_SCHEDULE_UKR("Розклад занять студентів"),

    TEACHERS_SCHEDULE_TITLE("РОЗКЛАД ЗАНЯТЬ ВИКЛАДАЧIВ"),
    TEACHERS_SCHEDULE_URL("PrepodList"),

    CURATORS_PAGE_TITLE_RU("КУРАТОРЫ"),
    CURATORS_PAGE_TITLE_UKR("КУРАТОРИ"),
    CURATORS_PAGE_URL_RU("kuratory"),
    CURATORS_PAGE_URL_UKR("kuratori"),

    METHODOLOGICAL_MATERIALS_URL("drive.google.com"),

    SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_TITLE_RU("Научные школы кафедры"),
    SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_TITLE_UKR("Наукові школи кафедри"),
    SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_URL_RU("nauchnye-shkoly-kafedry"),
    SCIENTIFIC_SCHOOLS_DEPARTMENTS_PAGE_URL_UKR("naukovi-shkoli-kafedri"),

    CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_TITLE_RU("Конференции и издательская деятельность"),
    CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_TITLE_UKR("Конференції та видавнича діяльність"),
    CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_URL_RU("konferentsii-i-izdatelskaya-deyatelnost"),
    CONFERENCES_AND_PUBLISHING_ACTIVITIES_PAGE_URL_UKR("konferentsiyi-ta-vidavnicha-diyalnist"),

    ROBOFEST_PAGE_TITLE("RoboFest-2020"),
    ROBOFEST_PAGE_URL("robofest-2020"),

    ENROLLEE_PAGE_TITLE_RU("Абитуриенту"),
    ENROLLEE_PAGE_TITLE_UKR("Абітурієнту"),
    ENROLLEE_PAGE_URL("abiturientu"),

    ADMISSION_RULES_21_URL("pravyla-pryiomu-ntu-khpi-2021"),

    SELECTION_COMMITTEE_URL("pravyla_pryiomu_do_ntu_khpi_v_2020"),

    VIRTUAL_TOUR_PAGE_TITLE_RU("Виртуальная экскурсия"),
    VIRTUAL_TOUR_PAGE_TITLE_UKR("Віртуальна екскурсія"),
    VIRTUAL_TOUR_PAGE_URL("ekskursiya"),

    ELITE_SCHOOL_PAGE_URL("polytechnik"),

    IT_KIDS_SCHOOL_PAGE_URL("it-kids"),

    GAMES_3D_PAGE_TITLE("Школа компьютерных инженеров"),
    GAMES_3D_PAGE_URL("http://www.kozina.com.ua/"),

    GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_RUS("Инновационная учебная embedded-лаборатория от компании GlobalLogic"),
    GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_TITLE_UKR("Інноваційна навчальна embedded-лабораторія від компанії GlobalLogic"),
    GLOBALLOGIC_INNOVATIVE_LABORATORY_PAGE_URL("globallogic"),

    GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_RUS("ВИЗИТ КОМПАНИИ «GIULIANI SECURITY & SAFETY LLC» (США)"),
    GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_TITLE_UKR("ВІЗИТ КОМПАНІЇ «GIULIANI SECURITY & SAFETY LLC» (США)"),
    GIULIANI_SECURITY_AND_SAFETY_LLC_PAGE_URL("giuliani-security-amp-safety-llc-ssha");

    @Getter
    private final String value;

    KpiStringConstants(final String newValue) {
        value = newValue;
    }
}