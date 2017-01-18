package com.zery.blog.controller;

import com.zery.blog.model.Menu;
import com.zery.blog.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
    public String   index(Model model) {
        List<Menu> menus = menuService.queryMenus();
        model.addAttribute("menuList",menus);

        return "home";
    }

    @RequestMapping("/program")
    public String program()
    {
        return "program/index";
    }


}
