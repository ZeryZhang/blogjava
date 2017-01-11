package com.zery.blog.controller;

import com.zery.blog.model.Menu;
import com.zery.blog.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IMenuService menuService;

    @RequestMapping("/index")
    public String index()
    {
       // IMenuService menuService = new MenuService();
        List<Menu> menus =  menuService.queryMenus();
        ModelAndView model = new ModelAndView();
        model.addObject("menuName",)
        return "home" ;
    }
}
