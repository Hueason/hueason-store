package com.hueason.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DESCRIPTION
 *
 * @Author hueason
 * @create 2017-06-24 16:20
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/haha")
    public String index2(){
        System.out.println("haha");
        return "haha";
    }
}
