package com.evan.consumer.controller;

import com.evan.api.HelloWorldApi;
import com.evan.consumer.common.Response;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/04/18 17:27
 */
@RestController
public class HelloWorldController {
    @Reference
    private HelloWorldApi helloWorldApi;


    @GetMapping("/hello")
    @ApiOperation(value = "营销兑换码模块-查询兑换码列表", notes = "", httpMethod = "POST")
    public Response<String> queryCodelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return Response.ok(helloWorldApi.hello());
    }
}
