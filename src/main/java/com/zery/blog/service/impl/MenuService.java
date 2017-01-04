package com.zery.blog.service.impl;

import com.zery.blog.dao.MenuDao;
import com.zery.blog.model.Menu;
import com.zery.blog.service.IMenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
@Service
public class MenuService implements IMenuService{

    @Resource
    private MenuDao menuDao;

    public List<Menu> queryMenus() {
        return menuDao.queryMenus();
    }

    public Menu getMenuById(String id) {
        return menuDao.getMenuById(id);
    }
}
