package com.kuang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 只要实现了controller接口的类，就是一个控制器
 * @author caoweiquan
 * @date 2021/3/6
 */
public class ControllerTest1 implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "controllerDemo");
        mv.setViewName("test");
        return mv;
    }
}
