package com.zery.blog.controller;

import com.zery.blog.pojo.menuPo;
import com.zery.blog.service.menuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
@Controller
@RequestMapping("/home")
public class homeController {

    menuService service = new  menuService();
    @RequestMapping("/index")
    public String index()
    {

        Collection<menuPo> menus =  service.queryMenu();
        return "index" ;
    }



}
