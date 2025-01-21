package com.xhl.xhlpicturebackend.common;

import com.xhl.xhlpicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author szdaiyifei
 * @param <T>
 * 通用响应返回类
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }


}

