package com.url.service.impl;

import com.url.dao.SystemDao;
import com.url.modle.System;
import com.url.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统服务了实现
 * @author YI
 * @data 2018-4-14 13:11:30
 */
@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    SystemDao systemDao;

    @Override
    public List<System> getAll() {
        return systemDao.getAll();
    }

    @Override
    public System getOne(Long id) {
        return systemDao.getOne(id);
    }

    @Override
    public void insert(System system) {
        systemDao.insert(system);
    }

    @Override
    public Integer update(System system) {
        return systemDao.update(system);
    }

    @Override
    public void delete(Long id) {
        systemDao.delete(id);
    }
}
