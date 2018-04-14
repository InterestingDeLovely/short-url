package com.url.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/page/main")
    public String main(){
        return "page/main";
    }

    @RequestMapping("page/news/newsList")
    public String newsList(){
        return "page/news/newsList";
    }

    @RequestMapping("page/user/allUsers")
    public String allUsers(){
        return "page/user/allUsers";
    }

    @RequestMapping("page/img/images")
    public String images(){
        return "page/img/images";
    }

    @RequestMapping("page/message/message")
    public String message(){
        return "page/message/message";
    }

    @RequestMapping("page/user/changePwd")
    public String changePwd(){
        return "page/user/changePwd";
    }

    @RequestMapping("page/login/login")
    public String login(){
        return "page/login/login";
    }

    @RequestMapping("page/user/userInfo")
    public String userInfo(){
        return "page/user/userInfo";
    }

    @RequestMapping("page/links/linksList")
    public String linksList(){
        return "page/links/linksList";
    }

    @RequestMapping("page/systemParameter/systemParameter")
    public String systemParameter(){
        return "page/systemParameter/systemParameter";
    }

    @RequestMapping("page/message/messageReply")
    public String messageReply(){
        return "page/message/messageReply";
    }
}
