package com.learn.maven.controller;

import com.learn.maven.domain.Items;
import com.learn.maven.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author coderChenMing
 * @create 2021-03-22-12:31
 * @description web层
 */
@Controller/*交给spring容器管理*/
@RequestMapping("/items")/*全局路径*/
public class ItemsController {

    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findDetail")
    public String findDetail(Model model) {

        Items items = itemsService.findById(2);
        model.addAttribute("items",items);
        return "ItemsDetail";
    }

}
