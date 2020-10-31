package app.core.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarUtils {
    private static final String DATE_FORMAT = "mm:ss:S";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);

    public String convertMilliSecondsToFormattedDate(long milliSeconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return simpleDateFormat.format(calendar.getTime());
    }
}
