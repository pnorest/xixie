package com.example.xixie.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by hzz on 2018/12/20
 */
public class StringUtil {
    /**
     * @description `string转date
     * @author hzz
     * @date 2018/12/28 13:35
     **/
    public static Date convertStringToDate(String s) throws ParseException {
        if (StringUtils.isEmpty(s)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(s);
    }

    /**
     * @description 本地存储文件名uuid
     * @author hzz
     * @date 2018/12/28 13:35
     **/
    public static String uuidStr() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        System.out.println(uuidStr());
    }
}
