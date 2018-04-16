package com.url.utils;

/**
 * 数字的操作类，例如long转16进制数等
 * Created by haojy on 2018/3/30.
 */
public class NumUtils {

    public static String long2String(long num) {
        return Long.toString(num, 36);
    }

    public static Long string2Long(String numStr) {
        return Long.valueOf(numStr, 36);
    }

    public static void main(String[] args) {
        System.out.println(long2String(111111111111111L));
        System.out.println(string2Long("13dvqmr26f"));
    }
}
