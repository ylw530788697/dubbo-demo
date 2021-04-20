package com.evan.consumer.controller;

import com.evan.api.UserApi;
import com.evan.consumer.common.Response;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/4/20 20:14
 */
@RestController
public class UserController {
    @Reference
    private UserApi userApi;

    @GetMapping("/user")
    //@ApiOperation(value = "营销兑换码模块-查询兑换码列表", notes = "", httpMethod = "POST")
    public Response<String> user(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return Response.ok(userApi.getUser());
    }
}
