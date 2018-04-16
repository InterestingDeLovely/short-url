package com.url.service;

import com.url.modle.Url;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/3014:50
 */
public interface UrlService {

    String saveUrl(Url url);

    Url getUrl(String id);

    String getSurl(String md5);

    void saveSurl(String md5, String id);
}
