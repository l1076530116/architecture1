package com.lb.architecture1.util.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatHelper {

    private DateFormatHelper() {}
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String long2Str(long time){
        Date date = new Date(time);
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.format(date);
    }
}
