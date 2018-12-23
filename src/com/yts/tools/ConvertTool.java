package com.yts.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 转换工具
 * @author YellowTulipShow
 */
public class ConvertTool {
    /**
     * 转为字符串
     * @param obj Object 对象类型
     */
    public static String ToString(Object obj) {
        return String.valueOf(obj);
    }

    /**
     * 转为字符串
     * @param str 字符串
     */
    public static String ToString(String str) {
        return CheckData.IsStringNull(str) ? GKeys.StrEmpty : str;
    }

    /**
     * 转为字符串
     * @param i 基本数值类型
     */
    public static String ToString(int i) {
        return String.valueOf(i);
    }

    /**
     * 转为字符串
     * @param date Date 时间类型
     */
    public static String ToString(Date date) {
        SimpleDateFormat sdf = CommonData.DateFormat();
        return sdf.format(date);
    }

    /**
     * 转为时间类型
     * @param obj Object 对象类型
     */
    public static Date ToDate(Object obj) throws Exception {
        String str = ToString(obj);
        return ToDate(str);
    }

    /**
     * 转为时间类型
     * @param str 字符串
     */
    public static Date ToDate(String str) throws Exception {
        SimpleDateFormat sdf = CommonData.DateFormat();
        return sdf.parse(str);
    }
}
