package com.wang.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/2.
 */
public class DateUtil {

    public static String pattern_xg="yyyy/MM/dd";

    /**
     * 格式化日期
     * @param date
     * @param pattern
     * @return
     */
    public static String getDateStr(Date date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}


