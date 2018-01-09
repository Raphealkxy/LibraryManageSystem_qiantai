package com.timmy.mapper;

import com.timmy.po.User;

import java.util.List;

public interface CheckUserBorrowBooksMapper {

/**
 * 根据用户的id查询所借书籍记录
 */

public List<User>getBorrowList(int uid) throws Exception;
}
