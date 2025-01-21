package com.xhl.xhlpicturebackend.exception;

/**
 * 抛出异常工具类
 * @author 小火龙
 * @date 2025/1/4
 */
public class ThrowUtils {

    /**
     * @param condition
     * @param runtimeException 可以代表自定义的对象
     */
    public static void throwIf(boolean condition,RuntimeException runtimeException){
        if(condition){
            throw runtimeException;
        }
    }

    /**
     * @param condition
     * @param errorCode
     */
    public static void throwIf(boolean condition,ErrorCode errorCode){
        if (condition){
            throwIf(condition,new BusinessException(errorCode));
        }
    }

    /**
     * @param condition
     * @param errorCode
     * @param message
     */
    public static void throwIf(boolean condition,ErrorCode errorCode,String message){
        if(condition){
            throwIf(condition,new BusinessException(errorCode,message));
        }
    }
}
