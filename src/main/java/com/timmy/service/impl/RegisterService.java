package com.timmy.service.impl;

import com.timmy.po.ItemsUser;
import com.timmy.po.Resource;
import com.timmy.po.User;

import java.util.List;

public interface RegisterService {


    /**
     * 查询用户名是否已经存在
     */

    public List<ItemsUser> checkUsername(String username) throws Exception;

    /**
     * 把提交的数据插进数据库
     */

    public int registerUser(User user) throws Exception;

    /**
     * 查询邮箱是否已经被使用
     * @param email
     * @return
     * @throws Exception
     */
    public List<ItemsUser>checkEmail(String email) throws Exception;

    /**
     * 查询手机是否已经被使用
     * @param phone
     * @return
     * @throws Exception
     */
    public List<ItemsUser>checkPhone(String phone) throws Exception;

    /**
     * 用户激活
     * @param code
     * @return
     * @throws Exception
     */
    public List<ItemsUser>userActive(String code) throws Exception;


    public int updateUser(User user) throws Exception;


}
