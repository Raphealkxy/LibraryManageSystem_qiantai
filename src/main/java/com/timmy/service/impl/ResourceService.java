package com.timmy.service.impl;

import com.timmy.po.ItemResource;
import com.timmy.po.Resource;
import com.timmy.utils.PageBean;

import java.util.List;

public interface ResourceService {

    /**
     * 根据id找资源
     * @param id
     */
    public Resource getResourceById(Long id) throws Exception;

    /**
     * 获取资源数量
     * @return
     * @throws Exception
     */
    public Integer getResourceCount() throws Exception;

    public PageBean<ItemResource> getPageList(int currentPage) throws Exception;

    public void deleteResource(Long id);

    public Integer registerResource(Resource resource);

    public List<Resource> getResource(String name);

    public int updateResource(Resource resource);
}
