package com.example.dubboservicetwo.service.impl;

import com.example.dubboserviceone.api.StringDubboService;
import com.example.dubboserviceone.vo.UserInfoVo;
import com.example.dubboservicetwo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Reference
    private StringDubboService stringDubboService;


    private static Map<String,String> userMap = new HashMap<>();

    static {
        userMap.put("xiaoming","北京");
        userMap.put("xiaohua","湖南");
        userMap.put("小小","山西");
    }

    @Override
    public String sayHello(String userName) {
        String address = userMap.get(userName);
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setAddress(address);
        userInfoVo.setUserName(userName);
        return stringDubboService.getHelloStr(userInfoVo);
    }

    @Override
    public String sayHelloV2(String userName) {
        return userMap.get(userName);
    }
}
