package com.url.controller;

import com.url.modle.Result;
import com.url.modle.SinaShortUrl;
import com.url.modle.Url;
import com.url.service.SinaShortUrlService;
import com.url.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * url生成
 * @author YI
 * @date 2018-4-16 11:49:32
 */
@Controller
@RequestMapping("/")
public class UrlController {
    @Autowired
    UrlService urlService;
    @Autowired
    SinaShortUrlService sinaShortUrlService;

    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @GetMapping("/{id}")
    public String redirect(@PathVariable("id") String id) {
        Url u = urlService.getUrl(id);
        if(u==null){
            return "/404";
        }
        return "redirect:"+u.getUrl();
    }

    @PostMapping("/getShortUrl")
    @ResponseBody
    public Result getShortUrl(Url url){

        String urls = urlService.saveUrl(url);
        return Result.OK(urls);
    }

    @PostMapping("/getSinaShortUrl")
    @ResponseBody
    public Result getSinaShortUrl(String url){

        SinaShortUrl shortUrl = sinaShortUrlService.getShortUrl(url);
        return Result.OK(shortUrl.getUrls().get(0).getUrl_short());
    }

}
