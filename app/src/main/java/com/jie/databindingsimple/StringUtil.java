package com.jie.databindingsimple;

/**
 * desc：文字工具类
 * author：haojie
 * date：2017/11/21
 */
public class StringUtil {
    /**
     * 实现文字倒序
     * @param text
     * @return
     */
    public static String reverseString(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        return  stringBuffer.reverse().toString();
    }
}
