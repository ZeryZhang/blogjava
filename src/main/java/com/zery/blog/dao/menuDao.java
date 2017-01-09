package com.zery.blog.dao;

import com.zery.blog.model.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
//编译时忽略所有信息
   @Repository
public  class MenuDao{

    public List<Menu> queryMenus()
    {
        return new ArrayList<Menu>();

    }

    public Menu getMenuById(String id)
    {
        return new Menu();
    }

}
