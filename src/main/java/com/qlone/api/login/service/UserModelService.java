package com.qlone.api.login.service;

public interface UserModelService {

    /**
     * 默认不支持多人登陆
     * @param account 账号名称
     * @param password 输入的密码，存入数据库时进行加密
     * @return 一个含有有效时长的唯一token，用于进行用户身份确认
     */
     String loginAndGetToken(String account,String password);

    /**
     *
     * @param account
     * @param password
     * @param muiltylogin  是否支持多客户端登陆，若不支持，登陆成功后其他客户端权限失效
     * @return
     */
     String loginAndGetToken(String account,String password,boolean muiltylogin);

    /**
     * 验证token 权限是否依旧有效，返回userId
     * @param token
     * @return 返回token 对应的 userId
     */
     String checkToken(String token);
}
