package com.learn.maven.dao;

import com.learn.maven.domain.Items;

/**
 * @author coderChenMing
 * @create 2021-03-22-11:14
 * @description dao层
 */
public interface ItemsDao {

     Items findById(Integer id);

}
