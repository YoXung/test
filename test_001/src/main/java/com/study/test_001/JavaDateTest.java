package com.study.test_001;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Copyright © 2021 YoXung All Rights Reserved
 *
 * @author YoXung
 * @version 2021/1/16
 */
@Slf4j
public class JavaDateTest {

    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        log.info("LocalDateTime得到的原始日期时间为：{}", date1);
        // java8新特性：https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        // 日期转字符
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a", Locale.ENGLISH);
        String dateStr = date1.format(formatter);
        log.info("12/24小时日期时间转字符串（带AM/PM）结果为：{}", dateStr);
        // 字符转日期
        LocalDateTime date2 = LocalDateTime.parse(dateStr, formatter);
        log.info("字符串转日期结果为：{}", date2);
    }
}
