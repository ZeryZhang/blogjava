package com.zery.blog.controller;

import com.zery.blog.model.Menu;
import com.zery.blog.service.impl.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Resource
    private MenuService menuService;

    @RequestMapping("/index")
    public String index()
    {
        List<Menu> menus =  menuService.queryMenus();
        return "index" ;
    }
}
