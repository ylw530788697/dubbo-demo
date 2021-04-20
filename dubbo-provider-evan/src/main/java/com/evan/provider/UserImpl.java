package com.evan.provider;

import com.evan.api.UserApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/4/20 20:12
 */
@Service
public class UserImpl  implements UserApi {
    @Override
    public String getUser() {
        return "hello users";
    }
}
