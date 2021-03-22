package com.learn.maven.domain;

import com.learn.maven.dao.ItemsDao;
import com.learn.maven.service.ItemsService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coderChenMing
 * @create 2021-03-22-11:37
 * @description 单元测试类
 */
public class ItemsTest {
    @Test
    public void testDao() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //拿到dao的代理对象
        ItemsDao itemsDao = app.getBean(ItemsDao.class);

        Items items = itemsDao.findById(1);
        System.out.println(items);

    }

    @Test
    public void testService() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //拿到dao的代理对象
        ItemsService itemsService = app.getBean(ItemsService.class);

        Items items = itemsService.findById(2);
        System.out.println(items);
    }
}
