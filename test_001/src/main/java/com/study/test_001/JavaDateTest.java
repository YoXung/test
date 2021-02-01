package com.study.test_001;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
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
        LocalDateTime dateTime = LocalDateTime.now();
        log.info("LocalDateTime得到的原始日期时间为：{}", dateTime);
        // 日期转字符
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a", Locale.ENGLISH);
        String str = dateTime.format(formatter1);
        log.info("12/24小时日期时间转字符串（带AM/PM）结果为：{}", str);
        // 字符转日期
        LocalDateTime date2 = LocalDateTime.parse(str, formatter1);
        log.info("字符串转日期结果为：{}", date2);

    }
}
