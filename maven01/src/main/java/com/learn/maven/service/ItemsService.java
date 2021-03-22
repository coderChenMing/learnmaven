package com.learn.maven.service;

import com.learn.maven.domain.Items;

/**
 * @author coderChenMing
 * @create 2021-03-22-11:54
 * @description service接口
 */
public interface ItemsService {
    Items findById(Integer id);
}
