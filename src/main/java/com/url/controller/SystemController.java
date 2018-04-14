package com.url.controller;

import com.url.modle.ResponMessage;
import com.url.modle.System;
import com.url.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 系统数据
 * @author YI
 * @data 2018-4-14 13:07:18
 */
@Controller
@RequestMapping("/system")
public class SystemController {
    @Autowired
    SystemService systemService;

    @RequestMapping("/getParameter")
    @ResponseBody
    public System getParameter(){
        System system = new System();
        List<System> systemList = systemService.getAll();

        if (systemList != null && systemList.size() > 0){
            system = systemList.get(0);
        }

        return system;
    }

    @RequestMapping("/updateSystemParameter")
    @ResponseBody
    public ResponMessage updateSystemParameter(@RequestBody System system){
        system.setId(1);
        Integer update = systemService.update(system);

        return new ResponMessage(update > 0 ? -1 : 1, "", "操作成功");
    }
}
