package com.yts.tools;

import java.text.SimpleDateFormat;

/**
 * 常用数据
 * @author YellowTulipShow
 */
public class CommonData {
    /**
     * 时间格式
     * @return 框架内置类创建的时间格式
     */
    public static SimpleDateFormat DateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat(GKeys.DATE_FORMAT_DAY);
        return sdf;
    }
}
