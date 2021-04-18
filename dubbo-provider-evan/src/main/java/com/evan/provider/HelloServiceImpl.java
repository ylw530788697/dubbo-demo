package com.evan.provider;

import com.evan.api.HelloWorldApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/04/18 17:29
 */
@Service(timeout = 1000)
public class HelloServiceImpl implements HelloWorldApi {
    @Override
    public String hello() {
        return "hello world dubbo provider";
    }
}
