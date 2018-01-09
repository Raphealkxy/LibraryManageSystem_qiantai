package com.timmy.service.impl;

import com.timmy.po.ItemsUser;
import com.timmy.po.User;
import com.timmy.utils.PageBean;
import com.timmy.utils.ParaBean;
import com.timmy.utils.UserParaBean;
import com.timmy.utils.UserqueryVo;

import java.util.List;

public interface LoginService {

    /**
     * 登陆
     */
    public List<ItemsUser> UserLogin(String username) throws Exception;

    /**
     *更新用户状态
     * @param user
     * @return
     * @throws Exception
     */
    public int updateUser(User user) throws Exception;


    /**
     * 获取用户的数量
     * @return
     * @throws Exception
     */
    public int getUserCount() throws Exception;

    /**
     * 获取用户列表
     * @param currentPage
     * @return
     * @throws Exception
     */
    public PageBean getUsers(int currentPage) throws Exception;

    /**
     * 删除用户
     * @param i
     * @return
     * @throws Exception
     */
    public void deleteUser(int i) throws Exception;

    public ItemsUser getUser(int uid) throws Exception;


    /**
     * 获取模糊查询的用户的数量
     */
    public int getSomeUserCount(String name) throws Exception;

    /**
     * 获取模糊查询的用户
     */

    public PageBean getSomeUser(String name,int currentPage) throws Exception;

    public ItemsUser getUserByName(String name)throws Exception;

    User getUserByNameAndPassword(UserqueryVo userqueryVo) throws Exception;
}
