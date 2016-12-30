package com.zery.blog.pojo;

/**
 * Created by Administrator on 2016/12/30.
 */
public class menuPo {
    private  String id;
    private  String menuName;
    private  String menuCode;
    private  String menuUrl;
    private  Boolean isDelete;

    public void setId(String id)
    {
      this.id = id;
    }
    public String getId()
    {
        return this.id;
    }

    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }
    public String getMenuName()
    {
        return menuName;
    }

    public void setMenuCode(String menuCode)
    {
        this.menuCode = menuCode;
    }
    public String getMenuCode()
    {
        return menuCode;
    }


    public void setMenuUrl(String menuUrl)
    {
        this.menuUrl = menuUrl;
    }
    public String getMenuUrl()
    {
        return menuUrl;
    }

    public void setIsDelete(Boolean isDelete)
    {
        this.isDelete = isDelete;
    }
    public Boolean getIsDelete()
    {
        return isDelete;
    }
}
