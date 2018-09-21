package com.cblog.common;

import java.util.UUID;

/**
 * Created by chencc on 2018/9/21.
 */
public class UUIDUtil {
    public static void main (String[] args) {
        System.out.println(getUUID32());
    }
    /*
    *建议使用uuid作为主键，不会重复
    *获取uuid，唯一标识符
    */
    public static String getUUID32(){
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }
}
