package com.timmy.service.impl;

import com.timmy.po.ItemsRole;
import com.timmy.po.Role;
import com.timmy.utils.PageBean;

import java.util.List;

public interface RoleService {

    public Role getRoleById(Long id) throws Exception;

    public int getRoleCount() throws Exception;

    public  PageBean<ItemsRole> getPageList(int currentPage) throws Exception;

    public void deleteRole(Long id) throws Exception;

    public List<Role> getRole(String name) throws Exception;

    public int insertRole(Role role) throws Exception;

    public void updateRole(Role role) throws Exception;

    public List<ItemsRole> getAllRoles() throws Exception;

    public List<ItemsRole> getRoleByDescription(String rolekind) throws Exception;
}
