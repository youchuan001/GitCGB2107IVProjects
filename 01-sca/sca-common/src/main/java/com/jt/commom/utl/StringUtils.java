package com.jt.commom.utl;


/**
 * 自己定义一个操作字符串的工具类*/
public class StringUtils {
    /**
     * 判断字符串是否为空
     * str为要验证的字符串
     * true表示空*/
    public static boolean isEmpty(String str) {

        return str ==null || "".equals(str);
    }
}
