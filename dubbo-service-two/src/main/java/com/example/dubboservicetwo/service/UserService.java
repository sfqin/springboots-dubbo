package com.example.dubboservicetwo.service;

public interface UserService {

    /**
     * 根据 userName say hello
     * @param userName
     * @return
     */
    String sayHello(String userName);

    /**
     * 用于 jmh 对照
     * @param userName
     * @return
     */
    String sayHelloV2(String userName);

}
