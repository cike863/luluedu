package com.luluwanlong.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description: main
 * @Author: zhoulong
 * @Date: 2018/5/5 14:23
 */
@Controller
public class MainController {
    /**
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
