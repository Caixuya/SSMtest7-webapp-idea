package com.thxy.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class IndexController {
//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        System.out.println("hello,SpringMVC!");
//        return new ModelAndView("index");
//    }
    private Logger logger=Logger.getLogger(IndexController.class);

    @RequestMapping("/index")
    public String index(){
        logger.info("hello,SpringMVC!");
        return "index";
    }
}
