package com.ctgu.examsystem.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.InvalidParameterException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public static final int SECONDS_IN_HOUR = 3600;
    public static final int MILLISECONDS_IN_HOUR = SECONDS_IN_HOUR * 1000;
    public static final int MILLISECONDS_IN_DAY = MILLISECONDS_IN_HOUR * 24;

    /**
     * 格式化时间到字符串
     *
     * @param date        时间
     * @param timePattern 时间格式
     * @return 格式化后的字符串
     */
    public static String dateToString(Date date, TimePattern timePattern) {
        DateFormat dateFormat = new SimpleDateFormat(timePattern.pattern);

        return dateFormat.format(date);
    }

    /**
     * 转化字符串到时间
     *
     * @param dateStr     时间字符串
     * @param timePattern 时间格式
     * @return 时间
     */
    public static Date stringToDate(String dateStr, TimePattern timePattern) {
        DateFormat dateFormat = new SimpleDateFormat(timePattern.pattern);

        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            logger.warn("时间转换异常，源：{}", dateStr, e);
            return null;
        }
    }

    /**
     * 获取当天日期
     *
     * @return 当天日期
     */
    public static Date getCurrentDateTime() {
        Calendar calendar = Calendar.getInstance();

        clearDownHour(calendar);

        return calendar.getTime();
    }

    /**
     * 将时间戳转化为日期格式
     *
     * @param timestamp 时间戳
     * @return 日期格式时间 yyyy-MM-dd
     */
    public static Date getDateTimeFromTimestamp(Long timestamp) {
        if (timestamp == null || timestamp == 0) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);

        clearDownHour(calendar);

        return calendar.getTime();
    }

    /**
     * 将时间转化为日期格式
     *
     * @param time 时间
     * @return 日期格式时间 yyyy-MM-dd
     */
    public static Date getDateTimeFromTime(Date time) {
        if (time == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);

        clearDownHour(calendar);

        return calendar.getTime();
    }

    /**
     * 将时间加天数
     *
     * @param time 时间
     * @return 日期
     */
    public static Date addDays(Date time, int days) {
        if (time == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);

        calendar.add(Calendar.DAY_OF_MONTH, days);

        return calendar.getTime();
    }

    /**
     * 计算两个日期中差多少天
     *
     * @param date1 日期1
     * @param date2 日期2
     * @return 相差天数
     */
    public static int diffDays(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new InvalidParameterException("参数不能为空");
        }

        LocalDateTime local1 = LocalDateTime.ofInstant(date1.toInstant(), ZoneId.systemDefault());
        LocalDateTime local2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());

        Period between = Period.between(local2.toLocalDate(), local1.toLocalDate());

        return between.getDays();
    }

    /**
     * 清除日历时分秒毫秒
     *
     * @param calendar 日历格式
     */
    private static void clearDownHour(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }

    /**
     * 时间格式枚举
     */
    public enum TimePattern {
        /**
         * 时间格式
         */
        YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss"),
        YYYY_MM_DD("yyyy-MM-dd"),
        YYYYMMDD("yyyyMMdd");

        /**
         * 格式
         */
        private String pattern;

        TimePattern(String pattern) {
            this.pattern = pattern;
        }
    }

    private DateUtils() {
    }
}
