package com.qlone.api.basic.enumapi;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.io.Serializable;

public enum ApiEnum implements Serializable{

    USER_SUCCESS("200","操作成功"),
    USER_FAIL("201","操作失败"),
    USER_PARAMTER_FAIL("202","缺少参数"),

    USER_ACCOUNT_EXSITS("10001","账号已经存在");
    ;
    public static <T>  ApiResult<ApiEnum,T> userResult(ApiEnum code,Object msg){
        return new ApiResult<>(code,(T)msg);
    }

    ApiEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
