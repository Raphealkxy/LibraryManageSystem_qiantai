package com.timmy.mapper;

import com.timmy.po.Category;
import com.timmy.po.CategoryExample;
import com.timmy.po.ItemCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.executor.Executor;

import java.util.List;

public interface ItemCategoryMapper {
    /**
     * 查询所有目录条目
     */
    List<ItemCategory>queryCategory() throws Exception;

    /**
     * 根据id查询书籍分类名
     */
    ItemCategory queryCategoryById(int cid)throws Exception;

     ItemCategory queryCategoryByName(String name) throws Exception;
}