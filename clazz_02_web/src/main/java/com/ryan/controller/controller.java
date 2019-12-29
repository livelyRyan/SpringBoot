package com.ryan.controller;

import com.ryan.listener.MyHttpSessionListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class controller {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        // getSession方法当session不存在时候就会创建，然后被MyHttpSessionListener监听到，online++
        HttpSession session = request.getSession(true);
        return "login success";
    }

    @RequestMapping("online")
    @ResponseBody
    public String online(){
        return "当前在线人数："+ MyHttpSessionListener.online +"人";
    }

}
