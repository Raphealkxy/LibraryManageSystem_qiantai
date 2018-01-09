package com.timmy.service.impl;

import com.timmy.mapper.ItemCategoryMapper;
import com.timmy.po.ItemCategory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImp implements CategoryService {

    @Autowired
    private ItemCategoryMapper itemCategoryMapper;
    public List<ItemCategory> queryCategory() throws Exception {
        return itemCategoryMapper.queryCategory();
    }

    public ItemCategory queryCategoryById(int cid) throws Exception {
        return itemCategoryMapper.queryCategoryById(cid);
    }

    public ItemCategory queryCategoryByName(String name) throws Exception {
        return itemCategoryMapper.queryCategoryByName(name);
    }
}
