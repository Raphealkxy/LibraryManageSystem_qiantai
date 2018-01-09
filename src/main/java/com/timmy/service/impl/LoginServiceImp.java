package com.timmy.service.impl;

import com.timmy.mapper.ItemsUserMapper;
import com.timmy.mapper.UserMapper;
import com.timmy.po.ItemsBook;
import com.timmy.po.ItemsUser;
import com.timmy.po.User;
import com.timmy.utils.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginServiceImp implements LoginService {

    @Autowired
    private ItemsUserMapper itemsUserMapper;

    @Autowired
    private UserMapper userMapper;
    public List<ItemsUser> UserLogin(String username) throws Exception {
        return itemsUserMapper.userLogin(username);
    }


    public int updateUser(User user) throws Exception {
        return userMapper.updateByPrimaryKey(user);
    }

    public int getUserCount() throws Exception {
        return itemsUserMapper.getUserCount();
    }

    public PageBean getUsers(int currentPage) throws Exception {
        PageBean<ItemsUser> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getUsers");

        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemsUserMapper.getUserCount();
        pageBean.setTotalCount(total);
        //设置每页显示的记录数
        int PageSize=8;
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
        List<ItemsUser> itemsUsers=itemsUserMapper.getUsers(begin,PageSize);
        pageBean.setList(itemsUsers);
        return pageBean;
    }

    public void deleteUser(int i) throws Exception {
         userMapper.deleteByPrimaryKey(i);
    }

    public ItemsUser getUser(int uid) throws Exception {
        return itemsUserMapper.getUser(uid);
    }

    public int getSomeUserCount(String name) throws Exception {
        return itemsUserMapper.getSomeUserCount(name);
    }



    public PageBean getSomeUser(String name,int currentPage) throws Exception {
        PageBean<ItemsUser> pageBean =new PageBean();
        //设置功能标识
        pageBean.setType("getSomeUser");
        pageBean.setQueryChar(name);
        //设置当前页
        pageBean.setCurrentPage(currentPage);
        //查询数据得到的总数
        int total=  itemsUserMapper.getSomeUserCount(name);
        pageBean.setTotalCount(total);
        //设置每页显示的记录数
        int PageSize=8;
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
        BookInfoQueryVo bookInfoQueryVo=new BookInfoQueryVo();
        ParaBean paraBean=new ParaBean();
        paraBean.setPageSize(PageSize);
        paraBean.setBegin(begin);
        paraBean.setName(name);
        bookInfoQueryVo.setParaBean(paraBean);
        List<ItemsUser> itemsUsers=itemsUserMapper.getSomeUser(bookInfoQueryVo);
        pageBean.setList(itemsUsers);
        return pageBean;

    }

    public ItemsUser getUserByName(String name) throws Exception {
        return itemsUserMapper.getUserByName(name);
    }

    public User getUserByNameAndPassword(UserqueryVo userqueryVo) throws Exception {
        return itemsUserMapper.getUserByNameAndPassword(userqueryVo);
    }
}
