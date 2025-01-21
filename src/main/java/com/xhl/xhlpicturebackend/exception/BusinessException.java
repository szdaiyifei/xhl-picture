package com.xhl.xhlpicturebackend.exception;

import lombok.Getter;

/**
 * @author 小火龙
 * @date 2025/1/4
 * 自定义业务异常
 */
@Getter
public class BusinessException extends RuntimeException{
    /**
     * 错误码
     */
    private final int code;

    /**
     * @param code
     * @param message
     * 直接传入
     */
    public BusinessException(int code,String message) {
        super(message);
        this.code = code;
    }


    /**
     * @param errorCode
     * 通过 ErrorCode 对象
     */
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code  = errorCode.getCode();
    }

    /**
     * @param errorCode
     * @param message
     */
    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
