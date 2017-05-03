package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/30.
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
}
