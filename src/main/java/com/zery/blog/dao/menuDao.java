package com.zery.blog.dao;

import com.zery.blog.model.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */
//编译时忽略所有信息

 @Repository
public  interface MenuDao{

    List<Menu> queryMenus();
    Menu getMenuById(@Param("id") String id);


}
