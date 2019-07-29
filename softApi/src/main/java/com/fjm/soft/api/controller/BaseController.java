package com.fjm.soft.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fongjinming
 * @CreateTime: 2019-07-29 15:55
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class BaseController {

    @GetMapping("/hello")
    @ResponseBody
    String helloTest(){
        return "success";
    }
}
