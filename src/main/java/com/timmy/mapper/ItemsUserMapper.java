package com.timmy.mapper;

import com.timmy.po.ItemsUser;
import com.timmy.po.User;
import com.timmy.utils.BookInfoQueryVo;
import com.timmy.utils.UserParaBean;
import com.timmy.utils.UserqueryVo;

import java.util.List;

public interface ItemsUserMapper {


    /**
     * 按用户名查询
     * @param username
     * @return
     * @throws Exception
     */
    List<ItemsUser>checkUsername(String username) throws Exception;

    /**
     * 按邮箱查询
     * @param email
     * @return
     * @throws Exception
     */
    List<ItemsUser>checkEmail(String email) throws Exception;


    /**
     * 按手机查询
     * @param phone
     * @return
     * @throws Exception
     */
    List<ItemsUser>checkPhone(String phone) throws Exception;

    /**
     * 查询激活码
     * @param code
     * @return
     * @throws Exception
     */
    List<ItemsUser>userActive(String code) throws Exception;

    /**
     * 用户登录验证
     * @param username
     * @return
     * @throws Exception
     */
    List<ItemsUser>userLogin(String username) throws Exception;

    /**
     * 获取用户的总数
     * @return
     * @throws Exception
     */
    int getUserCount() throws Exception;

    /**
     * 获取用户列表
     * @param begin
     * @param PageSize
     * @return
     * @throws Exception
     */
    List<ItemsUser>getUsers(int begin, int PageSize) throws Exception;

    /**
     * 获取某个用户的信息
     * @param uid
     * @return
     * @throws Exception
     */
    ItemsUser getUser(int uid) throws Exception;


    /**
     * 获取用户模糊查询的数量
     */
   int getSomeUserCount(String name) throws Exception;
    /**
     * 获取用户模糊查询列表
     */

    List<ItemsUser>getSomeUser(BookInfoQueryVo bookInfoQueryVo) throws Exception;

    ItemsUser getUserByName(String name) throws Exception;


    User getUserByNameAndPassword(UserqueryVo userqueryVo) throws Exception;

}
