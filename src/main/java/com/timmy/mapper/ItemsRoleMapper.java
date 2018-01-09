package com.timmy.mapper;

import com.timmy.po.ItemsRole;
import com.timmy.po.Role;
import com.timmy.po.RoleExample;
import com.timmy.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsRoleMapper {
       public int getRoleCount() throws Exception;


        public List<ItemsRole> pagedQuery(int begin, int pageSize);

        public List<Role> getRoleByName(String name) throws Exception;

        public List<ItemsRole> getAllRoles() throws Exception;

        public List<ItemsRole> getRoleByDesription(String rolekind) throws Exception;
}