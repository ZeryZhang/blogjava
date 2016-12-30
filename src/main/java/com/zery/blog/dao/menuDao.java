package com.zery.blog.dao;

import com.zery.blog.pojo.menuPo;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Administrator on 2016/12/30.
 */
//编译时忽略所有信息
@SuppressWarnings("all")
public class menuDao extends JdbcDaoSupport{

    public Collection<menuPo> queryMenus()
    {
        String sql="select * from Menus";
        return super.getJdbcTemplate().query(sql, new RowMapper<menuPo>() {
            public menuPo mapRow(ResultSet resultSet, int i) throws SQLException {
                menuPo menu = new menuPo();
                menu.setId(resultSet.getString("Id"));
                menu.setMenuName(resultSet.getString("MenuName"));
                menu.setMenuCode(resultSet.getString("MenuCode"));
                menu.setMenuUrl(resultSet.getString("MenuUrl"));
                return menu;
            }
        });


    }


}
