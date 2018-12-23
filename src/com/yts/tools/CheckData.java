package com.yts.tools;

/**
 * 检查数据
 * @author YellowTulipShow
 */
public class CheckData {
    /**
     * 对象是否为空
     * @param obj 需要检查的对象
     * @return true 为空, false 不为空
     */
    public static boolean IsObjectNull(Object obj) {
        return obj.equals(null) || obj == null;
    }

    /**
     * 字符串是否空
     * @param str 需要检查的对象
     * @return true 为空, false 不为空
     */
    public static boolean IsStringNull(String str) {
        return IsObjectNull(str) || str.equals(GKeys.StrEmpty) || str.equals("") || str.length() <= 0;
    }
}
