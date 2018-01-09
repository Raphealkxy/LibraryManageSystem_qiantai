package com.timmy.mapper;

import com.timmy.po.ItemResource;
import com.timmy.po.Resource;
import com.timmy.po.ResourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemResourceMapper {

    /**
     * 获取资源数量
     */
    public Integer getResourcecount() throws Exception;

    List<ItemResource> pagedQuery(int begin, int pageSize);

    List<Resource> getResourceByName(String name);
}