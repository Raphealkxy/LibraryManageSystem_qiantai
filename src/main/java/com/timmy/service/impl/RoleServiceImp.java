package com.timmy.service.impl;

import com.timmy.mapper.ItemsRoleMapper;
import com.timmy.mapper.RoleMapper;
import com.timmy.po.ItemResource;
import com.timmy.po.ItemsRole;
import com.timmy.po.Role;
import com.timmy.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImp implements RoleService {

   @Autowired
    private RoleMapper roleMapper;
   @Autowired
   private ItemsRoleMapper itemsRoleMapper;
    @Override
    public Role getRoleById(Long id) throws Exception {

        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int getRoleCount() throws Exception {
        return itemsRoleMapper.getRoleCount() ;
    }

    @Override
    public PageBean<ItemsRole> getPageList(int currentPage) throws Exception {
        PageBean<ItemsRole> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getRolePageList");

        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemsRoleMapper.getRoleCount();
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
        List<ItemsRole> roles=itemsRoleMapper.pagedQuery(begin,PageSize);
        pageBean.setList(roles);
        return pageBean;
    }

    @Override
    public void deleteRole(Long id) throws Exception {
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Role> getRole(String name) throws Exception {
        return itemsRoleMapper.getRoleByName(name);
    }

    @Override
    public int insertRole(Role role) throws Exception {
        return roleMapper.insert(role);
    }

    @Override
    public void updateRole(Role role) throws Exception {
         roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public List<ItemsRole> getAllRoles() throws Exception {
        return itemsRoleMapper.getAllRoles();
    }

    @Override
    public List<ItemsRole> getRoleByDescription(String rolekind) throws Exception {
        return itemsRoleMapper.getRoleByDesription(rolekind);
    }
}
