package com.url.service;

import com.url.modle.System;

import java.util.List;

/**
 * 系统服务接口
 * @author YI
 * @data 2018-4-14 13:10:16
 */
public interface SystemService {
    List<System> getAll();

    System getOne(Long id);

    void insert(System system);

    Integer update(System system);

    void delete(Long id);
}
