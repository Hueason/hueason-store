package com.hueason.console.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * DESCRIPTION
 *
 * @Author hueason
 * @create 2017-06-24 16:20
 */
@Controller
@Configuration
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/haha")
    public String index2() {
        System.out.println("haha");
        return "haha";
    }

    @RequestMapping(value = "/product/toproduct")
    public String toproduct() {
        return "jqgrid";
    }

    @RequestMapping(value = "/product/list")
    public
    @ResponseBody
    String list(String page, String rows, String sidx, String sord, Model model) {

        System.out.println(page);
        return null;
    }
}
