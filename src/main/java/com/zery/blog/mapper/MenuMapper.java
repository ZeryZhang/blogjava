package com.zery.blog.mapper;

import com.zery.blog.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
@Repository
public interface MenuMapper {
    public List<Menu> queryMenus();

    public Menu getMenuById(String id);
}
