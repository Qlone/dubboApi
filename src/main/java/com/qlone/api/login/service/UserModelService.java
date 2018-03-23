package com.qlone.api.login.service;

public interface UserModelService {

    /**
     *
     * @param account 账号名称
     * @param password 输入的密码，存入数据库时进行加密
     * @return 一个含有有效时长的唯一token，用于进行用户身份确认
     */
     String loginAndGetToken(String account,String password);

}
