package com.url.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图管理器
 * @author YI
 * @date 2018-4-16 09:41:44
 */
@Controller
public class ViewController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 主界面
     * @return
     */
    @RequestMapping("/page/main")
    public String main(){
        return "page/main";
    }

    /**
     * 短链接页面
     * @return
     */
    @RequestMapping("page/news/newsList")
    public String newsList(){
        return "page/news/newsList";
    }

    /**
     * 添加短链接
     * @return
     */
    @RequestMapping("page/news/newsAdd")
    public String newsAdd(){
        return "generateShortUrl";
    }

    /**
     * 所有用户页面
     * @return
     */
    @RequestMapping("page/user/allUsers")
    public String allUsers(){
        return "page/user/allUsers";
    }

    /**
     * 用户头像页面
     * @return
     */
    @RequestMapping("page/img/images")
    public String images(){
        return "page/img/images";
    }

    /**
     * 留言页面
     * @return
     */
    @RequestMapping("page/message/message")
    public String message(){
        return "page/message/message";
    }

    /**
     * 留言回复页面
     * @return
     */
    @RequestMapping("page/message/messageReply")
    public String messageReply(){
        return "page/message/messageReply";
    }

    /**
     * 找回密码
     * @return
     */
    @RequestMapping("page/user/changePwd")
    public String changePwd(){
        return "page/user/changePwd";
    }

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("page/login/login")
    public String login(){
        return "page/login/login";
    }

    /**
     * 用户信息页面
     * @return
     */
    @RequestMapping("page/user/userInfo")
    public String userInfo(){
        return "page/user/userInfo";
    }

    /**
     * 友情链接页面
     * @return
     */
    @RequestMapping("page/links/linksList")
    public String linksList(){
        return "page/links/linksList";
    }

    /**
     * 系统参数
     * @return
     */
    @RequestMapping("page/systemParameter/systemParameter")
    public String systemParameter(){
        return "page/systemParameter/systemParameter";
    }
}
