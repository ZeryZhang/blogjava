package com.zery.blog.service;

import com.zery.blog.dao.MenuDao;
import com.zery.blog.mapper.MenuMapper;
import com.zery.blog.model.Menu;
import com.zery.blog.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
@Service
public class MenuService implements IMenuService {


    @Autowired
    private MenuMapper mapper;

    public List<Menu> queryMenus() {
        List<Menu> lists = mapper.queryMenus();

        return lists;
    }

    public Menu getMenuById(String id) {
        return mapper.getMenuById(id);
    }
}
