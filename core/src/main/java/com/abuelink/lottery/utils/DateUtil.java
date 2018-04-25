package com.abuelink.lottery.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * \* User: xjlu@iflytek.com
 * \* Date: 2018/4/25
 * \* Time: 21:43
 * \* Description:
 * \
 */
public class DateUtil {

    /**
     * 格式化爬虫获取到的时间日期
     * @param time
     * @return
     */
    public String parseSpiderDate(String time){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        Date date=new Date(Long.parseLong(time));
        return simpleDateFormat.format(date);
    }
}