package com.zery.blog.service;

import com.zery.blog.model.Menu;

import java.util.List;

/**
 * Created by Administrator on 2017/1/4.
 */
public interface IMenuService {

    List<Menu> queryMenus();
    Menu getMenuById(String id);
}
