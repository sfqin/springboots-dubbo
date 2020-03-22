package com.example.dubboserviceone.service.dubbo;

import com.example.dubboserviceone.api.StringDubboService;
import com.example.dubboserviceone.vo.UserInfoVo;
import org.apache.dubbo.config.annotation.Service;

@Service
public class StringDubboServiceImpl implements StringDubboService {


    @Override
    public String getHelloStr(UserInfoVo userInfoVo) {

        if(userInfoVo == null){
            return null;
        }
        return "hello " + "来自" + userInfoVo.getAddress() +"的" + userInfoVo.getUserName() + "!";
    }
}
