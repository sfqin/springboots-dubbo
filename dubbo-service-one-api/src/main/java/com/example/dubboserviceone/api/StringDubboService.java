package com.example.dubboserviceone.api;

import com.example.dubboserviceone.vo.UserInfoVo;

/**
 * string service
 */
public interface StringDubboService {

    /**
     *  say hello to someone
     * @param userInfoVo
     * @return
     */
    String getHelloStr(UserInfoVo userInfoVo);

}
