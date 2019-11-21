package com.example.xixie.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hzz on 2018/12/20
 */
public class DateUtil {
    /**
     * @description 获取当前时间日期
     * @author hzz
     * @date 2019/1/3 10:01
    **/
    public static Date getCurrentDate() {
        try {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String s = sdf.format(date);
            return sdf.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @description date日期转string
     * @author hzz
     * @date 2018/12/21 9:26
     **/
    public static String convertDateToString(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}
