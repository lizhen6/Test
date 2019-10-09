package com.lz.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李镇
 * @data 2018/11/17 14:55
 */
@Controller
public class HelloController {

    @RequestMapping("/xuanxuan")
    public String getHello(){
        System.out.println("11111");
        return "/love";
    }

    @RequestMapping("/lz")
    public String getLz(){
        System.out.println("222");
        return "/biaobai";
    }
    //gfiweyfwu
}
