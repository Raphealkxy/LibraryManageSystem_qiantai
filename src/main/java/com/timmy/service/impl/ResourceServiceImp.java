package com.timmy.service.impl;

import com.timmy.mapper.ItemResourceMapper;
import com.timmy.mapper.ResourceMapper;
import com.timmy.po.ItemBook;
import com.timmy.po.ItemResource;
import com.timmy.po.Resource;
import com.timmy.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ResourceServiceImp implements ResourceService {


    @Autowired
    private ResourceMapper resourceMapper;

    @Autowired
    private ItemResourceMapper itemResourceMapper;
    @Override
    public Resource getResourceById(Long id) throws Exception {
        return resourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer getResourceCount() throws Exception {
        return itemResourceMapper.getResourcecount();
    }

    @Override
    public PageBean<ItemResource> getPageList(int currentPage) throws Exception {
        PageBean<ItemResource> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getResourcePageList");

        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemResourceMapper.getResourcecount();
        pageBean.setTotalCount(total);
        //设置每页显示的记录数
        int PageSize=9;
        int totalPage=0;
        if(total%PageSize==0)
        {
            totalPage=total/PageSize;
        }else {
            totalPage=total/PageSize+1;
        }
        pageBean.setTotalCount(total);
        pageBean.setTotalPage(totalPage);
        //每页查询list集合
        int begin = (currentPage-1)*PageSize;
        List<ItemResource> resources=itemResourceMapper.pagedQuery(begin,PageSize);
        pageBean.setList(resources);
        return pageBean;
    }

    @Override
    public void deleteResource(Long id) {
        resourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer registerResource(Resource resource) {
        return resourceMapper.insert(resource);
    }

    @Override
    public List<Resource> getResource(String name) {
        return itemResourceMapper.getResourceByName(name);
    }

    @Override
    public int updateResource(Resource resource) {
        return resourceMapper.updateByPrimaryKey(resource);
    }
}
