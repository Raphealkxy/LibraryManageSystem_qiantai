package com.timmy.service.impl;

import com.timmy.po.ItemCategory;

import java.util.List;

public interface CategoryService {

    /**
     * 查询目录条目
     */

    public List<ItemCategory> queryCategory() throws Exception;

    /**
     * 根据id号查询书籍分类
     * @param cid
     * @return
     * @throws Exception
     */
    public ItemCategory queryCategoryById(int cid)throws Exception;

    public ItemCategory queryCategoryByName(String name) throws Exception;
}
