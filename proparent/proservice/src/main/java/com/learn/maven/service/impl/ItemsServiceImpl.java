package com.learn.maven.service.impl;

import com.learn.maven.dao.ItemsDao;
import com.learn.maven.domain.Items;
import com.learn.maven.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author coderChenMing
 * @create 2021-03-22-11:55
 * @description service实现类
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(Integer id) {

        return itemsDao.findById(id);
    }
}
