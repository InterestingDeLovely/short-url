package com.url.service;

import com.url.modle.NewsList;
import com.url.modle.SinaShortUrl;

/**
 * 新浪短链接接口
 * @author YI
 * @date 2018-4-11 19:33:44
 */
public interface SinaShortUrlService {
    /**
     * 通过新浪获取短链接
     * @param newsList
     * @return
     */
    SinaShortUrl getShortUrl(NewsList newsList);
}
