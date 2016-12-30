package com.zery.blog.service;

import com.zery.blog.dao.menuDao;
import com.zery.blog.pojo.menuPo;

import java.util.Collection;

/**
 * Created by Administrator on 2016/12/30.
 */
public class menuService {
    menuDao  dao = new menuDao();

    public Collection<menuPo> queryMenu()
    {
            return dao.queryMenus();
    }
}
