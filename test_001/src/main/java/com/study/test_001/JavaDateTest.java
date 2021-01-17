package com.study.test_001;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Copyright © 2021 YoXung All Rights Reserved
 *
 * @author YoXung
 * @version 2021/1/16
 */
public class JavaDateTest {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("原始日期时间为：" + dateTime);
        // 日期转字符
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM//dd HH:mm:ss");
        String str = dateTime.format(formatter1);
        System.out.println("日期时间转字符串结果为：" + str);
        // 字符转日期
        LocalDate date = LocalDate.parse(str, formatter1);
        System.out.println("字符串转日期结果为："+date);

    }
}
