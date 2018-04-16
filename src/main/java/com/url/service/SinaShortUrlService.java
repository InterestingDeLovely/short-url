package com.url.service;

import com.url.modle.SinaShortUrl;

/**
 * 新浪短链接接口
 * @author YI
 * @date 2018-4-11 19:33:44
 */
public interface SinaShortUrlService {
    SinaShortUrl getShortUrl(String longUrl);
}
